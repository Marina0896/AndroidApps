package com.example.block05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("Color_PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        final RelativeLayout layout= (RelativeLayout) findViewById(R.id.Layout);

            if (preferences.contains("colorId"))
                preferences.getInt("colorId",0);
            layout.setBackgroundColor(preferences.getInt("cp;prId",0));

        RadioGroup radioGroup_colors = (RadioGroup) findViewById(R.id.radioGroup_colors);
        radioGroup_colors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int colorCode = 0;
                switch (checkedId) {
                    case R.id.radioButton_blue:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.radioButton_magenta:
                        colorCode = MAGENTA;
                        break;
                    case R.id.radioButton_yellow:
                        colorCode = YELLOW;
                        break;
                }
                layout.setBackgroundColor(colorCode);
                editor.putInt("colorId",colorCode);
                editor.commit();
            }
            });
        }
}