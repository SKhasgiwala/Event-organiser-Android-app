package com.example.weddingorganizer;


import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class BellSignupActivity extends Activity {
	EditText editTextUserName,editTextEmail,editTextPhone, editTextPassword;
	Spinner date,month,year;
	Button btnCreateAccount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bellsignup);
		ImageView back=(ImageView)findViewById(R.id.imageView1);
	    CheckBox eye=(CheckBox)findViewById(R.id.checkBox1);
	    TextView tv1=(TextView)findViewById(R.id.textView1);
		editTextUserName = (EditText) findViewById(R.id.editText1);
		editTextEmail = (EditText) findViewById(R.id.editText2);
		editTextPhone = (EditText) findViewById(R.id.editText3);
		editTextPassword = (EditText) findViewById(R.id.editText5);
		 date=(Spinner)findViewById(R.id.spinner1);
		 month=(Spinner)findViewById(R.id.spinner2);
		 year=(Spinner)findViewById(R.id.spinner3);
		 ArrayList list1 =new ArrayList();
		 list1.add("DD");
		 for(int i=1;i<=31;i++)
		 {
			 list1.add(i);
		 }
		 ArrayAdapter dateAdapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list1);
		 date.setAdapter(dateAdapter);
		 
		 
		 
		
		 ArrayList list2 =new ArrayList();
		 list2.add("MM");
		 for(int i=1;i<=12;i++)
		 {
			 list2.add(i);
		 }
		 ArrayAdapter monthAdapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list2);
		 month.setAdapter(monthAdapter);

		 
		 ArrayList list3 =new ArrayList();
		 list3.add("yyyy");
		 for(int i=2016;i<=2030;i++)
		 {
			 list3.add(i);
		 }
		 ArrayAdapter yearAdapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list3);
		 year.setAdapter(yearAdapter);


		
		btnCreateAccount = (Button) findViewById(R.id.button1);
		
		btnCreateAccount.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				

				String userName = editTextUserName.getText().toString();
				String password = editTextPassword.getText().toString();
				 String email = editTextEmail.getText().toString();
				String phone = editTextPhone.getText().toString();
				if(!userName.equals(" ")&&!password.equals(" ")&& !phone.equals(" ")&&!email.equals(" ")&&!date.getSelectedItem().equals("DD")&&!month.getSelectedItem().equals("MM")&&!year.getSelectedItem().equals("YYYY"))
				{if(phone.length()!=10)
				{
					Toast.makeText(getApplicationContext(), "Invalid phone number  ", Toast.LENGTH_LONG).show();
				}
				else
				{
					Integer dateOf=(Integer)date.getSelectedItem(); 
					Integer monthOf=(Integer)month.getSelectedItem();
					Integer yearOf=(Integer)year.getSelectedItem();
					
				
				SQLiteDatabase db=openOrCreateDatabase("weddingdatabase.sqlite", MODE_PRIVATE, null);
				Cursor result=db.rawQuery("Select * from userdetails where email='"+email+"'", null);
				if(result.moveToNext())
				{
					Toast.makeText(getApplicationContext(), "User Already Exists", Toast.LENGTH_LONG).show();
					
				}
				else
				{
					db.execSQL("insert into userdetails values('"+userName+"','"+password+"','"+email+"','"+phone+"','"+dateOf+"','"+monthOf+"','"+yearOf+"')");
					db.close();
					Toast.makeText(getApplicationContext(), "SignUp Successful", Toast.LENGTH_LONG).show();
					Intent i=new Intent(BellSignupActivity.this,BellSecondActivity.class);
					startActivity(i);
				}
				}
				}
				
				else
				{
					Toast.makeText(getApplicationContext(), "Fill all the entries", Toast.LENGTH_LONG).show();
				}
				
			}	
			
	
			}	);
		back.setOnClickListener(new OnClickListener()
	    {
	    public void onClick(View v)
	    {
	    	Intent intent=new Intent(BellSignupActivity.this,BellFirstActivity.class);
	    	startActivity(intent);
	    }
	    }
	    );
		eye.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// checkbox status is changed from uncheck to checked.
				if (!isChecked) {
					// show password
					editTextPassword.setTransformationMethod(PasswordTransformationMethod
							.getInstance());
				} else {
					// hide password
					editTextPassword.setTransformationMethod(HideReturnsTransformationMethod
							.getInstance());
				}
			}
		});
	}
	
	/*@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		loginDataBaseAdapter.close();
	}*/
}

