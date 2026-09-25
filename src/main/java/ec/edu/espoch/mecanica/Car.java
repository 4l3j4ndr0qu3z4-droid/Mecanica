package ec.edu.espoch.mecanica;

/**
 *
 * @author pc
 */
public class Car {

    public Car(String color, String brand, String model, boolean state) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.state = state;
    }

    public String color;
    public String brand;
    public String model;
    public boolean state;

    public void show() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("State: " + state);
        

    }

    /*metodos*/
    public void started() {
        System.out.println("El carro esta encendido");
    }

    public void stopped() {

        System.out.println("El carro esta apagado");
    }

    public void accelerate() {

        System.out.println("acelerate");
    }

    public void brake() {

        System.out.println("frenaste");
    }

}
