package com.example.jack.tourismapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bIngresar = (Button) findViewById(R.id.bIngresar);
        final TextView LinkCrearCuenta = (TextView) findViewById(R.id.tvCrearCuenta);
        final TextView LinkRecuperarCuenta = (TextView) findViewById(R.id.tvRecuperarCuenta);

        LinkCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registroIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registroIntent);
            }
        });

        bIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = (etUsername).getText().toString();
                String password = (etPassword).getText().toString();
                if (usuario.equals("admin") && password.equals("admin")) {
                    Intent nuevoform = new Intent(LoginActivity.this,MenuActivity.class);
                    startActivity(nuevoform);

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
