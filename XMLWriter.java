package XMLWriter;

import java.io.File; // Class that will represent a system file name

import java.io.FileOutputStream; // Used to write data to a file

import org.jdom2.Document;// Represents your XML document and contains useful methods

import org.jdom2.Element;// Represents XML elements and contains useful methods

import org.jdom2.Text;// Represents text used with JDOM

import org.jdom2.output.Format;// Formats how the XML document will look

import org.jdom2.output.XMLOutputter;// Outputs the JDOM document to a file

/**
 *
 * @author Juan Pablo Cubero
 * Initializes an XML document.
 */
public class XMLWriter {

    public static void main (String[] args){
    writeXML();
  // readXML();
}
/**
 * Introduces the name of the parts of the new XML file, and add them to it.
 */
 
/**-----------------------------------------------------------------------------
 * This is where the URLs XML is written
 */
private static void writeXML(){
    try{
    Document doc = new Document();

    Element theRoot = new Element ("targets");
    doc.setRootElement(theRoot);

    Element url1 = new Element("URL1");
    url1.addContent(new Text("https://es.wikipedia.org/wiki"));
        
    Element url2 = new Element("URL2");
    url2.addContent(new Text("http://amazon.com"));
        
    Element url3 = new Element("URL3");
    url3.addContent(new Text("http://nacion.com"));
    
    Element url4 = new Element("URL4");
    url4.addContent(new Text("http://google.com"));  
 
    theRoot.addContent(url1);
    theRoot.addContent(url2);
    theRoot.addContent(url3);
    theRoot.addContent(url4);
    
    XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
    
    xmlOutput.output(doc, new FileOutputStream(new File("C:\\SpiderBot\\URLs.xml")));
    
    System.out.println("Wrote to file");
    }
    catch (Exception ex){
    ex.printStackTrace();
        
    }
    /**-----------------------------------------------------------------------------
     * This is where the configurations XML is written
     */
    try{
    Document doc = new Document();

    Element theRoot = new Element ("spider");
    doc.setRootElement(theRoot);

    Element maxthreads = new Element("maxthreads");
    maxthreads.addContent(new Text("20"));
        
    Element recursivity = new Element("recursivity");
    recursivity.addContent(new Text("10"));
        
    Element reindex = new Element("reindex");
    reindex.addContent(new Text("56000"));
    
    
    theRoot.addContent(maxthreads);
    theRoot.addContent(recursivity);
    theRoot.addContent(reindex);
    
    XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
    
    xmlOutput.output(doc, new FileOutputStream(new File("C:\\SpiderBot\\Configurations.xml")));
    
    System.out.println("Wrote to file...Again");
    }
    catch (Exception ex){
    ex.printStackTrace();
        
    }
    
    }
}
