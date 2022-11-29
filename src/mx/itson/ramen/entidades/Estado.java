/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.ramen.entidades;

import com.google.gson.Gson;
import java.util.List;



/**
 *
 * @author Jesus Javier-240628
 */
public class Estado {
    private String producto; //Producto de la cuenta
    private int cuenta; //Numero de la cuenta
    private String moneda; //Moneda de la cuenta
    private Cliente cliente; //Cliente tipo cliente de la cuenta
    private List <Transferencia> transferencias; //Lista tipo tranferencia de la cuenta
    
    public Estado deserializar(String json){
        Estado estado = new Estado();
        try {
            estado = new Gson().fromJson(json, Estado.class);
        } catch(Exception ex){
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
        return estado;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cuenta
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the transferencias
     */
    public List <Transferencia> getTransferencias() {
        return transferencias;
    }

    /**
     * @param transferencias the transferencias to set
     */
    public void setTransferencias(List <Transferencia> transferencias) {
        this.transferencias = transferencias;
    }
}
