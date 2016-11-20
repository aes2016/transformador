/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.transformadorxml.xml.utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author root
 */
public class Utilidades {
    
       
    public static String getPropiedad(String propiedad){
        String valor = null ;
        Properties propiedades = new Properties();
        InputStream entrada = null;

        try {
            entrada = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/configuracion.properties");
            // cargamos el archivo de propiedades
            propiedades.load(entrada);
            // obtener la propiedad
            valor = propiedades.getProperty(propiedad);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally { 
             if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return valor;
    }
    
   
    
    public static boolean evaluarExpresionRegular(String expresion, String cadena){
        boolean coincide = false;
        Pattern pat = Pattern.compile(expresion);
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            coincide = true;
        }         
        return coincide;
    }
    
}
