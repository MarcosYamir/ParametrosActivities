package mx.marcosyamir.parametrosactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre,telefono,descripcion,email;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.etNombre);
        telefono = (EditText) findViewById(R.id.etTelefono);
        //email = (EditText) findViewById(R.id.etEmail);
        //descripcion = (EditText) findViewById(R.id.etDescripcion);
        boton = (Button) findViewById(R.id.btnSiguiente);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivityNombre(v, (nombre.getText().toString()));
                lanzarActivityTelefono(v, (telefono.getText().toString()));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void lanzarActivityNombre(View v, String nombre) {
        //Aquí lanzaremos el segundo activity
        Intent i = new Intent(this, ClaseActivity.class);
        if (nombre.equals("") || nombre.equals(null))
            i.putExtra("texto", "TEXTO VACÍO");
        else
            i.putExtra("texto", nombre.toString());
        startActivity(i);
    }

    public void lanzarActivityTelefono(View v, String telefono) {
        //Aquí lanzaremos el segundo activity
        Intent i = new Intent(this, ClaseActivity.class);
        if (telefono.equals("") || telefono.equals(null))
            i.putExtra("texto", "TEXTO VACÍO");
        else
            i.putExtra("texto", telefono.toString());
        startActivity(i);
    }

}

