package com.example.miwok;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

//        NumberClickListener number=new NumberClickListener();
//        TextView tx=findViewById(R.id.numbers);
//      1.  tx.setOnClickListener(new NumberClickListener());
//      2.  tx.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(v.getContext(),"hello this is new method",Toast.LENGTH_SHORT).show();
//                }
//            });


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //String []word1=new String[10];
        //    String []word={"one","two","three","four","five","six","seven","eight","nine","ten"};
//        Log.v("NumberActivity","the word 0 "+word[0]);

        ViewPager viewPager=findViewById(R.id.pager);

        SimplePagerAdapter adapter=new SimplePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

         TabLayout tabLayout=findViewById(R.id.tabLayout);
         tabLayout.setupWithViewPager(viewPager);
    }

    public void numAct(View view)
    {
        Intent in1=new Intent(this,NumbersActivity.class);
        startActivity(in1);
    }

    public void colorAct(View view)
    {
        Intent in2=new Intent(this,ColorActivity.class);
        startActivity(in2);
    }

public void familyAct(View view)
    {
        Intent in3=new Intent(this,FamilyMember.class);
        startActivity(in3);
    }

public void phrasesAct(View view)
    {
        Intent in4=new Intent(this,PhrasesActivity.class);
        startActivity(in4);
    }



}
