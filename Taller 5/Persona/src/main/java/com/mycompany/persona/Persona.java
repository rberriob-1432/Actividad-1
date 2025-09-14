package com.mycompany.persona;
public class Persona {
private String nombre;
int edad;
public Persona(){
    this.nombre=nombre;
    this.edad=edad;
}
public String getNombre(){
    return nombre;
}
  public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public int getEdad(){
    return edad;
}
  public void setEdada(int edad) {
        this.edad = edad;
    }
}
class Main{
    public static void main(String[] args) {
Persona p1= new Persona();

  p1.edad = 25;

        // Aceso a nombre SOLO con getter y setter (porque es private)
        p1.setNombre("Carlos");

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.edad);
    }
}
