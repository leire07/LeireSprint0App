package org.example.lvilmar1.leireapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.example.lvilmar1.leireapp.logicaFake.Logica;
import org.example.lvilmar1.leireapp.logicaFake.Medicion;

public class TodasLasMediciones extends AppCompatActivity {

    Logica laLogica = new Logica();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todas_las_mediciones);
        TextView txtTodas=(TextView)findViewById(R.id.txtTodas);
        Button btnVolver=(Button)findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        }); //para volver a la pantalla anterior

        String datosObtenidos = getIntent().getStringExtra("datos");

        txtTodas.setText(datosObtenidos);



    }


}