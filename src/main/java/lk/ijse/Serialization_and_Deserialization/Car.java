package lk.ijse.Serialization_and_Deserialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brand;
    private String model;
    private int year;


    public Car() {}


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', model='" + model + "', year=" + year + "}";
    }


}
