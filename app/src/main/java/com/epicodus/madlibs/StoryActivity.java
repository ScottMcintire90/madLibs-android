package com.epicodus.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StoryActivity extends AppCompatActivity {
    private TextView mStory;
    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mStory = (TextView) findViewById(R.id.story);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb");
        String animal = intent.getStringExtra("animal");
        String number = intent.getStringExtra("number");
        mStory.setText(name + " was walking along and saw a " + animal +" " + verb +" " + number + " times on a " + noun + ".");

        mHomeButton = (Button) findViewById(R.id.homeButton);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
