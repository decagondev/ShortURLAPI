package shortner.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shortner")
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String originalURL;

    @Column
    String shortCode;

    public Url() {
    }

    public Url(String originalURL, String shortCode) {
        this.originalURL = originalURL;
        this.shortCode = shortCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }
}
