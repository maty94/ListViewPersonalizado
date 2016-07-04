package cl.fansmotors.app.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView)findViewById(R.id.lista);
        ArrayList<Datos> arraydatos = new ArrayList<Datos>();
        Datos datos;

        datos = new Datos(getResources().getDrawable(R.mipmap.ic_launcher),"foto 1","tipo png");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.mipmap.ic_launcher),"foto 2","tipo png");
        arraydatos.add(datos);

        AdapterDatos adapter = new AdapterDatos(this, arraydatos);

        lista.setAdapter(adapter);
    }
}
