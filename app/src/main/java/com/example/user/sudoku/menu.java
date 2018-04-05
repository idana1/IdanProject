package com.example.user.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class menu extends AppCompatActivity  {
Button easy, medium,hard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        easy = (Button) findViewById(R.id.btnEasy);
        medium = (Button) findViewById(R.id.btnMedium);
        hard = (Button) findViewById(R.id.btnHard);
        easy.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view) {
        if(view == easy)
        {
        }
    }
}
