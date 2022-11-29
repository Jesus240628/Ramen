/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.ramen.enumerador;

import com.google.gson.annotations.SerializedName;

/**
 * Enumerador para determinar si es deposito o retiro
 * @author Jesus Javier-240628
 */
public enum Tipo {
    @SerializedName("1")
    DEPOSITO,
    @SerializedName("2")
    RETIRO;
}
