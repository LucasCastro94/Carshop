package git.com.lucascastro94.carsshopapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CarCreatingException extends RuntimeException{
   public CarCreatingException()
   {
       super("Erro ao Salvar o objeto carro");
   }
}
