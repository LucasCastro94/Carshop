package git.com.lucascastro94.carsshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends Exception {
    public CarNotFoundException(Long id) {
        super("Carro Não Localizado Com Id: "+id);
    }
}
