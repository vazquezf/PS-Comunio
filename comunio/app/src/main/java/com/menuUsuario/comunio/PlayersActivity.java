package com.menuUsuario.comunio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jugadores.comunio.ListaJugadores;
import com.jugadores.comunio.aJugadores;
import com.jugadores.comunio.*;

import com.comunio.grupo8.comunio.R;

import java.util.List;

/**
 * Created by Carlos on 31/10/2015.
 */
public class PlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        ListaJugadores list = new ListaJugadores();

        list.add(new CentroCampista("Luka Modric","Real Madrid",5000000));
        list.add(new CentroCampista("Toni kross","Real Madrid",4000000));
        list.add(new CentroCampista("Andres Iniesta","Barcelona FC",5000000));
        list.add(new CentroCampista("Sergio Busquets","Barcelona FC",4000000));
        list.add(new CentroCampista("Ivan Rakitic","Barcelona FC",6000000));
        list.add(new CentroCampista("Koke Resurreccion","Atletico de Madrid",5000000));
        list.add(new CentroCampista("Gabi","Atletico de Madrid",4000000));
        list.add(new CentroCampista("Dani Parejo","Valencia",4000000));
        list.add(new CentroCampista("Andre Gomes","Valencia",5000000));
        list.add(new CentroCampista("Pablo Piatti","Valencia",4500000));
        list.add(new CentroCampista("Bruno Soriano","Villareal",4000000));
        list.add(new CentroCampista("Jonathan dos Santos","Villareal",4500000));
        list.add(new CentroCampista("Samuel Castillejo","Villareal",4000000));
        list.add(new CentroCampista("BeÒat","Athletic de Bilbao",4000000));
        list.add(new CentroCampista("Ever Banega","Sevilla",3000000));
        list.add(new Portero("Keylor Navas","Real madrid",4000000));
        list.add(new Portero("Kiko casilla","Real madrid",2400000));
        list.add(new Portero("Ter stegen","Barcelona FC",3000000));
        list.add(new Portero("Claudio Bravo","Barcelona FC",4000000));
        list.add(new Portero("Jan Oblak","Atletico de Madrid",4000000));
        list.add(new Portero("Sergio Asenjo","Villareal",3500000));
        list.add(new Portero("Diego Alves","valencia",5000000));
        list.add(new Portero("Gorka Iraizoz","Athletic de Bilbao",3000000));
        list.add(new Portero("Beto","Sevilla",4000000));
        list.add(new Portero("Guaita","Getafe",3000000));
        list.add(new Defensa("Sergio Ramos","Real madrid",9000000));
        list.add(new Defensa("Pepe","Real madrid",5000000));
        list.add(new Defensa("Raphael Varane","Real madrid",4000000));
        list.add(new Defensa("Gerard Pique","Barcelona FC",5000000));
        list.add(new Defensa("Jeremy Mathieu","Barcelona FC",3000000));
        list.add(new Defensa("Dani Alves","Barcelona FC",3000000));
        list.add(new Defensa("Filipe luis","Atletico de Madrid",4000000));
        list.add(new Defensa("Diego Godin","Atletico de Madrid",6000000));
        list.add(new Defensa("JuanFran Torres","Atletico de Madrid",5000000));
        list.add(new Defensa("Mateo Musacchio","Villareal",3000000));
        list.add(new Defensa("Eric Bailly","Villareal",3000000));
        list.add(new Defensa("Mario Gaspar","Villareal",2000000));
        list.add(new Defensa("shkodran Mustafi","valencia",4000000));
        list.add(new Defensa("Jose Luis Gaya","valencia",5000000));
        list.add(new Defensa("Joao Cancelo","valencia",3000000));
        list.add(new Defensa("Lucas orban","valencia",2000000));
        list.add(new Defensa("Ibai Gomez","Athletic de Bilbao",4000000));
        list.add(new Defensa("Daniel Carrico","Sevilla",4000000));
        list.add(new Defensa("Adil Rami","Sevilla",3000000));
        list.add(new Defensa("Alexis Ruano","Getafe",2000000));
        list.add(new Delantero("Cristiano Ronaldo","Real madrid",12000000));
        list.add(new Delantero("Karim Benzema","Real madrid",10000000));
        list.add(new Delantero("Gareth Bale","Real madrid",10000000));
        list.add(new Delantero("Lionel Messi","Barcelona FC",12000000));
        list.add(new Delantero("Luis Suarez","Barcelona FC",10000000));
        list.add(new Delantero("Neymar jr","Barcelona FC",10000000));
        list.add(new Delantero("Fernando Torres","Atletico de Madrid",5000000));
        list.add(new Delantero("Jackson Martinez","Atletico de Madrid",5000000));
        list.add(new Delantero("Antoine Griezzmann","Atletico de Madrid",5000000));
        list.add(new Delantero("Alvaro Negredo","valencia",5000000));
        list.add(new Delantero("Paco Alcacer","valencia",6000000));
        list.add(new Delantero("Roberto Soldado","Villareal",6000000));
        list.add(new Delantero("Leo Baptistao","Villareal",5000000));
        list.add(new Delantero("Aritz Aduriz","Athletic de Bilbao",7000000));
        list.add(new Delantero("Iker Muniain","Athletic de Bilbao",5000000));
        list.add(new Delantero("IÒaki Williams","Athletic de Bilbao",6000000));

        final ListView listview = (ListView) findViewById(R.id.listView);


        final ArrayAdapter<aJugadores> adapter = new ArrayAdapter<aJugadores>(this,
                android.R.layout.simple_list_item_1, (List<aJugadores>) list);


        listview.setAdapter(adapter);

    }
}