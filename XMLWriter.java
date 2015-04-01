package javalesson46;

import java.io.File; // Class that will represent a system file name

import java.io.FileOutputStream; // Used to write data to a file

import java.io.IOException;// Triggered when an I/O error occurs

import org.jdom2.Document;// Represents your XML document and contains useful methods

import org.jdom2.Element;// Represents XML elements and contains useful methods

import org.jdom2.JDOMException;// Top level JDOM exception

import org.jdom2.Text;// Represents text used with JDOM

import org.jdom2.input.SAXBuilder;// Creates a JDOM document parsed using SAX Simple API for XML

import org.jdom2.output.Format;// Formats how the XML document will look

import org.jdom2.output.XMLOutputter;// Outputs the JDOM document to a file


public class JavaLesson46 {

    public static void main (String[] args){
    writeXML();
  // readXML();
}

private static void writeXML(){
    try{
    Document doc = new Document();

    Element theRoot = new Element ("tvshows");
    doc.setRootElement(theRoot);

    Element show = new Element("show");
    Element name = new Element("name");
    name.setAttribute("show_id","show_001");

    name.addContent(new Text("life on Mars"));

    Element network = new Element("network");
    network.setAttribute("country","US");

    network.addContent(new Text("ABC"));

    show.addContent(name);
    show.addContent(network);

    theRoot.addContent(show);

    //------------------------
    
    Element show2 = new Element("show");
    Element name2 = new Element("name");
    name2.setAttribute("show_id","show_002");

    name2.addContent(new Text("life on Mars"));

    Element network2 = new Element("network");
    network2.setAttribute("country","UK");

    network2.addContent(new Text("BBC"));

    show2.addContent(name2);
    show2.addContent(network2);

    theRoot.addContent(show2);

    XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
    
    xmlOutput.output(doc, new FileOutputStream(new File("C:\\Users\\Juan Pablo Cubero\\Desktop\\Datos I Nereo\\Proyectos\\I Proyecto (SpiderBot y Engine)\\SpiderBot\\jdomMade.xml")));
    
    System.out.println("Wrote to file");
    }
    catch (Exception ex){
    ex.printStackTrace();
        
    }
    }
}
