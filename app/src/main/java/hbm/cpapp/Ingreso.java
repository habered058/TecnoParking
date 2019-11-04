package hbm.cpapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Ingreso extends AppCompatActivity {


    private EditText textEmail;
    private EditText textPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mAuth = FirebaseAuth.getInstance();

        textEmail = (EditText) findViewById(R.id.txtEmail);
        textPassword = (EditText) findViewById(R.id.txtPassword);

    }

    public void Ingresar(View view) {
        // Obtener los datos de correo y contraseña ingresados
        final String email = textEmail.getText().toString().trim();
        String password = textPassword.getText().toString().trim();

        int pos = email.indexOf("@");
        final String userName = email.substring(0,pos);

        //Verificamos que estos campos no esten vacios
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Ingrese correo", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Ingrese contraseña", Toast.LENGTH_SHORT).show();
            return;
        }

        //Ingresamos al ususario mediante Firebase
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Ingreso.this, "Bienvenido "+ userName, Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(Ingreso.this, MainActivity.class);
                           // intent.putExtra(MainActivity.user, userName);
                            startActivity(intent);

                        } else {
                            Toast.makeText(Ingreso.this, "Usuario no registrado", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}


