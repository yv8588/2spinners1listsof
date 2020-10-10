package com.example.a2spinners1list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
    String[] con = {"Asia", "Europe", "Africa", "America"};
    String[] countAsia = {"Israel", "Japan", "China", "Cambodia", "Cyprus", "Turkey", "india"};
    String[] countAmerica = {"Argentina", "Brazil", "Canada", "Chile", "Colombia", "Mexico", "Peru"};
    String[] countEurope = {"Poland", "Germany", "Italy", "Spain", "France", "Austria", "Sweden"};
    String[] countAfrica = {"Togo", "Morocco", "Cameroon", "Gabon", "Chad", "Ivory coast", "Senegal"};
    HashMap<String, String[]> cities = new HashMap<>();
    // hash map for all the needed information
    Spinner cont, state;
    ListView city;
    TextView citnum, land;
    String choose = "Asia";
    String choosec="Israel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cities.put("Togo", new String[]{"lome", "sokode", "kara", "kpalime", "atakpame"});
        cities.put("Morocco", new String[]{"casablanca", "fes", "tangier", "marrakesh", "sale"});
        cities.put("Cameron", new String[]{"yaounde", "douala", "bamenda", "bafoussam", "garoua"});
        cities.put("Gabon", new String[]{"libreville", "port gentil", "masuku", "oyem", "moanda"});
        cities.put("Chad", new String[]{"ndjamena", "moundou", "sarh", "abeche", "kelo"});
        cities.put("Ivory Coast", new String[]{"abidjan", "bouake", "daloa", "yamoussokro", "san pedro"});
        cities.put("Senegal", new String[]{"dakar", "touba", "thies", "rufisuqe", "kaolack"});
        // all africa
        cities.put("Sweden", new String[]{"stockholm", "gothenburg", "malmo", "uppsala", "vasteras"});
        cities.put("Austria", new String[]{"viena", "graz", "linz", "salzburg", "innsburck"});
        cities.put("France", new String[]{"paris", "marseille", "lyon", "touluse", "nice"});
        cities.put("Spain", new String[]{"Madrid", "Barcelona", "valencia", "seville", "bilbao"});
        cities.put("Italy", new String[]{"rome", "milano", "napoli", "turino", "palermo"});
        cities.put("Germany", new String[]{"Berlin", "hamburg", "munich", "cologne", "frankfurt"});
        cities.put("Poland", new String[]{"warsaw", "krakow", "lodz", "wroclaw", "poznan"});
        // all europe
        cities.put("Peru", new String[]{"lima", "arequipa", "trujilo", "chiclayo", "piura"});
        cities.put("Mexico", new String[]{"mexico city", "tijuana", "guadalajara", "leon", "ciudad juarez"});
        cities.put("Colombia", new String[]{"bogota", "medellin", "cali", "barranquila", "cartegena"});
        cities.put("Chile", new String[]{"santiago", "valaparsio", "concepcion", "la serana"});
        cities.put("Canada", new String[]{"tornto", "montreal", "vancouver", "calgary", "edmonton"});
        cities.put("Brazil", new String[]{"sao paulo", "rio", "distrito federal", "bahia", "ceara"});
        cities.put("Argentina", new String[]{"buenos aires", "cordoba", "rosario", "mendoza", "tucuman"});
        // all america
        cities.put("Israel", new String[]{"TelAviv", "Jerusalem", "BeerSheva", "RamatGan", "KiryatShmona"});
        cities.put("Japan", new String[]{"Nagoya", "Toyohashi", "Okazaki", "Ichinomiya", "Seto"});
        cities.put("China", new String[]{"Beijing", "Chongqing", "Shanghai", "Tianjin", "Anqing"});
        cities.put("Cambodia", new String[]{"Phnom Penh", "Siem Reap", "Battambang", "Preah Sihanouk", "Serei Saophoan"});
        cities.put("Cyprus", new String[]{"nicosia", "limassol", "Strovolos", "larnaca", "Famagusta"});
        cities.put("Turkey", new String[]{"istanbul", "ankara", "izmir", "bursa", "adana"});
        cities.put("India", new String[]{"mumbai", "delhi", "bangalore", "hyderbad", "ahmedabad"});
        //all asia
        land = (TextView) findViewById(R.id.land);
        citnum = (TextView) findViewById(R.id.citnum);
        city = (ListView) findViewById(R.id.city);
        cont = (Spinner) findViewById(R.id.cont);
        state = (Spinner) findViewById(R.id.state);
        city.setOnItemClickListener(this);
        cont.setOnItemSelectedListener(this);
        state.setOnItemSelectedListener(this);
        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, con);
        cont.setAdapter(adpl);
        city.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
 switch (choosec) {
     case "Israel": {
         break;
     }
     case "Japan": {
         break;
     }
     case "China": {
         break;
     }
     case "Cambodia": {
         break;
     }
     case "Cyprus": {
         break;
     }

     case "Turkey": {
         break;
     }

     case "India": {

     }// all asia countries
 }


 }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent == cont) {
            switch (position) {
                case 0: {
                    ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAsia);
                    state.setAdapter(adpl2);
                    choose = con[0];
                    break;
                }
                case 1: {
                    ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countEurope);
                    state.setAdapter(adpl2);
                    choose = con[1];
                    break;
                }
                case 2: {
                    ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAfrica);
                    state.setAdapter(adpl2);
                    choose = con[2];
                    break;
                }
                default: {
                    ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAmerica);
                    state.setAdapter(adpl2);
                    break;
                }
            }
            // showing the country that fits the continent


        } else {
            if (choose.equals("Asia")) {
                switch (position) {
                    case 0: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Israel"));
                        city.setAdapter(adpl);
                        choosec="Israel";
                        break;
                    }
                    case 1: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Japan"));
                        city.setAdapter(adpl);
                        choosec="Japan";
                        break;
                    }
                    case 2: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("China"));
                        city.setAdapter(adpl);
                        choosec="China";
                        break;
                    }
                    case 3: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Cambodia"));
                        city.setAdapter(adpl);
                        choosec="Cambodia";
                    }
                    case 4: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Cyprus"));
                        city.setAdapter(adpl);
                        choosec="Cyprus";
                        break;
                    }
                    case 5: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Turkey"));
                        city.setAdapter(adpl);
                        choosec="Turkey";
                        break;
                    }
                    case 6: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("India"));
                        city.setAdapter(adpl);
                        choosec="India";
                    }
                }
            } //all asia
            else if (choose.equals("Africa")) {
                switch (position) {
                    case 0: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Togo"));
                        city.setAdapter(adpl);
                        choosec="Togo";
                        break;
                    }
                    case 1: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Morocco"));
                        city.setAdapter(adpl);
                        choosec="Morocco";
                        break;
                    }
                    case 2: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Cameroon"));
                        city.setAdapter(adpl);
                        choosec="Cameroon";
                        break;
                    }
                    case 3: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Gabon"));
                        city.setAdapter(adpl);
                        choosec="Gabon";
                    }
                    case 4: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Chad"));
                        city.setAdapter(adpl);
                        choosec="Chad";
                        break;
                    }
                    case 5: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Ivory coast"));
                        city.setAdapter(adpl);
                        choosec="Ivory coast";
                        break;
                    }
                    case 6: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Senegal"));
                        city.setAdapter(adpl);
                        choosec="Senegal";
                    }
                }

            } // all africa
            else if (choose.equals("Europe")) {
                switch (position) {
                    case 0: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Poland"));
                        city.setAdapter(adpl);
                        choosec="Poland";
                        break;
                    }
                    case 1: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Germany"));
                        city.setAdapter(adpl);
                        choosec="Germany";
                        break;
                    }
                    case 2: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Italy"));
                        city.setAdapter(adpl);
                        choosec="Italy";
                        break;
                    }
                    case 3: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Spain"));
                        city.setAdapter(adpl);
                        choosec="Spain";
                    }
                    case 4: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("France"));
                        city.setAdapter(adpl);
                        choosec="France";
                        break;
                    }
                    case 5: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Austria"));
                        city.setAdapter(adpl);
                        choosec="Austria";
                        break;
                    }
                    case 6: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Sweden"));
                        city.setAdapter(adpl);
                        choosec="Sweden";
                    }
                }
            }//all europe
            else {
                switch (position) {
                    case 0: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Argentina"));
                        city.setAdapter(adpl);
                        choosec="Argentina";
                        break;
                    }
                    case 1: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Brazil"));
                        city.setAdapter(adpl);
                        choosec="Brazil";
                        break;
                    }
                    case 2: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Canada"));
                        city.setAdapter(adpl);
                        choosec="Canada";
                        break;
                    }
                    case 3: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Chile"));
                        city.setAdapter(adpl);
                        choosec="Chile";
                        break;
                    }
                    case 4: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Colombia"));
                        city.setAdapter(adpl);
                        choosec="Colombia";
                        break;
                    }
                    case 5: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Mexico"));
                        city.setAdapter(adpl);
                        choosec="Mexico";
                        break;
                    }
                    case 6: {
                        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities.get("Peru"));
                        city.setAdapter(adpl);
                        choosec="Peru";
                    }

                }
            }
        }
    }   // showing the cities that fits the country in lv
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), "choose continent and country please", Toast.LENGTH_SHORT);
    }
}

