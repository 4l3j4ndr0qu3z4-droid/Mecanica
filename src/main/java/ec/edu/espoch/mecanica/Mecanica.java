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
        personTwo.name = "Lionel, ";
        personTwo.drive(true);
        
        Person personThree = new Person();
        personThree.name = "Pepe, ";
        personThree.drive(true);
        
        personOne.age = 18;
        personOne.id = 1;
        personOne.card = "2200650105";
        personOne.lastName = "Arias ";
        personOne.gender = Gender.MASCULINO;
        personOne.show();
        
        personTwo.age = 19;
        personTwo.id = 2;
        personTwo.card = "3020650105";
        personTwo.lastName = "Messi";
        personTwo.gender = Gender.MASCULINO;
        personTwo.show();
    }
}
