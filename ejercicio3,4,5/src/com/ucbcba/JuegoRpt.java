package com.ucbcba;

import java.util.ArrayList;
import java.util.List;

public class JuegoRpt {

    public List jugar(List<List> jugada) throws WrongPlay {
    boolean res=false;
        if(jugada.get(0).get(1) != "P"
                && jugada.get(0).get(1) != "T"
                && jugada.get(0).get(1) != "R")
        {
                throw new WrongPlay(res=true);
        }
        if(jugada.get(1).get(1) != "P"
                && jugada.get(1).get(1) != "T"
                && jugada.get(1).get(1) != "R")
        {
            throw new WrongPlay(res=true);
        }
        if(jugada.get(0).get(1)=="P" && jugada.get(1).get(1)=="T")
        {
          return jugada.get(0);
        }
        if(jugada.get(0).get(1)=="T" && jugada.get(1).get(1)=="P")
        {
            return jugada.get(1);
        }
        if(jugada.get(0).get(1)=="T" && jugada.get(1).get(1)=="R")
        {
            return jugada.get(1);
        }
        if(jugada.get(0).get(1)=="R" && jugada.get(1).get(1)=="T")
        {
            return jugada.get(0);
        }
        if(jugada.get(0).get(1)=="R" && jugada.get(1).get(1)=="P")
        {
            return jugada.get(1);
        }
        if(jugada.get(0).get(1)=="P" && jugada.get(1).get(1)=="R")
        {
            return jugada.get(0);
        }
        //TODO
        return jugada.get(0);
    }
    public List jugar2(List<List> jugada,int i) throws WrongPlay {
        boolean res=false;
        if(jugada.get(i).get(1) != "P"
                && jugada.get(i).get(1) != "T"
                && jugada.get(i).get(1) != "R")
        {
            throw new WrongPlay(res=true);
        }
        if(jugada.get(i+1).get(1) != "P"
                && jugada.get(i+1).get(1) != "T"
                && jugada.get(i+1).get(1) != "R")
        {
            throw new WrongPlay(res=true);
        }

        if(jugada.get(i).get(1)=="P" && jugada.get(i+1).get(1)=="T")
        {
            return jugada.get(i);
        }
        if(jugada.get(i).get(1)=="T" && jugada.get(i+1).get(1)=="P")
        {
            return jugada.get(i+1);
        }
        if(jugada.get(i).get(1)=="T" && jugada.get(i+1).get(1)=="R")
        {
            return jugada.get(i+1);
        }
        if(jugada.get(i).get(1)=="R" && jugada.get(i+1).get(1)=="T")
        {
            return jugada.get(i);
        }
        if(jugada.get(i).get(1)=="R" && jugada.get(i+1).get(1)=="P")
        {
            return jugada.get(i+1);
        }
        if(jugada.get(i).get(1)=="P" && jugada.get(i+1).get(1)=="R")
        {
            return jugada.get(i);
        }
        //TODO
        return jugada.get(i);
    }
    public void crearjugador(List<List> jugador,String j1,String e1,String j2,String e2) {
        List<String> jugada11 = new ArrayList<>();
        List<String> jugada12 = new ArrayList<>();
        jugada11.add(j1);
        jugada11.add(e1);
        jugada12.add(j2);
        jugada12.add(e2);

        jugador.add(jugada11);
        jugador.add(jugada12);
    }
    public List aniadiratorneo(List<List> jugadores,List<List> jugador)
    {
        jugadores.add(jugador);
    }


    public List jugarTorneo(List<List> torneo1 )throws WrongPlay{
        //TODO
        if(torneo1.size()*2%2!=0)
        {
         throw new WrongPlay();
        }
        return torneo1.get(0);
    }

    //
}
