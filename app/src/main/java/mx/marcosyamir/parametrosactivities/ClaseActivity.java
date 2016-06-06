package mx.marcosyamir.parametrosactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClaseActivity extends AppCompatActivity {

    private Button boton;
    private TextView nombre,telefono,email,descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase);

        nombre = (TextView) findViewById(R.id.tvNombre);
        telefono = (EditText) findViewById(R.id.etTelefono);
        //email = (EditText) findViewById(R.id.etEmail);
        //descripcion = (EditText) findViewById(R.id.etDescripcion);
        boton = (Button) findViewById(R.id.btnEditarDatos);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
        recogerExtras();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void recogerExtras() {
        //Aquí recogemos y tratamos los parámetros
        Bundle extras= getIntent().getExtras();
        String s= extras.getString("texto");
        String t= extras.getString("texto");
       // String e= extras.getString("texto");
       // String d= extras.getString("texto");
        nombre.setText(s);
        telefono.setText(t);
       // email.setText(e);
       // descripcion.setText(d);

    }
}

