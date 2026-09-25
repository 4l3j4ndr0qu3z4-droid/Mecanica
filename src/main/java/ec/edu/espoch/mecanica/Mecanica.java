package ec.edu.espoch.mecanica;

public class Mecanica {

    public static void main(String[] args) {

        Person personOne = new Person(1,"Stalin"," Arias","2200650105",Gender.MASCULINO,18,DayBirth.LUNES);
        personOne.show();
        
        Car carOne = new Car("Red ", "Toyota", "Agya", true );
        carOne.show();
        
        personOne.drive(carOne);
        /*Car carOne = new Car();
        carOne.color = "Blanco";
        carOne.model = "fortune";
        carOne.brand= "Toyota";
        carOne.state = true;
        carOne.started();
        

        Car carTwo = new Car();
        carTwo.started();*/

        
        
        
       /* Person personOne = new Person();
        personOne.name = "Stalin, ";
        

        Person personTwo = new Person();
        personTwo.name = "Lionel, ";
        
        Person personThree = new Person();
        personThree.name = "Pepe, ";
        
        personOne.age = 18;
        personOne.id = 1;
        personOne.card = "2200650105";
        personOne.lastName = "Arias ";
        personOne.gender = Gender.MASCULINO;
        personOne.dayBirth = DayBirth.LUNES;
        System.out.println("Year Birth: " + personOne.yearBirth(2026));
        personOne.show();
        personOne.drive(carOne);
        
        personTwo.age = 19;
        personTwo.id = 2;
        personTwo.card = "3020650105";
        personTwo.lastName = "Messi";
        personTwo.gender = Gender.MASCULINO;
        personTwo.dayBirth = DayBirth.JUEVES;
        personTwo.show();*/
        
        
    }
}
