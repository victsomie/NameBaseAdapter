package com.example.victor.namebaseadapter;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return null;
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
