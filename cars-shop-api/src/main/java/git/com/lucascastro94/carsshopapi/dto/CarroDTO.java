package git.com.lucascastro94.carsshopapi.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@Data
public class CarroDTO {
    @NotBlank
    private String marca;
    @NotBlank
    private String modelo;
    @NotNull
    private int ano;
    @NotBlank
    @Length(min = 8,max = 8,message = "license plate needs 8 characters")
    private String placa;
    @NotNull
    private double valor;


}
