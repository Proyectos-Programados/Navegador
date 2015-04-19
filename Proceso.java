package threads;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static XMLReader.XMLReader.main;
import static XMLReader.XMLReader.readXML;

/**
 *
 * @author Juan Pablo Cubero
 */
public class Proceso extends Thread {
    
    public Proceso(String msg){
        
        super (msg); //Es necesario, siempre.
        
    }
     
      
    String lista[] = {"https://es.wikipedia.org/wiki","http://amazon.com","http://nacion.com","http://google.com"};
    LinkedList Trial = new LinkedList();
       
    @Override
    public void run()
    {       synchronized(this){
            for (int i=0; i<lista.length; i++){
                Trial.offer(lista[i]);
                System.out.println("En el " + this.getName() + " el offer da " + Trial);
            }
                
//        for (int i=1;i<=20;i++)
//            System.out.println("Iteracion #" + i + " en el " + this.getName());
            }
    
            synchronized (this){
            for (int x=0; x<lista.length; x++){
                Trial.remove();
                System.out.println("En el " + this.getName() + " el remove da" + Trial);
            }
                
            }

        }


    }
