package valdcolra.viia.com.proyectoviia.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import valdcolra.viia.com.proyectoviia.R;

public class Login extends AppCompatActivity {
    private ProgressDialog mProgress;
    private Button mLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mProgress = new ProgressDialog(this);
        mLogin = (Button) findViewById(R.id.login);


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgress.setMessage("Cargando...");
                mProgress.show();
                Intent i = new Intent(getApplication(), MainActivity.class);
                startActivity(i);
            }
        });



    }
}
