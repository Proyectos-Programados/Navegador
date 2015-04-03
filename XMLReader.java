package XMLReader;

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
 * This class initializes the method to read an XML file.
 */

public class XMLReader {
	public static void main(String[] args) {		
		readXML();
	}
	
	private static void readXML(){
		
		SAXBuilder builder = new SAXBuilder();
		try {
			
			/**
                         * Parses the file supplied into a JDOM document
			*/
			Document readDoc = builder.build(new File("C:\\Users\\Juan Pablo Cubero\\Desktop\\Datos I Nereo\\Proyectos\\I Proyecto (SpiderBot y Engine)\\SpiderBot\\URLs.xml"));
						
			/**
                         * Gets the text found between the name tags
			*/
			System.out.println("URL1: " + readDoc.getRootElement().getChildText("URL1"));
			System.out.println("URL2: " + readDoc.getRootElement().getChildText("URL2"));
			System.out.println("URL3: " + readDoc.getRootElement().getChildText("URL3"));
			System.out.println("URL4: " + readDoc.getRootElement().getChildText("URL4"));
			System.out.println("\n");
                        
                        /**
                         * Creates a list with the first URLs to analyze
                        */
                        
                        String lista[] = {readDoc.getRootElement().getChildText("URL1"),readDoc.getRootElement().getChildText("URL2"),readDoc.getRootElement().getChildText("URL3"),readDoc.getRootElement().getChildText("URL4")};
                        
                        for (int x=0; x<lista.length;x++)
                        System.out.println(lista[x]);
			
                        Element root = readDoc.getRootElement();
			
                        System.out.println("Esto es de la lista con los URL");
                        System.out.println("\n");
		
			
		} 
		
		catch (JDOMException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		} 
		
                
//------------------------------HERE IS WHERE THE CONFIGURATIONS IS------------------------------------------------------------
		
                SAXBuilder builder2 = new SAXBuilder();
		try {
			
			/**
                         * Parses the file supplied into a JDOM document
			*/
			Document readDoc = builder.build(new File("C:\\Users\\Juan Pablo Cubero\\Desktop\\Datos I Nereo\\Proyectos\\I Proyecto (SpiderBot y Engine)\\SpiderBot\\Configurations.xml"));
						
			/**
                         * Gets the text found between the name tags
			*/
			System.out.println("maxthreads: " + readDoc.getRootElement().getChildText("maxthreads"));
			System.out.println("recursivity: " + readDoc.getRootElement().getChildText("recursivity"));
			System.out.println("reindex: " + readDoc.getRootElement().getChildText("reindex"));
			
			Element root = readDoc.getRootElement();
			
		
			
		} 
		
		catch (JDOMException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
        
                
                
                
        }
	
}

