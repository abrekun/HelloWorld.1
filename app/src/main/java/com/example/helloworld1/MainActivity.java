package com.example.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText name = findViewById(R.id.name);
        final EditText email = findViewById(R.id.email);
        final TextView message = findViewById(R.id.message);

        Button oks = findViewById(R.id.oks);
        Button fresh = findViewById(R.id.fresh);

        oks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = name.getText().toString();
                String b = email.getText().toString();
                message.setText("Подписка на рассылку успешно оформлена для пользователя " + a + " на электронный адрес " + b);

            }
        });

        fresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
            }
        });
    }
}