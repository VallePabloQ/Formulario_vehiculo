/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenovo FX
 */
public class Tarjeta {
    private String tarjeta,uso;

    public Tarjeta(){}
    public Tarjeta(String tarjeta, String uso) {
        this.tarjeta = tarjeta;
        this.uso = uso;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
}
