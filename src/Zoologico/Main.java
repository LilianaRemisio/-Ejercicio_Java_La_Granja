/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author remis
 */
public class Main {
    public static void main(String[] args) {
        
        Animal misAnimales[] = new Animal[4];
        misAnimales[0] = new Jirafa(101, "Emmy", 200, 3.2f, "rojo");
        misAnimales[1] = new Jirafa(102, "Alice", 214, 3f, "cafe");
        misAnimales[2] =new Elefante(201, "Roberto", 500, 4f, 1000f);
        misAnimales[3] =new Puma(301, "Pancrasio", 500, 4, 1000f);
        
        for(Animal i: misAnimales){
            System.out.println(i.mostrarDatos());
            System.out.println("");
        }
    }
}
