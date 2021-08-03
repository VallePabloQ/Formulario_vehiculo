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
public class Propietario extends Persona {
    private String nit,cui;

    public Propietario(){}
    public Propietario(String nit, String cui, String nombres, String apellidos, String direccion, String telefono, String fechaN, String tarjeta, String uso) {
        super(nombres, apellidos, direccion, telefono, fechaN, tarjeta, uso);
        this.nit = nit;
        this.cui = cui;
    }

    public Propietario(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    @Override
    public void agregar(){
        System.out.println("Nombre: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Nit: " + getNit());
        System.out.println("Cui: " + getCui());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("F Nacimiento: " + getFechaN());
        System.out.println("No. Tarjeta: " + getTarjeta());
        System.out.println("____________________________________");
    }
    @Override
    public void mostrar(){}   
    
}
