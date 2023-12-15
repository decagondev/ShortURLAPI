package shortner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import shortner.entities.Hello;
import shortner.repositories.HelloRepository;

import java.util.List;

@Service
public class HelloService {
    @Autowired
    HelloRepository helloRepository;
    public String greeting() {
        return "Hello from the service";
    }

    private String ggenerateShortURL() {
        return "34234wef2w";
    }

    public Hello save(Hello hello) {
        hello.setGreeting(hello.getGreeting() + " i am a fish");
        return helloRepository.save(hello);
    }

    public List<Hello> findAll() {
        return helloRepository.findAll();
    }

    public String delete(Long id) {
        Hello helloToDelete =  helloRepository.findById(id).get();
        helloRepository.delete(helloToDelete);
        return "Successfully Deleted: " + id;
    }
}
