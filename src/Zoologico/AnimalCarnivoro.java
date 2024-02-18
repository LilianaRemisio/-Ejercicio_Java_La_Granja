/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public abstract class AnimalCarnivoro extends Animal {
    private int edad;

    public AnimalCarnivoro(int codigo, String nombre, float peso, int edad) {
        super(codigo, nombre, peso);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public abstract String mostrarDatos(); 
    
    
}
