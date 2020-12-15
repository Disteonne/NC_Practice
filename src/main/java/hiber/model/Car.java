package hiber.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String mark;
    @Column
    private String model;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "model")
    private Engines engine;

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public Engines getEngine() {
        return engine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engines engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, engine);
    }
}
