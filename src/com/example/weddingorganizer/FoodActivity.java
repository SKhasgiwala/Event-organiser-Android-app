package com.example.weddingorganizer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FoodActivity extends Activity implements OnClickListener {
	int pos;
	String[] web = { "R B ShivaKumar, Banglore", "Food Bank, Chennai",
			"Giveaway, Chennai", "No Food Waste, Coimbatore",
			"Food Nexus, Chennai", "Feeding India, Mumbai",
			"Mera Parivar, Delhi" };
	Integer[] imageId = { R.drawable.icon8, R.drawable.icon8, R.drawable.icon8,
			R.drawable.icon8, R.drawable.icon8, R.drawable.icon8,
			R.drawable.icon8

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food);

		CustomList adapter = new CustomList(FoodActivity.this, web, imageId);
		ListView lv = (ListView) findViewById(R.id.list);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(FoodActivity.this,
						"You Clicked at " + web[+position], Toast.LENGTH_SHORT)
						.show();
				if ((+position) == 0) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:9993139995"));
					startActivity(intent);
				}
				if ((+position) == 1) {
					Intent intent1 = new Intent(Intent.ACTION_CALL);
					intent1.setData(Uri.parse("tel:8989529304"));
					startActivity(intent1);
				}
				if ((+position) == 2) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:121"));
					startActivity(intent);
				}
				if ((+position) == 3) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:9993139995"));
					startActivity(intent);
				}
				if ((+position) == 4) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:9993139995"));
					startActivity(intent);
				}
				if ((+position) == 5) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:9993139995"));
					startActivity(intent);
				}
				if ((+position) == 6) {
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:9993139995"));
					startActivity(intent);
				}
			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	// @Override
	/*
	 * public void onClick(View v) { // TODO Auto-generated method stub
	 * 
	 * switch (imageId[pos]) { case 0: Intent intent = new
	 * Intent(Intent.ACTION_CALL); intent.setData(Uri.parse("tel:9993139995"));
	 * startActivity(intent); break; case 1: Intent intent1 = new
	 * Intent(Intent.ACTION_CALL); intent1.setData(Uri.parse("tel:9993139995"));
	 * startActivity(intent1); break;
	 * 
	 * } }
	 */
}
