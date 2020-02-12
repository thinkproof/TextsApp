package com.lingevan.textsapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button submitButton2;
    EditText responseText;
    TextView displayText;
    TextView displayText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        submitButton2=findViewById(R.id.clickButton2);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textLabel);
        displayText2=findViewById(R.id.textLabel2);

        Resources res = getResources();
        final String[] planets = res.getStringArray(R.array.planets_array);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText()+" "+responseText.getText());
            }
        });
        submitButton2.setOnClickListener(new View.OnClickListener() {
            int i=0;
            @Override
            public void onClick(View v) {
                displayText2.setText(planets[i % planets.length]);
                i++;
            }
        });
    }
}

