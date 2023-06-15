package git.com.lucascastro94.carsshopapi.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import git.com.lucascastro94.carsshopapi.dto.CarroDTO;
import git.com.lucascastro94.carsshopapi.exception.CarCreatingException;
import git.com.lucascastro94.carsshopapi.exception.CarNotFoundException;
import git.com.lucascastro94.carsshopapi.model.Carro;
import git.com.lucascastro94.carsshopapi.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public Carro create(CarroDTO carroDTO) throws CarCreatingException {
        Carro carro = objMapper.convertValue(carroDTO, Carro.class);
        carroRepository.save(carro);
        return carro;
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
