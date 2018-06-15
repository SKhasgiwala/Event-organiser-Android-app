package com.example.weddingorganizer;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_Vendor extends Fragment {
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
	        View rootView = inflater.inflate(R.layout.layout_vendor, container, false);
	         
	        Button photo=(Button)rootView.findViewById(R.id.button1);
	        Button dj=(Button)rootView.findViewById(R.id.button2);
	        Button catering=(Button)rootView.findViewById(R.id.button3);
	        Button decorator=(Button)rootView.findViewById(R.id.button4);
	        Button designer=(Button)rootView.findViewById(R.id.button5);
	        
	        
	        photo.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getActivity(),BellPhotoActivity.class);
					getActivity().startActivity(i);
				}
			});
	        
	       dj.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getActivity(),BellDjActivity.class);
					getActivity().startActivity(i);
				}
			});
	       
	       catering.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getActivity(),BellCaterActivity.class);
					getActivity().startActivity(i);
				}
			});
	        
	       decorator.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getActivity(),BellDecoratorActivity.class);
					getActivity().startActivity(i);
				}
			});
	       
	       
	       designer.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getActivity(),BellDesignerActivity.class);
					getActivity().startActivity(i);
				}
			});
	        
	        return rootView;
	    }
}