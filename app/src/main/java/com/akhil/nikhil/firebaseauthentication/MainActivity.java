package com.akhil.nikhil.firebaseauthentication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        ProgressDialog progress_bar = new ProgressDialog(MainActivity.this);
        EditText email = findViewById(R.id.email_id);
        EditText password = findViewById(R.id.pass_id);
        //String email = email.getText().tostring();
       // String password = password
    }

    public void signup1(View view) {

        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
}
