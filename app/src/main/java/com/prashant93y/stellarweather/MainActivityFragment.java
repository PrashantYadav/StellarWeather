package com.prashant93y.stellarweather;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<String> weekForecast = new ArrayList<>();

        weekForecast.add("Today-Sunny-88/63");
        weekForecast.add("Tomorrow-Foggy-87/63");
        weekForecast.add("Mon-Sunny-88/63");
        weekForecast.add("Weds-Rainy-88/63");
        weekForecast.add("Thurs-Sunny-88/63");
        weekForecast.add("Fri-Rainy-88/63");
        weekForecast.add("Sat-Sunny-88/63");

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,
                R.id.list_item_forecast_textView, weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        Log.e("Listview",listView+"");

        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
