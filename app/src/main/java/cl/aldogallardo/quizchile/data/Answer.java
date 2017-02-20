package cl.aldogallardo.quizchile.data;

import java.io.Serializable;

/**
 * Created by Aldo Gallardo on 11-02-2017.
 */

public class Answer implements Serializable {

    private int puntaje ;

    public Answer() {
    }

    public Answer(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }


}
