package com.ucbcba;

public class ComentarioVacioException extends Exception{
    String comentario;
    public ComentarioVacioException(String comentario) {
        this.comentario=comentario;
    }
    public String getMessege(){
        return "el comentario esta vacio";
    }
}
