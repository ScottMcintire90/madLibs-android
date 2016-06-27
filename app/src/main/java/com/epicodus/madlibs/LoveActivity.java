package com.epicodus.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoveActivity extends AppCompatActivity {
    private TextView mLove;
    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);
        mLove = (TextView) findViewById(R.id.love);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb");
        String animal = intent.getStringExtra("animal");
        String number = intent.getStringExtra("number");
        mLove.setText(name + " was walking along a lovely raod when all of a sudden a " + animal +" appeared out of thin and gave a big " + verb +" " + number + " times on a " + noun + ", screaming I love you I love you " + number +" times.");

        mHomeButton = (Button) findViewById(R.id.homeButton);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoveActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
