/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.transformadorxml.xml.utilidades;

/**
 *
 * @author root
 */
public abstract class Comandos {

    protected String host;
    protected String puerto;
    protected String comando;
    protected boolean comandoValido;

    public Comandos(String comando) {
        this.comando = comando;
    }

    abstract boolean validarComando();
    
    abstract boolean getComandoConexion();
    
    abstract boolean getComandoOperacion();

    
    
    protected String getHost() {
        return host == null ? "" : host;
    }

    protected void setHost(String host) {
        this.host = host;
    }

    protected String getPuerto() {
        return puerto == null ? "" : puerto;
    }

    protected void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    protected String getComando() {
        return comando;
    }

    protected void setComando(String comando) {
        this.comando = comando;
    }
    

}
