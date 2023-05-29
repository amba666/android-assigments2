package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       edUsername = findViewById(R.id.editTextName);
       edPassword= findViewById(R.id.editTextPassword);
       btn=findViewById(R.id.buttonLogin);
       tv= findViewById(R.id.textViewNewUser);

//       when btn clicked
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                if(username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(), "Enter Your Username And Password", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(), "login success", Toast.LENGTH_SHORT).show();
                }


            }
        });
//        text for registering page

        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

    }
}