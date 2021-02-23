package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti"));
        words.add(1, new Word("Two","otiiko"));
        words.add( new Word("Three","tolookosu"));
        words.add(3, new Word("Four","oyyisa"));
        words.add(4, new Word("Five","massokka"));
        words.add(5, new Word("Six","temmokka"));
        words.add(6, new Word("Seven","kenekaku"));
        words.add(7, new Word("Eight","kawinta"));
        words.add(8, new Word("Nine","wo'e"));
        words.add(9, new Word("Ten","na'aacha"));
        ListView listView=findViewById(R.id.list);
        WordAdapter itemList=new WordAdapter(this,words,R.color.purple_200);
        listView.setAdapter(itemList);


    }
}