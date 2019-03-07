package br.com.alura.mercadoonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.alura.mercadoonline.modelo.Usuario;

public class CadastroActivity extends AppCompatActivity {

    private CadastroHelper cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

         cadastro = new CadastroHelper(this);



        Button saveButton = (Button) findViewById(R.id.cadastroSalvar);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Usuario usuario = cadastro.pegaUsuario();
            finish();


            }
        });



    }
}
