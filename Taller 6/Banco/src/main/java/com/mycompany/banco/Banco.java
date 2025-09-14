//Manera corecta
package com.mycompany.banco;
public class Banco {
private double sueldo;
public Banco(double sueldo){
    this.sueldo=sueldo;
}
public double getSuedlo(){
    return sueldo;
}
}
//manera incorrecta
class banco{
  protected double sueldo;
 banco(double sueldo){
    this.sueldo=sueldo;
}
}