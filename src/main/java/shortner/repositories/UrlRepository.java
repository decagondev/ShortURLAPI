package shortner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shortner.entities.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    public Url findByShortCode(String shortCode);
}
