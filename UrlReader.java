package urlreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.xml.sax.XMLReader.*;

public class UrlReader {
     public static void main(String[] args) throws Exception {

        URL wiki = new URL("http://es.wikipedia.org/wiki");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(wiki.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }   
}
