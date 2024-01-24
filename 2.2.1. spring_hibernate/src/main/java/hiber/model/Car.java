package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Column
    private String model;

    @Column
    private int series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;


    public Car() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return model + ' ' + series;
    }

}
