package org.example.lvilmar1.leireapp.logicaFake;

import android.content.Context;
import android.util.Log;
import android.view.View;

//
// Logica
// Leire Villarroya Martínez
//18/10/21
// Logica para probar los métodos hablados en clase
//
public class Logica {
    //Métodos obligatorios:
    // guardarMediciones
    //Z--> obtenerUltimasMediciones -->[mediciones]
    //obtenerTodasLasMediciones() --> [mediciones]
    public Medicion medicion;

    public void guardarDatos(Medicion medicion) {

        PeticionarioREST elPeticionario = new PeticionarioREST();
        Log.d("guardarDatos" ,"Ha entrado en guardarDatos");

        //la contrabarra es pa clavar la cometa dins del string sense tancar el stringç
        //http://localhost/phpmyadmin/sql.php?db=android_mysql&table=datosmedidos&pos=0
        String textoJSON = "{\"Medicion\":\""+medicion.getMedicion()+"\", \"Longitud\":\""+medicion.getLongitud() +"\", \"Latitud\": \""+medicion.getLatitud()+"\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.0.103/backend_SprintLeire/src/guardarMedicion.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("" ,"Se ha insertado correctamente");
                    }
                }
        );
    }

    public void obtenerTodasLasMediciones(Context context) {

        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();

        elPeticionario.hacerPeticionREST("GET", "http://10.236.25.30/backend_SprintLeire/src/obtenerTodasLasMediciones.php", null,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        ((MainActivity)context).abrirDatos(cuerpo);
                    }
                }
        );

    }
}
