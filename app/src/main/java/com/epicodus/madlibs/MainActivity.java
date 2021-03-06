package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mNoun;
    private EditText mNumber;
    private EditText mVerb;
    private EditText mAnimal;
    private TextView mtextView;
    private String name;

    private Button mSubmitButton;
    private Button mScaryButton;
    private Button mLoveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView = (TextView) findViewById(R.id.textView);
        Typeface rivalFont = Typeface.createFromAsset(getAssets(), "fonts/SF_Arch_Rival.ttf");
        mtextView.setTypeface(rivalFont);

        mNoun = (EditText) findViewById(R.id.noun);
        mNumber = (EditText) findViewById(R.id.number);
        mVerb = (EditText) findViewById(R.id.verb);
        mAnimal = (EditText) findViewById(R.id.animal);

        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String noun = mNoun.getText().toString();
                String number = mNumber.getText().toString();
                String verb = mVerb.getText().toString();
                String animal = mAnimal.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("noun", noun);
                intent.putExtra("number", number);
                intent.putExtra("verb", verb);
                intent.putExtra("animal", animal);
                startActivity(intent);
            }
        });

        mScaryButton = (Button) findViewById(R.id.scaryButton);
        mScaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun = mNoun.getText().toString();
                String number = mNumber.getText().toString();
                String verb = mVerb.getText().toString();
                String animal = mAnimal.getText().toString();

                Intent intent = new Intent(MainActivity.this, ScaryActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("number", number);
                intent.putExtra("verb", verb);
                intent.putExtra("animal", animal);
                startActivity(intent);
            }
        });

        mLoveButton = (Button) findViewById(R.id.loveButton);
        mLoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun = mNoun.getText().toString();
                String number = mNumber.getText().toString();
                String verb = mVerb.getText().toString();
                String animal = mAnimal.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoveActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("number", number);
                intent.putExtra("verb", verb);
                intent.putExtra("animal", animal);
                startActivity(intent);
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_justin:
                if (checked)
                        name = "Justin";
                    break;
            case R.id.radio_scott:
                if (checked)
                        name="Scott";
                    break;
        }
    }

}
