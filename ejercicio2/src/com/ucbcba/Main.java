package com.ucbcba;

public class Main {

    public static void main(String[] args)  {
	// write your code here
        Blog blog = new Blog("miblog.com", "Mi Blog");
        Articulo articulo1 = new Articulo("hola quien soy");
        try {
            articulo1.anadirComentario(new Comentario(""));
        } catch (ComentarioVacioException e) {
            System.out.println(e.getMessege() );
        }
        catch (ComentarioLengthException e) {
            System.out.println(e.getMessage() );
        }
        articulo1.like();
        System.out.println(articulo1.getLikes());

        blog.anadirArticulo(articulo1);
        blog.anadirArticulo(new Articulo("Otro texto"));
    ;

    }

    //public static draw(Drawable d){
        // Logica para mostrar si es un circulo o cuadrado
    //    d.draw();
    //}
}
