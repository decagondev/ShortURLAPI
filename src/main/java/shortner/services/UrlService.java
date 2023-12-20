package shortner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shortner.entities.Url;
import shortner.repositories.UrlRepository;

import java.security.SecureRandom;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepository;

    /**
     * Generate a Short Code
     * return a String of 8 characters (uppercase, lowercase, numbers)
     */
    private String generateShortCode() {
        final String ALLOWED_CHARS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        final SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARS.length());
            char c = ALLOWED_CHARS.charAt(randomIndex);
            sb.append(c);
        }
        return sb.toString();
    }

    public Url save(Url url) {
        String code = generateShortCode(); //  4Y4kBtIV
        url.setShortCode(code);
        return urlRepository.save(url);
    }

    public Url findByShortCode(String shortCode) {
        return urlRepository.findByShortCode(shortCode);
    }
}
