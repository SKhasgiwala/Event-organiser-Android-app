package com.example.weddingorganizer;



import com.example.weddingorganizer.LoginDataBaseAdapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;  
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

  
public class BellSecondActivity extends Activity {
		LoginDataBaseAdapter loginDataBaseAdapter;
		EditText editTextEmail ;
		EditText editTextPassword;	
		ImageView back;
		TextView forgot;
		TextView tv;
		Button login ;
		
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bellsecond);
		
		  editTextEmail = (EditText)findViewById(R.id.editText1);
		  editTextPassword=(EditText)findViewById(R.id.editText2);	
		  back=(ImageView)findViewById(R.id.imageView1);
		  forgot=(TextView)findViewById(R.id.textView2);
		  tv=(TextView)findViewById(R.id.textView1);
		  login = (Button)findViewById(R.id.button1);
		
		  login.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				String email = editTextEmail.getText().toString();
				String password = editTextPassword.getText().toString();
				SQLiteDatabase db=openOrCreateDatabase("weddingdatabase.sqlite", MODE_PRIVATE, null);
				Cursor result=db.rawQuery("Select * from userdetails where email='"+email+"'and password='"+password+"'", null);
				if(result.moveToNext())
				{
					
				    Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
				    String userName=result.getString(0);
				    String emailId=result.getString(2);
				    String userPhone=result.getString(3);
				    int userDate=result.getInt(4);
				    int userMonth=result.getInt(5);
				    int userYear=result.getInt(6);
				    
				  /*  Bundle obj=new Bundle();
				    obj.putInt("name1", userDate);
				    obj.putInt("name2", userMonth);
				    obj.putInt("name3", userYear);
				    Fragment_home obj1=new Fragment_home();
				    obj1.setArguments(obj);
				    finish();*/
				    Intent intent=new Intent(getApplicationContext(),HomePageActivity.class);
				   
					intent.putExtra("name1", userDate);
					intent.putExtra("name2", userMonth);
					intent.putExtra("name3", userYear);
					
					startActivity(intent);
					
					
					
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Invalid Id/Password", Toast.LENGTH_LONG).show();
				}
				db.close();

				}

			
			});
		  back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getApplicationContext(),BellFirstActivity.class);
				startActivity(intent);
			}
		
		});
forgot.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(getApplicationContext(),BellRecoverActivity.class);
		startActivity(intent);
		
	}
});
	}
		
		
		
		

	
}



