package com.kite.joco.contactscalendarp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kite.joco.contactscalendarp1.entities.MyContact;


public class MainActivity extends ActionBarActivity {

    EditText etNev;
    EditText etTelefonszam;
    Button btnMentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNev = (EditText) findViewById(R.id.etVezNev);
        etTelefonszam = (EditText) findViewById(R.id.etTelefon);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Savetophone(View v){
        MyContact contact = new MyContact();
        contact.setElsonev(etNev.getText().toString());
        contact.setTelefonszam(etTelefonszam.getText().toString());
        contact.save();
        // itt hívom meg a mentést a rendes telefonkönyvbe.
        Toast.makeText(this,"mentés renben",Toast.LENGTH_SHORT).show();
    }

    public void Contactlista (View v) {
        Intent listaintent = new Intent(this, ListaActivity.class);
        startActivity(listaintent);
    }


}
