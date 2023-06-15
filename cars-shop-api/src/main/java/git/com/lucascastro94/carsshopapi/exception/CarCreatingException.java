package git.com.lucascastro94.carsshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.ALREADY_REPORTED)
public class CarCreatingException extends RuntimeException{
   public CarCreatingException()
   {
       super("Erro ao Salvar o Objeto Carro");
   }
}
