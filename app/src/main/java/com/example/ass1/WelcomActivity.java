package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ass1.Categories.categorie;

public class WelcomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        ArrayAdapter<categorie> listAdapter =new  ArrayAdapter<categorie>
          (this, android.R.layout.simple_list_item_1, categorie.categories);
        ListView listView = findViewById(R.id.listCategorie);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent =new Intent(WelcomActivity.this,CategorieDetailsActivity.class);
                intent.putExtra("Categorie_id",(int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}