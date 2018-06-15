package com.example.weddingorganizer;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Fragment_Leftover extends Fragment {
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View rootView = inflater.inflate(R.layout.layout_leftover, container, false);
	      
	    	Spinner spin = (Spinner)rootView.findViewById(R.id.spinner);
			String data[] = { "Select Utility", "Food", "Clothes", "Gifts", "Money" };
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_multiple_choice, data);// GUI+data
			spin.setAdapter(adapter);

			spin.setOnItemSelectedListener(new OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// arg0: get widget view
					// arg1: get widget label name
					// arg2: get Item position with name
					// arg3: get Item position with name(when id range is heay )
					Object value = arg0.getItemAtPosition(arg2); // item name
					if (value.equals("Select Utility")) {
						Toast.makeText(getActivity(),"Please Select Utilities", Toast.LENGTH_LONG).show();
					} else if (value.equals("Food")) {
						Intent intent=new Intent(getActivity(),FoodActivity.class);
			        	getActivity().startActivity(intent);
					} else if (value.equals("Clothes")) {
						Intent intent = new Intent(getActivity(),ClothesActivity.class);
						getActivity().startActivity(intent);
					} else if (value.equals("Gifts")) {
						Intent intent = new Intent(getActivity(),GiftsActivity.class);
						getActivity().startActivity(intent);
					} else if (value.equals("Money")) {
						Intent i=new Intent(getActivity(),MoneyActivity.class);
						getActivity().startActivity(i);
					}

				}

				public void onNothingSelected(AdapterView<?> arg0) {
					Toast.makeText(getActivity(), "Please Select Utilities",  Toast.LENGTH_LONG).show();
				}

			});
			
			  return rootView;  
	    }
			
	
	}
