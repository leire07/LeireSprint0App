package org.example.lvilmar1.leireapp.logicaFake;

import android.util.Log;
import android.view.View;

public class Logica {
    public void guardarDatos(Medicion medicion) {

        PeticionarioREST elPeticionario = new PeticionarioREST();

        //la contrabarra es pa clavar la cometa dins del string sense tancar el stringç
        //http://localhost/phpmyadmin/sql.php?db=android_mysql&table=datosmedidos&pos=0
        String textoJSON = "{\"Medicion\":\"" + medicion.getMedicion() + "\", \"Latitud\":\"" + medicion.getLatitud() + " \", \"Longitud\":\"" + medicion.getLongitud() + "\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.64.2/backend_SprintLeire/guardarMediciones.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("" ,"Se ha insertado correctamente");
                    }
                }
        );
    }
}
