package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mNoun;
    private EditText mName;
    private EditText mNumber;
    private EditText mVerb;
    private EditText mAnimal;

    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNoun = (EditText) findViewById(R.id.noun);
        mName = (EditText) findViewById(R.id.name);
        mNumber = (EditText) findViewById(R.id.number);
        mVerb = (EditText) findViewById(R.id.verb);
        mAnimal = (EditText) findViewById(R.id.animal);

        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String noun = mNoun.getText().toString();
                String name = mName.getText().toString();
                String number = mNumber.getText().toString();
                String verb = mVerb.getText().toString();
                String animal = mAnimal.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("name", name);
                intent.putExtra("number", number);
                intent.putExtra("verb", verb);
                intent.putExtra("animal", animal);
                startActivity(intent);
            }
        });
    }
}
