package com.ucbcba;

public class Main {
    int propiedad;

    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure square = new Square(4);
        Figure rectangle=new Rectangle(4,5);
        draw(circle);
        System.out.println("El perimentro del circulo es :"+circle.perimenter());
        System.out.println("El area del circulo es :"+circle.area());
        draw(square);
        System.out.println("El perimentro del cuadrado es :"+square.perimenter());
        System.out.println("El area del cuadrado es :"+square.area());
        draw(rectangle);
        System.out.println("El perimentro del rectangulo es :"+rectangle.perimenter());
        System.out.println("El area del rectangulo es :"+rectangle.area());
    }

    public static void draw(Drawable drawable) {
        //TODO Imprimir si es un cuadrado o circulo
        drawable.draw();
    }
}
