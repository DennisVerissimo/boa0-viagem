package ifce.edu.br.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by RDC on 16/03/2018.
 */

public class BoaViagemActivity extends Activity {

    private EditText usuario;
    private EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = findViewById(R.id.usuario);
        senha = findViewById(R.id.senha);

    }

    public void entrarOnClick(View v){

        String usuarioInformado = usuario.getText().toString();
        String senhaInformado = senha.getText().toString();

        if ("felipe".equals(usuarioInformado) && "12345".equals(senhaInformado)){

            // vai para outra activity

        }else{

            String mensagemErro = getString(R.string.erro_auten);
            Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
