package shortner.entities;

import jakarta.persistence.*;

@Entity
@Table(name="greetings")
public class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "greeting")
    private String greeting;

    public Hello() {
    }

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
