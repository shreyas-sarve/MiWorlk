package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.family_father));
        words.add(new Word("Two","otiiko",R.drawable.family_mother));
        words.add(new Word("Three","tolookosu",R.drawable.family_daughter));
        words.add(new Word("Four","oyyisa",R.drawable.number_four));
        words.add(new Word("Five","massokka",R.drawable.number_five));
        words.add(new Word("Six","temmokka",R.drawable.number_six));
        words.add(new Word("Seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight","kawinta",R.drawable.number_eight));
        words.add(new Word("Nine","wo'e",R.drawable.number_nine));
        words.add(new Word("Ten","na'aacha",R.drawable.number_ten));
        //Dynamically creating TextView
        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.purple_700);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}