package com.vivianafemenia.ejercicio01;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public abstract class MainActivity extends AppCompatActivity {
    // paso1 - definir variables vistas

    private EditText txtname;
    private Button btnReset;
    private Button btnSaludar;
    private TextView txtSaludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // paso 2 - inicializacion de las variables de las vistas


        InicializarVistas();

        //paso 3 - Eventos

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSaludo.setText("");
            }
        });
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtname.getText().toString().trim().isEmpty()) {
                    makeText(MainActivity.this, "Escribe algo", LENGTH_LONG).show();
                } else {
                    txtSaludo.setText("Hola" + txtSaludo.getText().toString() + ",Buenos dias");
                    txtname.getText().clear();
                }
            }
        });
    }




     private void InicializarVistas() {
         txtname= findViewById(R.id.txtnameMain);
         btnReset = findViewById(R.id.btnResetMain);
         btnSaludar = findViewById(R.id.btnSaludarMain);
         txtSaludo=findViewById(R.id.txtSaludoMain);

    }
}