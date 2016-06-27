package com.epicodus.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScaryActivity extends AppCompatActivity {
    private TextView mScary;
    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scary);
        mScary = (TextView) findViewById(R.id.scary);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb");
        String animal = intent.getStringExtra("animal");
        String number = intent.getStringExtra("number");
        mScary.setText(name + " was walking along a dark scary raod when all of a sudden a " + animal +" appeared out of thin air and " + verb +" " + number + " times on a " + noun + ".");

        mHomeButton = (Button) findViewById(R.id.homeButton);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScaryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
