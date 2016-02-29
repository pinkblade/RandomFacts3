package com.elec390.sarah.randomfacts3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import java.util.Random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class CrazyFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazy_facts);

        final Button nextcrazy = (Button) findViewById(R.id.crazynext);
        final TextView text = (TextView) findViewById(R.id.textView);

        nextcrazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactsModel factsModel = new FactsModel();
                text.setText(factsModel.getCrazyFact());
            }
        });
    }
}
