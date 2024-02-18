/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public abstract class AnimalHerbivoro extends Animal {
    private float altura;

    public AnimalHerbivoro(int codigo, String nombre, float peso, float altura) {
        super(codigo, nombre, peso);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public abstract String mostrarDatos();
            
}
