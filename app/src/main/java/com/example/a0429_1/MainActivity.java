package com.example.a0429_1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView result;
EditText user_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    result = findViewById(R.id.result);
    user_number = findViewById(R.id.guessnumber);
    }

    public void guess(View v){
        Random random = new Random();
        int random_number = random.nextInt(100);
        if (Integer.parseInt(user_number.getText().toString()) > random_number){
            result.setText("정답보다 높습니다. 정답 : "+random_number);
        } else if (Integer.parseInt(user_number.getText().toString()) == random_number) {
            result.setText("정답입니다. 정답 : "+random_number);
        } else {
            result.setText("정답보다 낮습니다. 정답 : "+random_number);
        }

    }
}