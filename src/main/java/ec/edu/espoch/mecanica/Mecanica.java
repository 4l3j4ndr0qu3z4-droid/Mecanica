package ec.edu.espoch.mecanica;

public class Mecanica {

    public static void main(String[] args) {
        
        Car carOne = new Car();
        carOne.started();
        
        Car carTwo = new Car();
        carTwo.started();
        
        Person personOne = new Person();
        personOne.name = "Stalin, ";
        personOne.drive(true);
        
        Person personTwo = new Person();
        personTwo.name = "Messi, ";
        personTwo.drive(true);
        
        Person personThree = new Person();
        personThree.name = "Pepe, ";
        personThree.drive(true);
        
    }
}
