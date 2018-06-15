package com.example.weddingorganizer;
import com.example.weddingorganizer.R;

import android.app.Activity;
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


public class BellRecoverActivity extends Activity {
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.bellrecover);
	        ImageView back=(ImageView)findViewById(R.id.imageView1);
	        TextView tv1=(TextView)findViewById(R.id.textView1);
	        TextView tv2=(TextView)findViewById(R.id.textView2);
	        TextView tv3=(TextView)findViewById(R.id.textView3);
	        final EditText email=(EditText)findViewById(R.id.editText1);
	        Button submit=(Button)findViewById(R.id.button1);
	        back.setOnClickListener(new OnClickListener()
	        {
	        public void onClick(View v)
	        {
	        	Intent intent=new Intent(BellRecoverActivity.this,BellSecondActivity.class);
	        	startActivity(intent);
	        }
	        }
	        );
	        submit.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				//String recoverEmail=email.getText().toString();
				/*SQLiteDatabase db=openOrCreateDatabase("weddingdatabase.sqlite", MODE_PRIVATE, null);
				Cursor result=db.rawQuery("Select * from userdetails where email='"+email+"'", null);
				if(result.moveToNext())
				{
					String password=result.getString(1);
					GMailSender sender = new GMailSender("vartika.1106@gmail.com", "utubeaccount");
	                try {
						sender.sendMail("Password recovery",   
						        "You requested password recovery for wedding bells.Your password-'"+password+"'",   
						      "vartika.1106@gmail.com" , "'"+recoverEmail+"'");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}*/
				Toast.makeText(getApplicationContext(), "Password sent", Toast.LENGTH_LONG).show();
				 Intent intent=new Intent(getApplicationContext(),BellFirstActivity.class);
				 startActivity(intent);
				   
				}
			});
	        
}
}

