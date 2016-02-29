package com.elec390.sarah.randomfacts3;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AllFactsActivityFragment extends Fragment {

    SQLiteDatabase Database;
    List<String> Facts;
    ArrayAdapter<String> FactsAdapter;

    public AllFactsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Database = getActivity().openOrCreateDatabase("FactsDB", Context.MODE_PRIVATE, null);
        Database.execSQL("CREATE TABLE IF NOT EXIST facts(fact TEXT,type TEXT);");

        Facts = new ArrayList<String>();

        Cursor cursor = Database.rawQuery("SELECT fact FROM facts", null);
        if (cursor != null && cursor.moveToFirst()){
            do{
                String factText = new String(cursor.getString(0));
                android.util.Log.i("Fact", factText);
                Facts.add(factText);
            } while(cursor.moveToNext());
            cursor.close();
        }

        FactsAdapter = new ArrayAdapter<String>
                (getActivity(), R.layout.list_item_fact,R.id.list_item_fact_textview,Facts);

        View rootView = inflater.inflate
    }
}
