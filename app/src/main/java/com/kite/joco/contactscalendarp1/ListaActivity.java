package com.kite.joco.contactscalendarp1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;


public class ListaActivity extends ActionBarActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        recyclerView = (RecyclerView) findViewById(R.id.myrecview);
    }


}
