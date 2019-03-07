package br.com.alura.mercadoonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    }
}
