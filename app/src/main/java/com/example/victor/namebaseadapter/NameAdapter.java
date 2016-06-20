package com.example.victor.namebaseadapter;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by victor on 6/20/16.
 */
public class NameAdapter extends BaseAdapter{

    private Context mContext;//Context reference

    private Random mRandom = new Random();
    private ArrayList<String> mNames = new ArrayList<>(); //Creates a new arraylist


    public NameAdapter(Context context){ //Creates a constructor for the NameAdapter class with the context as the parameters
        mContext = context; //Stores that content in a field


        for (int i = 0; i<5; i++){ //Adds five random names
            mNames.add(getRandomName());
        }
    }

    @Override
    public int getCount() { //Gets the count of elements in the ArrayList :::In our case mNames
        //return 0;

        return mNames.size(); //This is the size of our ArrayList which == the number of items
    }

    @Override
    public Object getItem(int position) {//Gets the item
        return null;
    }

    @Override
    public long getItemId(int position) { //gets the position of the element
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//Says I want a view in a specific position from the view given
        View view  = null; //This makes our view

        //Then test the condition of the View
        if (view == null){
            //If the is no view nake a view
               //How to do this:
               //Inflate a layout from a context(we passed this earlier)
               //Parent refers to the groud from which it is part of
            view = LayoutInflater.from(mContext).inflate(R.layout.name_view, parent, false);
        }else {
            view = convertView;
        }
        //Customize it
        String name = mNames.get(position); //This gets the string at the given position
        TextView nameTextView = (TextView)view.findViewById(R.id.name_view);
        nameTextView.setText(name); //This sets our text view content to the name at that position

        TextView positionTextView = (TextView)view.findViewById(R.id.position_view);
        positionTextView.setText(String.format("I'm #%d ", (position+1))); //This sets the string to the position of that elemement

        //return null; //We can now return our view instead of null
        return view;
    }


    //Create the method getRandomName ==>>>> This creates a array of strings and returns a random name
    private String getRandomName() {
        String[] names = new String[]{
                "Hannah", "Emily", "Sarah", "Madison", "Brianna",
                "Kaylee", "Kaitlyn", "Hailey", "Alexis", "Elizabeth",
                "Michael", "Jacob", "Matthew", "Nicholas", "Christopher",
                "Joseph", "Zachary", "Joshua", "Andrew", "William"
        };
        return names[mRandom.nextInt(names.length)];
    }


}
