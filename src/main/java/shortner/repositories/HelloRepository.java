package shortner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shortner.entities.Hello;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {

}
