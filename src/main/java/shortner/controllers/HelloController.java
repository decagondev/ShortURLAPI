package shortner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shortner.entities.Hello;
import shortner.services.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping
    ResponseEntity<?> greet() {
        return ResponseEntity.ok(helloService.findAll());
    }

    @PostMapping
    ResponseEntity<?> createHello(@RequestBody Hello newHello) {
        return ResponseEntity.ok(helloService.save(newHello));
    }

    @DeleteMapping("{id}")
    String delete(@PathVariable Long id) {
        return helloService.delete(id);
    }
}
