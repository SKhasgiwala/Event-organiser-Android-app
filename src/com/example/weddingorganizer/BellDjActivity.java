package com.example.weddingorganizer;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class BellDjActivity extends Activity{
ArrayList photos;

	
	
	public void onCreate(Bundle savedInstanceState) throws OutOfMemoryError {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bellphoto1);
		Button one=(Button)findViewById(R.id.button1);
		Button two=(Button)findViewById(R.id.button2);
		Button three=(Button)findViewById(R.id.button3);
		Button four=(Button)findViewById(R.id.button4);
		Button five=(Button)findViewById(R.id.button5);
		Button six=(Button)findViewById(R.id.button6);
		
  	 

		vendorslist ob=new vendorslist();
		photos=new ArrayList();
		photos=ob.DJevent();
		 one.setText(photos.get(0).toString());
	  	  two.setText(photos.get(1).toString());
	  	  three.setText(photos.get(2).toString());
	  	  four.setText(photos.get(3).toString());
	  	  five.setText(photos.get(4).toString());
	  	  six.setText(photos.get(5).toString());
		
}
}
