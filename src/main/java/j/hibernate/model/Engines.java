package j.hibernate.model;

import javax.persistence.Entity;
import java.util.Objects;

/*
* Class must be:
* 1) has empty Constructor;
* 2) Unique id;
* 3) has get/set;
* 4) not final.
 */

public class Engines {

    private String model;
    private int power;

    public Engines(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engines() {
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engines engines = (Engines) o;
        return power == engines.power &&
                Objects.equals(model, engines.model);
    }

    @Override
    public int hashCode() {
        int result=super.hashCode();
        return  31*result+model.hashCode();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
