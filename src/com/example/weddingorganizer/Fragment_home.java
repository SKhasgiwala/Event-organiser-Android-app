package com.example.weddingorganizer;

import java.util.Calendar;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_home extends Fragment {
	 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        View rootView = inflater.inflate(R.layout.layout_home, container, false);
        TextView date=(TextView)rootView.findViewById(R.id.textView6);
        TextView month=(TextView)rootView.findViewById(R.id.textView7);
        TextView year=(TextView)rootView.findViewById(R.id.textView8);
    	ImageView img=(ImageView)rootView.findViewById(R.id.logout);
    	/*HomePageActivity hp=new HomePageActivity();
    	date.setText(hp.newdate);
    	month.setText(hp.newmonth);
    	year.setText(hp.newyear);*/

    	 img.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 				Intent i=new Intent(getActivity(),BellFirstActivity.class);
 				getActivity().startActivity(i);
 			}
 		});
       
    /*    BellSecondActivity obj=new BellSecondActivity();
       int userDate=this.getArguments().getInt("name1");
       int userMonth=this.getArguments().getInt("name2");
       int userYear=this.getArguments().getInt("name3");*/
     /*   newdate=getArguments().getInt("key1");
        newmonth=getArguments().getInt("key2");
        newyear=getArguments().getInt("key3");*/

        
       /* int uDate=obj.userDate;
        int uMonth=obj.userMonth;
        int uYear=obj.userYear;*/
        
        //if(userMonth<=sysMonth)
        
       return rootView;
    }
}
