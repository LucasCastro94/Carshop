package git.com.lucascastro94.carsshopapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "carro_sequence", initialValue = 2000)
    private Long id;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private int ano;
    @Column(unique = true)
    private String placa;
    @Column
    private double valor;
}
