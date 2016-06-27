package com.epicodus.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StoryActivity extends AppCompatActivity {
    private TextView mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mStory = (TextView) findViewById(R.id.story);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun").toLowerCase();
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb").toLowerCase();
        String animal = intent.getStringExtra("animal").toLowerCase();
        String number = intent.getStringExtra("number").toLowerCase();

        mStory.setText(name + " was walking along and " + verb + " a " + animal + " " + number + " times on a " + noun + ".");
    }
}
