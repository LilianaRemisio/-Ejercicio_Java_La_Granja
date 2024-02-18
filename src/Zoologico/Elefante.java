/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public class Elefante extends AnimalHerbivoro {
    
    private float precio;

    public Elefante(int codigo, String nombre, float peso, float altura, float precio) {
        super(codigo, nombre, peso, altura);
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String mostrarDatos() {
        return "Jirafa{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + ", altura=" + getAltura() + ", precio=" + precio + "}";
    }
    
}
