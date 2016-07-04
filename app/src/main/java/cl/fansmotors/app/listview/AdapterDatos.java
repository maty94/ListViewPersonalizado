package cl.fansmotors.app.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by matias on 04-07-2016.
 */
public class AdapterDatos extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Datos> items;

    public AdapterDatos(Activity activity, ArrayList<Datos> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return items.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(view == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista,null);
        }
        final Datos datos = items.get(i);
        ImageView foto = (ImageView)v.findViewById(R.id.imagen1);
        foto.setImageDrawable(datos.getFoto());
        TextView nombre = (TextView)v.findViewById(R.id.texto1);
        nombre.setText(datos.getNombre());
        TextView info = (TextView)v.findViewById(R.id.texto2);
        info.setText(datos.getInfo());
        Button b=(Button)v.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return v;
    }
    
}
