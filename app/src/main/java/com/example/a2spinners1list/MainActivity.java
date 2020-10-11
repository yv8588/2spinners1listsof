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
         switch (position){
             case 0: {
                 land.setText("52");
                 citnum.setText("460,613");
                 break;
             }
             case 1: {
                 land.setText("125.156");
                 citnum.setText("936,425");
                 break;
             }
             case 2: {
                 land.setText("117.5");
                 citnum.setText("209,697");
                 break;
             }
             case 3: {
                 land.setText("12.241");
                 citnum.setText("163,301");
                 break;
             }
             case 4: {
                 land.setText("9.96");
                 citnum.setText("22,512");
             }
         }

      break;
     }
     case "Japan": {

         switch (position){
             case 0: {
                 land.setText("326.45");
                 citnum.setText("2,283,289");
                 break;
             }
             case 1: {
                 land.setText("261.35");
                 citnum.setText("377,045");
                 break;
             }
             case 2: {
                 land.setText("387.24");
                 citnum.setText("371,380");
                 break;
             }
             case 3: {
                 land.setText("113.91");
                 citnum.setText("375,339");
                 break;
             }
             case 4: {
                 land.setText("111.61");
                 citnum.setText("132,311");
             }
         }

         break;
     }
     case "China": {

         switch (position){
             case 0: {
                 land.setText("16,410.5");
                 citnum.setText("21,000,000");
                 break;
             }
             case 1: {
                 land.setText("82,403");
                 citnum.setText("30,484,300");
                 break;
             }
             case 2: {
                 land.setText("6,341");
                 citnum.setText("24,281,400");
                 break;
             }
             case 3: {
                 land.setText("11,946");
                 citnum.setText("15,621,200");
                 break;
             }
             case 4: {
                 land.setText("13,590");
                 citnum.setText("5,311,379");
             }
         }

         break;
     }
     case "Cambodia": {
         switch (position){
             case 0: {
                 land.setText("679");
                 citnum.setText("1,474,489");
                 break;
             }
             case 1: {
                 land.setText("unknown");
                 citnum.setText("250,789");
                 break;
             }
             case 2: {
                 land.setText("293");
                 citnum.setText("163,347");
                 break;
             }
             case 3: {
                 land.setText("80");
                 citnum.setText("100,856");
                 break;
             }
             case 4: {
                 land.setText("unknown");
                 citnum.setText("84,738");
             }
         }

    break;
     }
     case "Cyprus": {
         switch (position){
             case 0: {
                 land.setText("51.06");
                 citnum.setText("244,200");
                 break;
             }
             case 1: {
                 land.setText("34.87");
                 citnum.setText("154,000");
                 break;
             }
             case 2: {
                 land.setText("unknown");
                 citnum.setText("67,904");
                 break;
             }
             case 3: {
                 land.setText("unknown");
                 citnum.setText("51,468");
                 break;
             }
             case 4: {
                 land.setText("unknown");
                 citnum.setText("42,526");
             }
         }
     break;
     }

     case "Turkey": {

         switch (position){
             case 0: {
                 land.setText("2,576.85");
                 citnum.setText("15,519,267");
                 break;
             }
             case 1: {
                 land.setText("24,521");
                 citnum.setText("5,700,000");
                 break;
             }
             case 2: {
                 land.setText("944");
                 citnum.setText("4,367,251");
                 break;
             }
             case 3: {
                 land.setText("1,036");
                 citnum.setText("1,854,285");
                 break;
             }
             case 4: {
                 land.setText("1,945");
                 citnum.setText("1,768,860");
             }
         }

     break;
     }

     case "India": {

         switch (position){
             case 0: {
                 land.setText("603");
                 citnum.setText("12,478,474");
                 break;
             }
             case 1: {
                 land.setText("1,484");
                 citnum.setText("16,787,941");
                 break;
             }
             case 2: {
                 land.setText("709");
                 citnum.setText("8,443,675");
                 break;
             }
             case 3: {
                 land.setText("625");
                 citnum.setText("6,809,970");
                 break;
             }
             case 4: {
                 land.setText("464.16");
                 citnum.setText("5,663,927");
             }
         }

   break;
     }
     // all asia countries
     case "Argentina": {
         switch (position){
             case 0: {
                 land.setText("203");
                 citnum.setText("2,891,082");
                 break;
             }
             case 1: {
                 land.setText("576");
                 citnum.setText("1,391,289");
                 break;
             }
             case 2: {
                 land.setText("178.69");
                 citnum.setText("1,276,000");
                 break;
             }
             case 3: {
                 land.setText("90");
                 citnum.setText("548,866");
                 break;
             }
             case 4: {
                 land.setText("54");
                 citnum.setText("115,021");
             }
         }

    break;
     }
     case "Brazil": {

         switch (position){
             case 0: {
                 land.setText("2,482.22");
                 citnum.setText("41,266,199");
                 break;
             }
             case 1: {
                 land.setText("43,696");
                 citnum.setText("15,989,929");
                 break;
             }
             case 2: {
                 land.setText("5,802");
                 citnum.setText("2,570,160");
                 break;
             }
             case 3: {
                 land.setText("5,657.33");
                 citnum.setText("14,016,906");
                 break;
             }
             case 4: {
                 land.setText("14,348.3");
                 citnum.setText("8,452,381");
             }
         }

    break;
     }
     case "Canada": {
         switch (position){
             case 0: {
                 land.setText("1,792.99");
                 citnum.setText("5,429,524");
                 break;
             }
             case 1: {
                 land.setText("431.5");
                 citnum.setText("1,704,694");
                 break;
             }
             case 2: {
                 land.setText("114.97");
                 citnum.setText("631,486");
                 break;
             }
             case 3: {
                 land.setText("767.85");
                 citnum.setText("932,546");
                 break;
             }
             case 4: {
                 land.setText("825.56");
                 citnum.setText("1,239,220");
             }
         }

    break;
     }
     case "Chile": {

         switch (position){
             case 0: {
                 land.setText("641");
                 citnum.setText("5,220,161");
                 break;
             }
             case 1: {
                 land.setText("16,396");
                 citnum.setText("1,790,219");
                 break;
             }
             case 2: {
                 land.setText("23,890.2");
                 citnum.setText("1,557,414");
                 break;
             }
             case 3: {
                 land.setText("46,579");
                 citnum.setText("742178");
                 break;
             }
             case 4: {
                 land.setText("30,718");
                 citnum.setText("352,638");
             }
         }

      break;
     }
     case "Colombia": {

         switch (position){
             case 0: {
                 land.setText("1,587");
                 citnum.setText("7,412,566");
                 break;
             }
             case 1: {
                 land.setText("380.64");
                 citnum.setText("2,569,007");
                 break;
             }
             case 2: {
                 land.setText("619");
                 citnum.setText("2,227,642");
                 break;
             }
             case 3: {
                 land.setText("unknown");
                 citnum.setText("1,206,319");
                 break;
             }
             case 4: {
                 land.setText("572");
                 citnum.setText("914,552");
             }
         }

         break;
     }

     case "Mexico": {

         switch (position){
             case 0: {
                 land.setText("1,485");
                 citnum.setText("8,918,653");
                 break;
             }
             case 1: {
                 land.setText("637");
                 citnum.setText("1,902,385");
                 break;
             }
             case 2: {
                 land.setText("151");
                 citnum.setText("1,460,148");
                 break;
             }
             case 3: {
                 land.setText("1,219.67");
                 citnum.setText("1,454,973");
                 break;
             }
             case 4: {
                 land.setText("321.19");
                 citnum.setText("1,321,004");
             }
         }

         break;
     }

     case "Peru": {

         switch (position){
             case 0: {
                 land.setText("2,672.3");
                 citnum.setText("9,562,280");
                 break;
             }
             case 1: {
                 land.setText("2,923.56");
                 citnum.setText("1,008,290");
                 break;
             }
             case 2: {
                 land.setText("1,100");
                 citnum.setText("919,899");
                 break;
             }
             case 3: {
                 land.setText("174.46");
                 citnum.setText("552,508");
                 break;
             }
             case 4: {
                 land.setText("621.2");
                 citnum.setText("473,025");
             }
         }

         break;
     }
     // all america countries
     case "Poland": {

         switch (position){
             case 0: {
                 land.setText("517.24");
                 citnum.setText("1,790,658");
                 break;
             }
             case 1: {
                 land.setText("326.8");
                 citnum.setText("779,115");
                 break;
             }
             case 2: {
                 land.setText("293.25");
                 citnum.setText("679,941");
                 break;
             }
             case 3: {
                 land.setText("292.85");
                 citnum.setText("643,782");
                 break;
             }
             case 4: {
                 land.setText("261.85");
                 citnum.setText("534,813");
             }
         }

         break;
     }
     case "Germany": {

         switch (position){
             case 0: {
                 land.setText("891.1");
                 citnum.setText("3,769,495");
                 break;
             }
             case 1: {
                 land.setText("755.22");
                 citnum.setText("1,899,160");
                 break;
             }
             case 2: {
                 land.setText("310.43");
                 citnum.setText("1,484,226");
                 break;
             }
             case 3: {
                 land.setText("405.15");
                 citnum.setText("1,087,863");
                 break;
             }
             case 4: {
                 land.setText("248.31");
                 citnum.setText("763,380");
             }
         }

         break;
     }
     case "Italy": {

         switch (position){
             case 0: {
                 land.setText("1,285");
                 citnum.setText("2,860,009");
                 break;
             }
             case 1: {
                 land.setText("181.76");
                 citnum.setText("1,400,000");
                 break;
             }
             case 2: {
                 land.setText("119.02");
                 citnum.setText("967,068");
                 break;
             }
             case 3: {
                 land.setText("130.17");
                 citnum.setText("869,200");
                 break;
             }
             case 4: {
                 land.setText("158.9");
                 citnum.setText("678,118");
             }
         }

         break;
     }
     case "Spain": {

         switch (position){
             case 0: {
                 land.setText("604.13");
                 citnum.setText("3,223,334");
                 break;
             }
             case 1: {
                 land.setText("101.4");
                 citnum.setText("1,620,343");
                 break;
             }
             case 2: {
                 land.setText("134.65");
                 citnum.setText("801,456");
                 break;
             }
             case 3: {
                 land.setText("140");
                 citnum.setText("688,711");
                 break;
             }
             case 4: {
                 land.setText("41.5");
                 citnum.setText("345,821");
             }
         }

         break;
     }
     case "France": {

         switch (position){
             case 0: {
                 land.setText("105.4");
                 citnum.setText("2,148,271");
                 break;
             }
             case 1: {
                 land.setText("240.62");
                 citnum.setText("869,815");
                 break;
             }
             case 2: {
                 land.setText("47.87");
                 citnum.setText("516,092");
                 break;
             }
             case 3: {
                 land.setText("118.3");
                 citnum.setText("479,553");
                 break;
             }
             case 4: {
                 land.setText("71.92");
                 citnum.setText("340,017");
             }
         }

         break;
     }

     case "Austria": {
         switch (position){
             case 0: {
                 land.setText("414.78");
                 citnum.setText("1,888,776");
                 break;
             }
             case 1: {
                 land.setText("127.57");
                 citnum.setText("294,630");
                 break;
             }
             case 2: {
                 land.setText("96");
                 citnum.setText("204,846");
                 break;
             }
             case 3: {
                 land.setText("65.65");
                 citnum.setText("156,872");
                 break;
             }
             case 4: {
                 land.setText("104,91");
                 citnum.setText("132,493");
             }
         }
         break;
     }

     case "Sweden": {

         switch (position){
             case 0: {
                 land.setText("104.91");
                 citnum.setText("132,493");
                 break;
             }
             case 1: {
                 land.setText("447.76");
                 citnum.setText("975,904");
                 break;
             }
             case 2: {
                 land.setText("332.6");
                 citnum.setText("334,116");
                 break;
             }
             case 3: {
                 land.setText("48.77");
                 citnum.setText("172,402");
                 break;
             }
             case 4: {
                 land.setText("52.94");
                 citnum.setText("127,799");
             }
         }

      break;
     }
     // all Europe countries
     case "Togo": {
         switch (position){
         case 0: {
             land.setText("99.4");
             citnum.setText("837,437");
             break;
         }
         case 1: {
             land.setText("unknown");
             citnum.setText("118,000");
             break;
         }
         case 2: {
             land.setText("unknown");
             citnum.setText("94,878");
             break;
         }
         case 3: {
             land.setText("unknown");
             citnum.setText("75,084");
             break;
         }
         case 4: {
             land.setText("unknown");
             citnum.setText("84,979");
         }
     }
         break;
     }
     case "Morocco": {
         switch (position){
         case 0: {
             land.setText("220");
             citnum.setText("3,359,818");
             break;
         }
         case 1: {
             land.setText("320");
             citnum.setText("1,224,000");
             break;
         }
         case 2: {
             land.setText("unknown");
             citnum.setText("947,952");
             break;
         }
         case 3: {
             land.setText("unknown");
             citnum.setText("98,850");
             break;
         }
         case 4: {
             land.setText("unknown");
             citnum.setText("890,403");
         }
     }
         break;
     }
     case "Cameroon": {
         switch (position){
         case 0: {
             land.setText("180");
             citnum.setText("2,765,600");
             break;
         }
         case 1: {
             land.setText("210");
             citnum.setText("2,768,400");
             break;
         }
         case 2: {
             land.setText("unknown");
             citnum.setText("348,766");
             break;
         }
         case 3: {
             land.setText("402");
             citnum.setText("1,146,060");
             break;
         }
         case 4: {
             land.setText("unknown");
             citnum.setText("600,000");
         }
     }
         break;
     }
     case "Gabon": {
         switch (position){
         case 0: {
             land.setText("65.42");
             citnum.setText("703,904");
             break;
         }
         case 1: {
             land.setText("unknown");
             citnum.setText("136,462");
             break;
         }
         case 2: {
             land.setText("unknown");
             citnum.setText("110,568");
             break;
         }
         case 3: {
             land.setText("unknown");
             citnum.setText("60,685");
             break;
         }
         case 4: {
             land.setText("unknown");
             citnum.setText("59,154");
         }
     }
         break;
     }
     case "Chad": {
         switch (position){
         case 0: {
             land.setText("104");
             citnum.setText("951,418");
             break;
         }
         case 1: {
             land.setText("unknown");
             citnum.setText("137,922");
             break;
         }
         case 2: {
             land.setText("unknown");
             citnum.setText("103,269");
             break;
         }
         case 3: {
             land.setText("unknown");
             citnum.setText("97,963");
             break;
         }
         case 4: {
             land.setText("unknown");
             citnum.setText("57,859");
         }
     }
         break;
     }

     case "Ivory coast": {
         switch(position) {
             case 0: {
                 land.setText("2,199");
                 citnum.setText("3,667,115");
                 break;
             }
             case 1: {
                 land.setText("71.8k");
                 citnum.setText("570,833");
                 break;
             }
             case 2: {
                 land.setText("5,305");
                 citnum.setText("319,427");
                 break;
             }
             case 3: {
                 land.setText("3,500");
                 citnum.setText("361,893");
                 break;
             }
             case 4: {
                 land.setText("unknown");
                 citnum.setText("261,616");

             }
         }
         break;

     }

     case "Senegal": {
         switch (position) {
             case 0: {
                 land.setText("83km");
                 citnum.setText("1,146,053");
                 break;
             }
             case 1: {
                 land.setText("unknown");
                 citnum.setText("529,176");
                 break;
             }
             case 2: {
                 land.setText("unknown");
                 citnum.setText("320,000");
                 break;
             }
             case 3: {
                 land.setText("372km^2");
                 citnum.setText("490,694");
                 break;
             }
             case 4: {
                 land.setText("unknown");
                 citnum.setText("1,146,053");
             }
         }

     }
     // all africa countries
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

