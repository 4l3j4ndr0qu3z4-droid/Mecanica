package ec.edu.espoch.mecanica;

    /**
 *
 * @author pc
 */
public class Car {
    public String color;
    public String brand;
    public String model;
    public boolean state;
    
    /*metodos*/
    public void started(){
        System.out.println("El carro esta encendido");
    }
    
    public void stopped(){
        
        System.out.println("El carro esta apagado");
    }
    
    public void accelerate(){
        
        System.out.println("acelerate");
    }
    
    public void brake(){
        
        System.out.println("frenaste");
    }
}
