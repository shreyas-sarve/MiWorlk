package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family_members);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);
        //For All this U have to Create numberOnClickListener Class
    /*----one way using interface
    numberOnClickListener clickListener=new numberOnClickListener();
        numbers.setOnClickListener(clickListener);         */
        /* Another Way(2)
        numbers.setOnClickListener(new numberOnClickListener());

         */
        //Third Way
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override//Overriding onClick method inside the OnClickListener interface class
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Open Numbers", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Numbers.class);
                startActivity(i);
            }
        });
            //Family
        family.setOnClickListener(new View.OnClickListener() {
            @Override//Overriding onClick method inside the OnClickListener interface class
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Open Family Members", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Family.class);
                startActivity(i);
            }
        });
        //Colors
        colors.setOnClickListener(new View.OnClickListener() {
            @Override//Overriding onClick method inside the OnClickListener interface class
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Open Colors", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Colors.class);
                startActivity(i);
            }
        });
        //Phrases
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override//Overriding onClick method inside the OnClickListener interface class
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Open Phrases", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Phrases.class);
                startActivity(i);
            }
        });
    }
}