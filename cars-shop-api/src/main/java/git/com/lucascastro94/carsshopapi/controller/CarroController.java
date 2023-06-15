package git.com.lucascastro94.carsshopapi.controller;

import git.com.lucascastro94.carsshopapi.dto.CarroDTO;
import git.com.lucascastro94.carsshopapi.exception.CarCreatingException;
import git.com.lucascastro94.carsshopapi.exception.CarNotFoundException;
import git.com.lucascastro94.carsshopapi.exception.PlateAlreadyExistException;
import git.com.lucascastro94.carsshopapi.model.Carro;
import git.com.lucascastro94.carsshopapi.services.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CarroDTO> listAll(){
      return carroService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carro create(@RequestBody @Valid CarroDTO carroDTO) throws CarCreatingException, PlateAlreadyExistException
    {
        return carroService.create(carroDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public long deleteById(@PathVariable Long id) throws CarNotFoundException
    {
       return carroService.deleteById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Carro atualizar(@PathVariable Long id, @RequestBody CarroDTO carroDTO) throws CarNotFoundException
    {
        return carroService.atualizar(id,carroDTO);
    }

}
