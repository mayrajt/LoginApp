package com.mayrajaramillo.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Form extends AppCompatActivity {
    EditText Nombre;
    EditText Apellido;
    EditText Contrase;
    EditText confContrase;
    EditText Telefono;
    EditText Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Nombre = (EditText) findViewById(R.id.etNom);
        Apellido = (EditText) findViewById(R.id.etApe);
        Contrase =(EditText) findViewById(R.id.etPass);
        confContrase = (EditText) findViewById(R.id.confPass);
        Telefono = (EditText) findViewById(R.id.etTel);
        Email =(EditText) findViewById(R.id.etEmail);
        Button btn_reg =(Button) findViewById(R.id.btnForm);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                String nomb = Nombre.getText().toString();
                String ape = Apellido.getText().toString();
                String cont = Contrase.getText().toString();
                String confCont = confContrase.getText().toString();
                String tel = Telefono.getText().toString();
                String em = Email.getText().toString();

                intent.putExtra("Nombre", nomb);
                intent.putExtra("Apellido",ape);
                intent.putExtra("Telefono", tel);
                intent.putExtra("Email", em);

                Toast toast = Toast.makeText(getApplicationContext(),"Registro correcto",Toast.LENGTH_LONG);
                toast.show();


                startActivity(intent);
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
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
