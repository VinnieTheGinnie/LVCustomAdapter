package com.mobileappdevelopersclub.listviewexample;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CustomAdapter extends ArrayAdapter<Contact> {

	
	private Context context;
	private List<Contact> objects;
	private LayoutInflater mInflater;
	
	public CustomAdapter(Context context, int resource, List<Contact> objects) {
		super(context, resource, objects);
		this.context = context;
		this.objects = objects;
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}


	@Override
	public int getCount() {
		return 100;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	
		convertView = View.inflate(context, R.layout.simple_adapter_layout, null);
		
		TextView name = (TextView) convertView.findViewById(R.id.name);
		ImageView pic = (ImageView) convertView.findViewById(R.id.picture);
		TextView phone = (TextView) convertView.findViewById(R.id.phone);
		TextView email = (TextView) convertView.findViewById(R.id.email);

		Contact c = objects.get(position);
		
		name.setText(c.getName());
		
		phone.setText(c.getPhoneNumber());
		email.setText(c.getEmail());
		
		Picasso.with(context).load(c.getPicture()).into(pic);
		
		return convertView;
	}
	
	
	
	
	
	
	
}
