package com.mycompany.empleado;

import java.util.Scanner;

public class Empleado {
    protected String nombre;
    protected double salario;
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
public String getNombre(){
    return nombre;
}
public double getSalario(){
    return salario;
}
void informacion(){
    System.out.println("El nombre es: "+nombre);
    System.out.println("El salario es: "+salario);
}
   
}
class Gerente extends Empleado{
    private String departamento;
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento=departamento; 
    }
    public String getDepartamento(){
        return departamento;
    }
    @Override
    void informacion(){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("El salario es: "+ salario);
        System.out.println("El departamento es: "+departamento);
    }
     
}
class main{
    public static void main(String[] args) {
      Empleado e1= new Empleado("Raul",3000);
        Gerente g1= new Gerente("Alonso",4000,"Comercio");
       e1.informacion();
        g1.informacion();
    }
    }
