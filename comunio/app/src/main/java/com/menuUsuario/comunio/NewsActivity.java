package com.menuUsuario.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.comunio.grupo8.comunio.R;

import java.util.List;

public class NewsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ListView news = (ListView) findViewById(R.id.miLista);

        news.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        View v = parent.getSelectedView();
        int i = (int) id;

        switch(i){
            case 3:
                Intent updClas = new Intent(this, ClasificationUpdActivity.class);
                startActivity(updClas);
        }
    }
}
