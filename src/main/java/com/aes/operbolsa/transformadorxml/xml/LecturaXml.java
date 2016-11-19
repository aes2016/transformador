/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.transformadorxml.xml;

import com.aes.operbolsa.modelo.inversor.Accion;
import com.aes.operbolsa.modelo.inversor.Inversor;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author SALLYESTEFANIA
 */
public class LecturaXml {
    
    private static final String rutaXML = "src/main/resources/inversor.xml";
    /*
    public static void main (String [] args) {
        try {
             Inversor q = (Inversor) transformadorXML(Inversor.class, rutaXML);
             System.out.println("-->"+q.getEfectivo());
             for(Accion a: q.getAcciones().getListaAccion()){
                  System.out.println("---> "+a.getEmpresa());    
             } 
              
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    */
        
     /*  
        try {
         
        File file = new File(rutaXML);  
        JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);  
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Question que= (Question) jaxbUnmarshaller.unmarshal(file);    
        System.out.println(que.getId()+" "+que.getQuestionname());  
        System.out.println("Answers:");  
        List<Answers> list=que.getAnswers();  
        for(Answers ans:list){  
          System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());  
        }
      } catch (Exception e) {  
        e.printStackTrace();  
      }*/  
//}
    
    public static Object transformadorXML(Class<?> clase, String nombreArchivo){
        try {
        final String pathArchivo = "src/main/resources/"+nombreArchivo+".xml"; 
        File file = new File(pathArchivo);
        JAXBContext jaxbContext = JAXBContext.newInstance(clase);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Object claseTransformada=  jaxbUnmarshaller.unmarshal(file);
      //  System.out.println(que.getId()+" "+que.getQuestionname());  
       // System.out.println("Answers:");  
       return claseTransformada;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
}
