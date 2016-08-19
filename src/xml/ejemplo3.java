/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.ByteArrayOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author juan pablo
 */
public class ejemplo3 {

    

    public static String obtenerCarteleraHMTL() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
// Usar JAXP DOM para generar Document con fichero xml
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("C:\\Users\\juan pablo\\Desktop\\ejercicio3.xml");
// Generar un objeto transformer para realizar transform XSL
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource stylesource = new StreamSource("C:\\Users\\juan pablo\\Desktop\\ejercicio3.xsl");

            Transformer transformer = tFactory.newTransformer(stylesource);
            DOMSource source = new DOMSource(document);
            ByteArrayOutputStream outputByteArray = new ByteArrayOutputStream();
            StreamResult result = new StreamResult(outputByteArray);
            transformer.transform(source, result);
            return outputByteArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        } 
        
        
    }  
    
    public static void main(String[] args) {
        System.out.println(obtenerCarteleraHMTL());
    }
}
