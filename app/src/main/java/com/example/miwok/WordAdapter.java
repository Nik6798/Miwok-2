package com.example.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {


    private int mcolor;
    public WordAdapter(Activity context, ArrayList<Word> words,int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mcolor=color;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentword=getItem(position);

        TextView miwokText= listItemView.findViewById(R.id.miwok_textview);
        miwokText.setText(currentword.getMiwokTranslation());
        TextView defaultText=listItemView.findViewById(R.id.default_textview);
        defaultText.setText(currentword.getDefaultTranslation());
        ImageView img=listItemView.findViewById(R.id.imageid);

        if(currentword.hasImage()){
            img.setImageResource(currentword.getImageResourceId());
            img.setVisibility(View.VISIBLE);
        }
        else{
            img.setVisibility(View.GONE);
        }

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mcolor);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }
}
