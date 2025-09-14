package com.mycompany.producto;
class Producto {
    String nombre;
            int stock;
    double precio;
    Producto(String nombre, int stock, double precio){
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
    }
    public void Informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad: "+stock);
        System.out.println("Precio por unidad "+precio);
    }
}
    class Main{
  static void main(String[] args) {
String nombre="piza";
int stock=500;
double precio=3000;
Producto piza= new Producto(nombre, stock, precio);
piza.Informacion();
    }
}
