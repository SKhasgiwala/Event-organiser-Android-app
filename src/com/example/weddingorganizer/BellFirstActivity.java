package com.example.weddingorganizer;
import java.io.File;

import com.example.weddingorganizer.*;

import com.example.weddingorganizer.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class BellFirstActivity extends Activity {
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bellfirst);
		SQLiteDatabase db=openOrCreateDatabase("weddingdatabase.sqlite", MODE_PRIVATE, null);
		File result=getApplicationContext().getDatabasePath("weddingdatabase.sqlite");
/*if(!result.exists())
{
	db.execSQL("create table userdetails2(name varchar(20),password varchar(20),email varchar(30) primary key,phone int,date int,month int,year int)");
}*/
		db.execSQL("CREATE TABLE IF NOT EXISTS userdetails(name varchar(20),password varchar(20),email varchar(30) primary key,phone int,date int,month int,year int);");
	
db.close();

		TextView login = (TextView) findViewById(R.id.textView1);
		TextView signup = (TextView) findViewById(R.id.textView2);

		signup.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			Intent i = new Intent(getApplicationContext(),BellSignupActivity.class);
			startActivity(i);
			}
		});

		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),BellSecondActivity.class);
				startActivity(i1);  
			}
		});
	}

}
