package git.com.lucascastro94.carsshopapi.repository;

import git.com.lucascastro94.carsshopapi.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long> {

}
