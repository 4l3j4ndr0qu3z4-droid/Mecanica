package ec.edu.espoch.mecanica;

public class Person {

    public Person(int id, String name, String lastName, String card, Gender gender, int age, DayBirth dayBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.card = card;
        this.gender = gender;
        this.age =  age;
        this.dayBirth = dayBirth;
    }

    public Person() {
    }
    

    
    
    public int id;
    public String name;
    public String lastName;
    public String card;
    public Gender gender;
    public int age;
    public DayBirth dayBirth;

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Card: " + card);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    public void drive(Car car) {
        if (car.state) {
            System.out.println(name + "Puedes manejar "+ car.model + "que es de color "+ car.color);
        } else {
            System.out.println("Enciende el carro");
        }
    }

    public void getIn() {
        System.out.println("Ingresaste al carro");
    }

    public void getOut() {
        System.out.println("Saliste del carro");
    }

    public int yearBirth(int year) {
        int result = year - age;
        return result;
    }
}
