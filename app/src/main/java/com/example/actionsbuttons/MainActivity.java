package com.example.actionsbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para mostar los botones de accion
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuacciones,menu);
        return true;

    }
    //metodo para agregar las actiones a todos los botones

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.compartir) {
            Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.buscar) {
            Toast.makeText(this, "buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.item1) {
            Toast.makeText(this, "opcion1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.item2) {
            Toast.makeText(this, "opcion2", Toast.LENGTH_SHORT).show();
            return true;
        }

    return super.onOptionsItemSelected(item);
    }
}