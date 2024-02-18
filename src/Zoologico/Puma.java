/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public class Puma extends AnimalCarnivoro {
    private float velocidad;

    public Puma(int codigo, String nombre, float peso, int edad, float velocidad) {
        super(codigo, nombre, peso, edad);
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String mostrarDatos() {
        return "Animal Carnivoro{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + ", edad=" + getEdad() + ", velocidad=" + velocidad + "}";
    }
}
