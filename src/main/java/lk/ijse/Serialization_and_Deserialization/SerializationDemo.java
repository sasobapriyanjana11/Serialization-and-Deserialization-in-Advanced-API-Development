package lk.ijse.Serialization_and_Deserialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        String filename = "car.ser";

        // Serialize the Car object to a file
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(car);
            System.out.println("Serialized data is saved in - " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize the Car object from a file
        Car deserializedCar = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedCar = (Car) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Car class not found!");
            c.printStackTrace();
        }

        System.out.println("Deserialized Car: " + deserializedCar);
    }
}

/*
*
* ----------------Explanation of this code---------------------
Car Class- This class implements Serializable, which is a marker interface that allows the Java object to be serialized. It includes a serialVersionUID, which is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization.

SerializationDemo Class- This class demonstrates the serialization and deserialization process using Java's built-in mechanisms.

It first creates an instance of Car.
It then serializes this Car object to a file named car.ser.
Finally, it deserializes the object back from the file and prints the deserialized object.
* */
