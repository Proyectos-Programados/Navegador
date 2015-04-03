package XMLReader;

//Works for creating a Liked List
import java.util.LinkedList;

// Class that will represent a system file name

import java.io.File;

// Triggered when an I/O error occurs

import java.io.IOException;

// Represents your XML document and contains useful methods

import org.jdom2.Document;

// Represents XML elements and contains useful methods

import org.jdom2.Element;

// Top level JDOM exception

import org.jdom2.JDOMException;

// Creates a JDOM document parsed using SAX Simple API for XML

import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Juan Pablo Cubero
 */

public class Cola {
    	public static int ID;
	public static LinkedList Copia;

        public static void main(String[] args) {		
		readXML();
	}
        
	public static void readXML(){

		SAXBuilder builder = new SAXBuilder();
		try {
			
			/**
                         * Parses the file supplied into a JDOM document
			*/
			Document readDoc = builder.build(new File("C:\\Users\\Juan Pablo Cubero\\Desktop\\Datos I Nereo\\Proyectos\\I Proyecto (SpiderBot y Engine)\\SpiderBot\\URLs.xml"));

                        /**
                         * Creates a list with the first URLs to analyze
                        */
                        String lista[] = {readDoc.getRootElement().getChildText("URL1"),readDoc.getRootElement().getChildText("URL2"),readDoc.getRootElement().getChildText("URL3"),readDoc.getRootElement().getChildText("URL4")};
                        
                        
                        for (int x=0; x<lista.length;x++)
                        System.out.println(lista[x]);
                        System.out.println("Esto es de la lista con los URL");

                        /**
                         * Creates a queue with the  first URLs
                        */
                        LinkedList cola = new LinkedList();
   
                        for (int i=0; i<lista.length; i++){
                        cola.offer(lista[i]);
                        ID = 0;
                        }
                        System.out.println(cola);
                        System.out.println("Lo de arriba es de la cola");

                        Element root = readDoc.getRootElement();
                        Copia = cola;
			
		} 
		
		catch (JDOMException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		} 
        }
}
class h{
    public static void main(String[] args){
        System.out.println(Cola.Copia.getFirst());
    }
}
