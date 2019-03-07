package br.com.alura.mercadoonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button primeiroAcesso = (Button) findViewById(R.id.primeiroAcesso);
        primeiroAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProCadastro = new Intent(FirstActivity.this, CadastroActivity.class);
                startActivity(vaiProCadastro);

            }
        });

        Button mercadoAcesso = (Button) findViewById(R.id.buttomLogin);
        mercadoAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText login = (EditText) findViewById(R.id.login);
                EditText password = (EditText) findViewById(R.id.password);

                if(login.getText().toString().length() == 0){
                    login.setError("Campo em Branco");
                }if(password.getText().toString().length() == 0){
                    password.setError("Campo em Branco");
                } else{
                    Intent vaiProMercado = new Intent(FirstActivity.this, MercadoActivity.class);
                    startActivity(vaiProMercado);
                }

            }
        });

    }
}
