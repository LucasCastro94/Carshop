package git.com.lucascastro94.carsshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class PlateAlreadyExistException extends Exception {
    public PlateAlreadyExistException(String placa){
        super(String.format("Placa Informada Ja Existe: %s ",placa));
    }
}
