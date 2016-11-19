/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.transformadorxml.xml;

import com.aes.operbolsa.modelo.bolsa.Accion;
import com.aes.operbolsa.modelo.inversor.Inversor;
import static com.aes.operbolsa.transformadorxml.xml.utilidades.Propiedades.getPropiedad;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author SALLYESTEFANIA
 */
public class LecturaXml {
    
    private final String rutaXMLInversor = getPropiedad("rutaXmlInversor") ;
    private final String rutaXMLBolsa = getPropiedad("rutaXmlBolsa") ;
    
    
    public static Object transformadorXML(Class<?> clase, String nombreArchivo){
        try { 
            File file = new File(nombreArchivo);
            JAXBContext jaxbContext = JAXBContext.newInstance(clase);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
            Object claseTransformada =  jaxbUnmarshaller.unmarshal(file);

            return claseTransformada;
        
        } catch (Exception e) {
            System.out.println("Error procesado XML por favor validar la estructura");
            e.printStackTrace();
        }
        return null;
    }
    
    
    
}
