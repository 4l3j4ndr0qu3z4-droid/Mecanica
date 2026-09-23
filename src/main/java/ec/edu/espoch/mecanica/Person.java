package ec.edu.espoch.mecanica;

public class Person {
    public int id;
    public String name;
    public String lastName;
    public String card;
    public Gender  gender;
    public byte age;
    
    public void show(){
        System.out.println("ID: "+  id);
        System.out.println("Name: "+  name);
        System.out.println("Last Name: "+  lastName);
        System.out.println("Card: "+  card);
        System.out.println("Gender: "+  gender);
        System.out.println("Age: "+  age);
    }
    
    
    
    public void drive(boolean state){
        if(state){
            System.out.println(name + "Puedes manejar");
        } else{
            System.out.println("Enciende el carro");
        }
    }

    public void getIn(){
        System.out.println("Ingresaste al carro");
    }

    public void getOut(){
        System.out.println("Saliste del carro");
    }
}
