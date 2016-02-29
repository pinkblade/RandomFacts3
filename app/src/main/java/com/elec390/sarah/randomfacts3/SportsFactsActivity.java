package com.elec390.sarah.randomfacts3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SportsFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_facts);

        final Button nextsports = (Button) findViewById(R.id.sportsnext);
        final TextView text = (TextView) findViewById(R.id.textView2);

        nextsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactsModel factsModel = new FactsModel();
                text.setText(factsModel.getSportsFact());
            }
        });
    }
}
