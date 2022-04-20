package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (!input.getText().toString().isEmpty()) {
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("message", input.getText().toString());
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please, provide a message.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
