package com.elec390.sarah.randomfacts3;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button crazybutton = (Button) findViewById(R.id.crazybutton);
        crazybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CrazyFactsActivity.class);
                startActivity(intent);
            }
        });

        Button sportsbutton = (Button) findViewById(R.id.sportsbutton);
        sportsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SportsFactsActivity.class);
                startActivity(intent);
            }
        });

        Button quitbtn = (Button) findViewById(R.id.quitbutton);
        quitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View paramView) {
                Uri webpage = Uri.parse("http://www.google.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
                MainActivity.this.finish();
            }
        });
        Button settingsbutton = (Button) findViewById(R.id.settingsbutton);
        settingsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View paramView) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
        Button chromebutton = (Button) findViewById(R.id.chromebutton);
        chromebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View paramView) {
                Uri webpage = Uri.parse("http://www.google.com");

                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });
    }

    @Override
    public void onStart(){
        super.onStart();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean Type = prefs.getBoolean("pref_sync", false);
        TextView text = (TextView) findViewById(R.id.welcome);
        if (Type == true){
            text.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else{
            text.setTypeface(Typeface.DEFAULT);
        }
    }
}



