package com.example.xtrodi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

public class UploadRecipe extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_recipe);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView txt = findViewById(R.id.text);

        autoCompleteTextView = findViewById(R.id.autoComplete);
        String []option={"Rice","Bakery","Juice","Pudding","Others"};
        Context context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context:this , R.layout.option_item,option);
        int position;
        autoCompleteTextView.setText(arrayAdapter.getItem(position:0).Object filter;
        toString() , filter:false);


    }
}