package com.example.a2spinners1list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
    String[] con={"Asia","Europe","Africa","America"};
    String[]countAsia={"Israel","Japan","China","Cambodia","Cyprus","Turkey","india"};
    String[]countAmerica={"Argentina","Brazil","Canada","Chile","Colombia","Mexico","Peru"};
    String[]countEurope={"Poland","Germany","Italy","Spain","France","Austria","Sweden"};
    String[]countAfrica={"Togo","Morocco","Cameroon","Gabon","Chad","Ivory coast","Senegal"};
    String[]cityIsrael={"TelAviv","Jerusalem","BeerSheva","RamatGan","KiryatShmona"};
    String[]cityJapan={};
    String[]cityChina={};
    String[]cityCambodia={};
    String[]cityCyprus={};
    String[]cityTurkey={};
    String[]cityIndia={};
    String[]cityArgentina={};
    String[]cityBrazil={};
    String[]cityCanada={};
    String[]cityChile={};
    String[]cityColombia={};
    String[]cityMexico={};
    String[]cityPeru={};
    String[]cityPoland={};
    String[]cityGermany={"Berlin"};
    String[]cityItaly={};
    String[]citySpain={"Madrid","Barcelona",};
    String[]cityFrance={"Paris",};
    String[]cityAustria={};
    String[]citySweeden={};
    String[]cityTogo={};
    String[]cityMorocco={};
    String[]cityCameron={};
    String[]cityGabon={};
    String[]cityChad={};
    String[]cityIvoryCoast={};
    String[]citySenegal={};

    // all the needed information in arrays
    Spinner cont,state;
    ListView city;
    TextView citnum,land;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        land=(TextView)findViewById(R.id.land);
        citnum=(TextView)findViewById(R.id.citnum);
        city=(ListView)findViewById(R.id.city);
        cont=(Spinner)findViewById(R.id.cont);
        state=(Spinner)findViewById(R.id.state);
        city.setOnItemClickListener(this);
        cont.setOnItemSelectedListener(this);
        state.setOnItemSelectedListener(this);
        ArrayAdapter<String> adpl = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, con);
        cont.setAdapter(adpl);
        city.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }











    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected( AdapterView<?> parent, View view, int position, long id) {
          if(parent==cont){
              switch (position) {
                  case 0: {
                      ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAsia);
                      state.setAdapter(adpl2);

                      break;
                  }
                  case 1: {
                      ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countEurope);
                      state.setAdapter(adpl2);
                      break;
                  }
                  case 2: {
                      ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAfrica);
                      state.setAdapter(adpl2);
                      break;
                  }
                  default: {
                      ArrayAdapter<String> adpl2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countAmerica);
                      state.setAdapter(adpl2);
                      break;
                  }
              }
              // showing the country that fits the continent



          }
          else{


          }
          // showing the city that fits the country in lv
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(),"choose continent and country please",Toast.LENGTH_SHORT);
    }

}