package com.example.miwork;

import android.view.View;
import android.widget.Toast;

public class numberOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"Opne Number List",Toast.LENGTH_SHORT).show();

    }

}
