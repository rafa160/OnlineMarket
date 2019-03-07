package br.com.alura.mercadoonline;

import android.widget.EditText;

import br.com.alura.mercadoonline.modelo.Usuario;

public class CadastroHelper {

    private final EditText cadastroMercado;
    private final EditText cadastroUsuario;
    private final EditText cadastroEmail;
    private final EditText cadastroTelefone;
    private final EditText cadastroSenha;

    public CadastroHelper(CadastroActivity activity){

         cadastroMercado = (EditText) activity.findViewById(R.id.nomeMercado);
         cadastroUsuario = (EditText) activity.findViewById(R.id.cadastroNome);
         cadastroEmail = (EditText) activity.findViewById(R.id.cadastroEmail);
         cadastroTelefone = (EditText) activity.findViewById(R.id.cadastroTelefone);
         cadastroSenha = (EditText) activity.findViewById(R.id.cadastroSenha);


    }


    public Usuario pegaUsuario() {

        Usuario usuario = new Usuario();
        usuario.setNomeMercado(cadastroMercado.getText().toString());
        usuario.setNomeUsuario(cadastroUsuario.getText().toString());
        usuario.setEmail(cadastroEmail.getText().toString());
        usuario.setTelefone(cadastroTelefone.getText().toString());
        usuario.setSenha(cadastroSenha.getText().toString());

        return usuario;

    }
}
