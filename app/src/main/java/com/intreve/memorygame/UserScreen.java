package com.intreve.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserScreen extends AppCompatActivity {
    EditText et_p1, et_p2;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_screen);
        et_p1=findViewById(R.id.et_p1);
        et_p2=findViewById(R.id.et_p2);
        btnNext=findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1Name="";
                String p2Name="";

                p1Name=et_p1.getText().toString();
                p2Name=et_p2.getText().toString();

//                if(p1Name.equals("")||p2Name.equals("")){
//                    Toast.makeText(UserScreen.this, "Enter both the names", Toast.LENGTH_SHORT).show();
//                }
//
//                else{
                    Intent intent= new Intent(UserScreen.this, MainActivity.class);
                    intent.putExtra("p1_name", p1Name);
                    intent.putExtra("p2_name", p2Name);

                    startActivity(intent);

              //  }
            }
        });
    }
}