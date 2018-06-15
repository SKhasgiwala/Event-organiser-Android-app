package com.example.weddingorganizer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class VendorImageAdapter extends BaseAdapter {
	private Context mContext;

	// Keep all Images in array
	public Integer[] photo = { R.drawable.bell33, R.drawable.bell1,
			R.drawable.bell11, R.drawable.bell12, R.drawable.bell6,
			R.drawable.bell14, R.drawable.bell7 };

	// Constructor
	public VendorImageAdapter(Context c) {
		mContext = c;
	}

	@Override
	public int getCount() {
		return photo.length;
	}

	@Override
	public Object getItem(int position) {
		return photo[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(mContext);
		imageView.setImageResource(photo[position]);
		imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
		return imageView;
	}

}