package cl.aldogallardo.quizchile.data;

/**
 * Created by Aldo Gallardo on 11-02-2017.
 */

public class Result extends Answer {

    String response;
    String textResponse;
    int imageResponse;

    public Result(int puntaje) {
        super(puntaje);
    }

    public Result() {

    }

    public int correctAnswer(){
        int correct = getPuntaje()+ 1;
        setPuntaje(correct);
        return correct;
    }


    public String porcentage(){
        if (getPuntaje()<1){
            response = "0%";
        }else if (getPuntaje()==1){
            response = "25%";
        }else if (getPuntaje()==2){
            response = "50%";
        }else if (getPuntaje()==3){
            response = "75%";
        }else if (getPuntaje()==4){
            response = "100%";
        }

        return response;
    }

    public String responsePorcentage(){
        if (response =="0%"){
            textResponse = "Construire un muro para que no entres a Chile.";
        }else if (response == "25%"){
            textResponse = "vives en un pais cercano por eso conoces poco de Chile.";
        }else if (response == "50%"){
            textResponse = "Eres de Reality, vienes de afuera pero estás viviendo en Chile, no sabes si te quedarás.";
        }else if (response == "75%" ){
            textResponse = "Vives hace un buen tiempo en nuestro pais, estás esperando el tramite para nacionalizarte chileno.";
        }else if (response == "100%"){
            textResponse = "Más chileno que los porotos, Celebraste con llantos las dos copas americas contra los argentinos.";
        }
        return textResponse;
    }

    public int responseImage(){
        if (response =="0%"){

        }else if (response == "25%"){

        }else if (response == "50%"){

        }else if (response == "75%" ){

        }else if (response == "100%"){


        }

        return imageResponse;
    }
}


