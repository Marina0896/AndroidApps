package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.button_blueinvisible);
        buttonBlue.setOnClickListener(this);
        buttonPink = (Button) findViewById(R.id.button_pinkpanther);
        buttonPink.setOnClickListener(this);
    }

    public void toDo(View v) {
        if (v.equals(buttonBlue))
            //invisibility
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            // pop-up
            Toast.makeText(getApplicationContext(),
                    "to do to do to do to do",
                    Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        toDo(v);
    }
}