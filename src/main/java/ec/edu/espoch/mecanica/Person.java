package ec.edu.espoch.mecanica;

public class Person {
    public String name;
    public byte age;
    
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
