package com.example.weddingorganizer;

import java.util.Calendar;


import info.androidhive.tabsswipe.adapter.TabsPagerAdapter;
import android.os.Build;
import android.os.Bundle; 
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH) public class HomePageActivity extends FragmentActivity implements ActionBar.TabListener{
	 private ViewPager viewPager;
	    private TabsPagerAdapter mAdapter;
	    private ActionBar actionBar;
	    // Tab titles
	    int newdate;
	    int newmonth;
	    int newyear;
	    private String[] tabs = { "Home","Vendor", "Budget", "Guest List","Left Overs","Make Cards"};
	/*  HomePageActivity() {
		// TODO Auto-generated constructor stub
		 newdate=0;
		 newmonth=0;
		 newyear=0;
	}*/
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.homepage);
	       
	       
	        Calendar c = Calendar.getInstance();
	        int sysDate=c.get(Calendar.DATE);
	        int sysMonth=c.get(Calendar.MONTH);
	        int sysYear=c.get(Calendar.YEAR);
	        Intent intent1=getIntent();
	       
	        
	        Bundle collection=intent1.getExtras();
	        int userDate=collection.getInt("name1");
	        int userMonth=collection.getInt("name2");
	        int userYear=collection.getInt("name3");
	        if(userMonth<=sysMonth)
	        {
	        	newmonth=sysMonth-userMonth;
	        	newyear=userYear-sysYear;
	        }
	        else
	        {
	        	newmonth=12+sysMonth-userMonth;
	        	newyear=userMonth-sysMonth-1;
	        	if(newmonth>=12)
	        	{
	        		newmonth=newmonth%12;
	        		newyear=newyear+newmonth/12;
	        	}
	        }
	        if(userDate<=sysDate)
	        {
	        	newdate=userDate-sysDate;
	        }
	        else
	        {
	        	newdate=30-userDate+sysDate;
	        	newmonth=newmonth-1;
	        	if(newdate>=30)
	        	{
	        		newdate=newdate%30;
	        		newmonth=newmonth+newdate/30;
	        	}
	        }
	       
	      /* Bundle bundle=new Bundle();
	       bundle.putInt("key1", userDate);
	       bundle.putInt("key2",userMonth);
	       bundle.putInt("key3", userYear);
	       Fragment_home fh=new Fragment_home();
	       fh.setArguments(bundle);*/
	        // Initilization
	        viewPager = (ViewPager) findViewById(R.id.view_pager);
	        actionBar = getActionBar();
	        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
	 
	        viewPager.setAdapter(mAdapter);
	        actionBar.setHomeButtonEnabled(false);
	        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);        
	 
	        // Adding Tabs
	        for (String tab_name : tabs) {
	            actionBar.addTab(actionBar.newTab().setText(tab_name)
	                    .setTabListener(this));
	        }
	 
	        /**
	         * on swiping the viewpager make respective tab selected
	         * */
	        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
	 
	            @Override
	            public void onPageSelected(int position) {
	            	// on changing the page
	                // make respected tab selected
	                actionBar.setSelectedNavigationItem(position);
	            }
	 
	            @Override
	            public void onPageScrolled(int arg0, float arg1, int arg2) {
	            }
	 
	            @Override
	            public void onPageScrollStateChanged(int arg0) {
	            }
	        });
	    }
	 
	   
		@Override
		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			 viewPager.setCurrentItem(tab.getPosition());
		}

		@Override
		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}

		
	
	

}
