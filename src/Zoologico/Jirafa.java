/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public class Jirafa extends AnimalHerbivoro {
    private String color;

    public Jirafa(int codigo, String nombre, float peso, float altura, String color) {
        super(codigo, nombre, peso, altura);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String mostrarDatos() {
        return "Jirafa{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + ", altura=" + getAltura() + ", color=" + color + "}";
    }
    
    
    
}
