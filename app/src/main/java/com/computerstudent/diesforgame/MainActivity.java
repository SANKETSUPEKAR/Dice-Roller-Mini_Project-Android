package com.computerstudent.diesforgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btnClick;
    public ImageView imgView;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick=findViewById(R.id.btnClick);
       imgView=findViewById(R.id.imgDies);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int randomNumber= 1 + (int)(Math.random() * (7 - 1));
               switch (randomNumber)
               {
                   case 1:
                       imgView.setImageResource(R.drawable.dies1);
                       break;

                   case 2:
                       imgView.setImageResource(R.drawable.dies2);
                       break;
                   case 3:
                       imgView.setImageResource(R.drawable.dies3);
                       break;
                   case 4:
                       imgView.setImageResource(R.drawable.dies4);
                       break;
                    case 5:
                        imgView.setImageResource(R.drawable.dies5);
                        break;
                   case 6:
                        imgView.setImageResource(R.drawable.dies6);
                        break;
               }

            }
        });
    }
   }