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
			Document readDoc = builder.build(new File("C:\\SpiderBot\\URLs.xml"));

                        /**
                         * Creates a list with the first URLs to analyze
                        */
                        String lista[] = {readDoc.getRootElement().getChildText("URL1"),readDoc.getRootElement().getChildText("URL2"),readDoc.getRootElement().getChildText("URL3"),readDoc.getRootElement().getChildText("URL4")};
                        
                        System.out.println("Esta es la lista de URL para insertar en cola");
                        
                        for (int x=0; x<lista.length;x++){
                            System.out.println(lista[x]);
                        }
                        System.out.println("\n");
                        

                        /**
                         * Creates a queue with the  first URLs
                        */
                        LinkedList cola = new LinkedList();
   
                        for (int i=0; i<lista.length; i++){
                        cola.offer(lista[i]);
                        ID = 0;
                        }
                        
                        System.out.println("Esta es la Cola con los URL a procesar");
                        System.out.println(cola);
                        
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

