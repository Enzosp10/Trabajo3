package com.example.trabajo3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        Button btn_ingresar;

        btn_ingresar = findViewById(R.id.btn_ingresar);
        EditText etUsuario= findViewById(R.id.etUsuario);
        EditText etPassword= findViewById(R.id.etPassword);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (etUsuario.getText().toString().equals("enzo")) {
                    Intent btn_ingresar = new Intent(MainActivityLogin.this, MapsActivity.class);
                    startActivity(btn_ingresar);
                }
            }
        });
    }
}