package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Bookmark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmark);


        Intent intent = getIntent();//받기 전용 변수 만들기

        //주는 쪽의 이름과 받는 쪽의 이름은 동일해야햔다.
        int Index_MainMenu = intent.getIntExtra("Index_MainMenu",0);//MeinMenu에서 index받는 역할
        int Index_hansik = intent.getIntExtra("Index_Hansik",0);//Hansik에서 index받는 역할

        Integer[][] layoutID = {{R.id.h1_la_h1, R.id.h1_la_h2, R.id.h1_la_h3, R.id.h1_la_h4,
                R.id.h1_la_h5, R.id.h1_la_h6, R.id.h1_la_h7, R.id.h1_la_h8},
                {R.id.c1_la_c1, R.id.c1_la_c2, R.id.c1_la_c3, R.id.c1_la_c4, R.id.c1_la_c5,
                R.id.c1_la_c6, R.id.c1_la_c7, R.id.c1_la_c8},
                {R.id.j1_la_j1, R.id.j1_la_j2, R.id.j1_la_j3, R.id.j1_la_j4, R.id.j1_la_j5},
                {R.id.y1_la_y1, R.id.y1_la_y2, R.id.y1_la_y3, R.id.y1_la_y4, R.id.y1_la_y5}};
        LinearLayout[] layoutID_hansik = new LinearLayout[layoutID[Index_MainMenu].length];


        for (int i = 0; i < layoutID_hansik.length; i++) {
            layoutID_hansik[i] = (LinearLayout) findViewById(layoutID[Index_MainMenu][i]);
        }




    }
}