package com.example.appfuncionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edNome = (EditText)findViewById(R.id.edNome);
        EditText edPhone = (EditText)findViewById(R.id.edPhone);
        EditText edCargo = (EditText)findViewById(R.id.edCargo);

        Button btGravar = (Button)findViewById(R.id.btGravar);

        btGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}