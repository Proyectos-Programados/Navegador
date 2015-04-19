package threads;

/**
 *
 * @author Juan Pablo Cubero
 */
public class Main {
    
    public static void main (String[] args){
        for (int num = 1; num<=20; num++ ){
            Thread hilo = new Proceso("Proceso " + num);
            hilo.start();
        }
//        Thread hilo = new Proceso("Proceso 1");
//        Thread hilo2 = new Proceso("Proceso 2");
//        Thread hilo3 = new Proceso("Proceso 3");
//        Thread hilo4 = new Proceso("Proceso 4");
        
//        hilo.start();
//        hilo2.start();
//        hilo3.start();
//        hilo4.start();
//          

    }
}
