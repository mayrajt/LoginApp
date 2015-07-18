package com.mayrajaramillo.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class Home extends AppCompatActivity {

    TextView tv_nombre;
    TextView tv_apellido;
    TextView tv_tel;
    TextView tv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_nombre = (TextView) findViewById(R.id.tvNom);
        tv_apellido = (TextView) findViewById(R.id.tvApe);
        tv_tel = (TextView) findViewById(R.id.tvTel);
        tv_email =(TextView) findViewById(R.id.tvEmail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            String nom =  bundle.getString("Nombre");
            tv_nombre.setText(nom);

            String ape = bundle.getString("Apellido");
            tv_apellido.setText(ape);

            String tel =  bundle.getString("Telefono");
            tv_tel.setText(tel);

            String em =  bundle.getString("Email");
            tv_email.setText(em);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
}
