/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.ramen.entidades;

import java.util.Date;
import mx.itson.ramen.enumerador.Tipo;

/**
 *
 * @author Jesus Javier-240628
 */
public class Transferencia {
   private Date fecha; //Fecha de tipo fecha
   private String descripcion; //Descripcion de transferencia
   private double cantidad; //Cantidad de transferencia
   private Tipo tipo; //Tipo de enumerador tipo
   private double depositos; 
   private double retiros;

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the depositos
     */
    public double getDepositos() {
        return depositos;
    }

    /**
     * @param depositos the depositos to set
     */
    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    /**
     * @return the retiros
     */
    public double getRetiros() {
        return retiros;
    }

    /**
     * @param retiros the retiros to set
     */
    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }
}
