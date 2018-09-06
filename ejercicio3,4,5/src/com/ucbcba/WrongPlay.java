package com.ucbcba;

import java.util.List;

public class WrongPlay extends Exception {
    boolean res;
    public WrongPlay(boolean res){
        this.res=res;
    }

    public String getMessege() {
        return "la jugada es incorrecta";
    }
    public String getMensajeTorneo()
    {
        return "no se puede realizar el torneo por que estan dispares";
    }
}
