package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button increaseButton;
    private Button decreaseButton;
    private Button resetButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();

        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString())+1);
                textView.setText(newText);
            }
        });
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(textView.getText().toString()) != 0) {
                    String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                    textView.setText(newText);
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("0");
            }
        });
    }

    private void setupUI(){
        textView = findViewById(R.id.textView);
        increaseButton = findViewById(R.id.increase);
        decreaseButton = findViewById(R.id.decrease);
        resetButton = findViewById(R.id.reset);
    }
}