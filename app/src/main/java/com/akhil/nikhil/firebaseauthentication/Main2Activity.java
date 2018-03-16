package com.akhil.nikhil.firebaseauthentication;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.akhil.nikhil.firebaseauthentication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void Signup2(View view) {

        EditText email_et = findViewById(R.id.email_id);

        EditText password_et = findViewById(R.id.pass_id);

        String email = email_et.getText().toString();

        if(Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {

        }
        else
            {
                Toast.makeText(Main2Activity.this, "invalid email syntax", Toast.LENGTH_SHORT).show();
            return;
        }

        String password = password_et.getText().toString();

        if(password.length() > 7)
        {

        }
        else {
            Toast.makeText(Main2Activity.this, "password os too short", Toast.LENGTH_SHORT).show();
            return;
        }

        FirebaseAuth f_auth = FirebaseAuth.getInstance();

        final ProgressDialog pd = new ProgressDialog(Main2Activity.this);

        pd.setTitle("Loading");

        pd.show();


        OnCompleteListener<AuthResult> listener = new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                pd.hide();

                if (task.isSuccessful()) {
                    Toast.makeText(Main2Activity.this, "done", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main2Activity.this, "error try again", Toast.LENGTH_SHORT).show();
                }
            }
        };

        f_auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(listener);

    }
}