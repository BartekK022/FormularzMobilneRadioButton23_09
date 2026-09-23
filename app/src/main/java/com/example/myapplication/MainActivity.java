package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView textViewZmieniany;
    RadioButton radioButtonDuzy, radioButtonMaly, radioButtonZielony, radioButtonNiebieski;
    SeekBar seekBarRozmiarCzcionki;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textViewZmieniany = findViewById(R.id.textView);
        radioButtonDuzy = findViewById(R.id.radioButton);
        radioButtonMaly = findViewById(R.id.radioButton2);
        radioButtonZielony = findViewById(R.id.radioButton3);
        radioButtonNiebieski = findViewById(R.id.radioButton4);
        seekBarRozmiarCzcionki = findViewById(R.id.seekBar);

        radioButtonDuzy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonDuzy.isChecked()) {
                            textViewZmieniany.setTextSize(50);
                            textViewZmieniany.setAllCaps(true);
                        }
                    }
                }
        );
        radioButtonMaly.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonMaly.isChecked()) {
                            textViewZmieniany.setTextSize(15);
                            textViewZmieniany.setAllCaps(false);
                        }
                    }
                }
        );
        radioButtonNiebieski.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonNiebieski.isChecked()) {
                           textViewZmieniany.setTextColor(Color.parseColor("#1F99FA")); //mozna tez dac "blue" po prostu
                        }
                    }
                }
        );
        radioButtonZielony.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonZielony.isChecked()) {
                            textViewZmieniany.setTextColor(Color.parseColor("#16AB1D")); //mozna tez dac "green" po prostu
                        }
                    }
                }
        );
        seekBarRozmiarCzcionki.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        textViewZmieniany.setTextSize(Float.parseFloat(String.valueOf(i)));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

//        btnZatwierdz.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        if(radioButtonDuzy.isChecked()) {
//                            textViewZmieniany.setTextSize(50);
//                            textViewZmieniany.setAllCaps(true);
//                        }
//                        if(radioButtonMaly.isChecked()) {
//                            textViewZmieniany.setTextSize(15);
//                            textViewZmieniany.setAllCaps(false);
//                        }
//                        if(radioButtonNiebieski.isChecked()) {
//                            textViewZmieniany.setTextColor(Color.parseColor("#1F99FA")); //mozna tez dac "blue" po prostu
//                        }
//                        if(radioButtonZielony.isChecked()) {
//                            textViewZmieniany.setTextColor(Color.parseColor("#16AB1D")); //mozna tez dac "green" po prostu
//                        }
//                    }
//                }
//        );


    }
}