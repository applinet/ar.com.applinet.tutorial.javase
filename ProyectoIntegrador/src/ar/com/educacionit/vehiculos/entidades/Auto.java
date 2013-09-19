/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author educacionit
 */
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, String color, int ancho, int largo, int altura) {
        super(ancho, largo, altura);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Marca" + this.marca;
    }
        
            
    // Atributos
    private String marca;
    private String modelo;
    private String color;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}