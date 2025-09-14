package com.mycompany.vehiculo;
public class Vehiculo {
protected String tipo,marca;
public Vehiculo(String marca, String tipo ){
    this.marca=marca;
    this.tipo=tipo;
}
}
class Moto extends Vehiculo{
    String cilindraje;
    public Moto(String marca, String tipo, String cilindraje) {
        super(marca, tipo);
        this.cilindraje=cilindraje;
    }
    
}
class main{
    public static void main(String[] args) {
 Vehiculo carro=new Vehiculo("Audi", "x");
 Vehiculo moto = new Moto("boxer", "s", "bajo");
 
    }
}
