package com.ucbcba;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongPlay {
	// write your code here
        //Dos jugadores;
        JuegoRpt juegoRpt = new JuegoRpt();

        List<List> jugada = new ArrayList<>();


        List<List> jugada1 = new ArrayList<>();
        List<String> jugada11 = new ArrayList<>();
        List<String> jugada12 = new ArrayList<>();
        jugada11.add("Juan");
        jugada11.add("P");
        jugada12.add("Pedro");
        jugada12.add("T");

        List<List> jugada2 = new ArrayList<>();
        List<String> jugada21 = new ArrayList<>();
        List<String> jugada22 = new ArrayList<>();
        jugada21.add("Maria");
        jugada21.add("P");
        jugada22.add("Jose");
        jugada22.add("P");

        jugada1.add(jugada11);
        jugada1.add(jugada12);

        jugada2.add(jugada21);
        jugada2.add(jugada22);

        jugada.add(jugada1);
        jugada.add(jugada2);


        try {
            System.out.println(juegoRpt.jugar(jugada2));
        }catch (WrongPlay e) {
            System.out.println(e.getMessege());
        }
        //torneo
        //obtener datos del teclado
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la opcion");
        System.out.println("1.- agregar jugador");
        System.out.println("2.- agreagar a torneo");
        String re=sc.nextLine();
        List<List> torneo=new ArrayList<>();
        List<List> je1 = new ArrayList<>();
        if(re=="1") {
            System.out.println("ingrese el nombre del jugador 1:");
            String j1 = sc.nextLine();
            System.out.println("ingrese el jugada del jugador 1:");
            String e1 = sc.nextLine();
            System.out.println("ingrese el nombre del jugador 1:");
            String j2 = sc.nextLine();
            System.out.println("ingrese el jugada del jugador 1:");
            String e2 = sc.nextLine();
            juegoRpt.crearjugador(je1, j1, e1, j2, e2);
        }
        if(re=="2")
        {

            juegoRpt.aniadiratorneo(torneo,je1);
        }
        if(re=="3")
        {
            try {
                juegoRpt.jugarTorneo();
            }catch (WrongPlay e){
                System.out.println(e.getMensajeTorneo());
            }
            for(int i=0;i<torneo.size();i++)
            {
                juegoRpt.jugar2(torneo,i);
            }
        }

    }
}
