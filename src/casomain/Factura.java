/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casomain;

/**
 *
 * @author garci
 */
public class Factura {

    private String nombre;
    private String cedula;
    private Integer numeroFactura;
    private Integer montoFactura;
    private int mes;
    private int year;
    private int estado;

    public Factura() {
    }



    public Factura(String nombre, String cedula, Integer numeroFactura, Integer montoFactura, int mes, int year, int estado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.year = year;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(Integer montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }





    @Override
    public String toString() {
        return "Factura{" + "nombre=" + nombre + ", cedula=" + cedula + ", numeroFactura=" + numeroFactura + ", montoFactura=" + montoFactura + ", mes=" + mes + ", year=" + year + ", estado=" + estado + '}';
    }



}
