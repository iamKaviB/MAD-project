package com.example.xtrodi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerview;
    MyAdapter myAdapter;
    AutoCompleteTextView autoCompleteTextView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView txt = findViewById(R.id.text);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        recyclerview.setAdapter(myAdapter);








    }
    private ArrayList<Model> getMyList(){

        ArrayList<Model> model = new ArrayList<>();

        Model m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);


        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        m = new Model();
        m.setItem("item found");
        m.setDays("23");
        model.add(m);

        return model;

    }
}