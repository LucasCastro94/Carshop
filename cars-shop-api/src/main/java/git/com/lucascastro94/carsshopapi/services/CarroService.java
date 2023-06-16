package git.com.lucascastro94.carsshopapi.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import git.com.lucascastro94.carsshopapi.dto.CarroDTO;
import git.com.lucascastro94.carsshopapi.exception.CarCreatingException;
import git.com.lucascastro94.carsshopapi.exception.CarNotFoundException;
import git.com.lucascastro94.carsshopapi.exception.PlateAlreadyExistException;
import git.com.lucascastro94.carsshopapi.model.Carro;
import git.com.lucascastro94.carsshopapi.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    private ObjectMapper objMapper = new ObjectMapper();

    public List<CarroDTO> listAll() {
        return carroRepository.findAll().
                stream().
                map(carro -> objMapper.convertValue(carro, CarroDTO.class)).toList();
    }

    public Carro create(CarroDTO carroDTO) throws CarCreatingException, PlateAlreadyExistException {

        Optional<Carro> aptCarro = carroRepository.findByPlaca(carroDTO.getPlaca());

        if(aptCarro.isPresent()){
            throw new PlateAlreadyExistException(carroDTO.getPlaca());
        }

        Carro carro = objMapper.convertValue(carroDTO, Carro.class);
        carroRepository.save(carro);
        return carro;
    }

    public CarroDTO findById(Long id) throws CarNotFoundException {
        Carro carroSaved = carroRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
        return objMapper.convertValue(carroSaved,CarroDTO.class);
    }



    public Long deleteById(Long id) throws CarNotFoundException {
        Carro carroSaved = carroRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
         carroRepository.deleteById(id);
        return id;
    }

    public Carro atualizar(Long id, CarroDTO carroDTO) throws CarNotFoundException {
        Carro carroSaved = carroRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));

        Carro carroAtt = objMapper.convertValue(carroDTO, Carro.class);
        carroAtt.setId(id);
        return carroRepository.save(carroAtt);
    }

}
