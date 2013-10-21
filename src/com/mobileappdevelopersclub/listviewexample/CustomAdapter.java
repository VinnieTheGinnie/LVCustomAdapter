package com.mobileappdevelopersclub.listviewexample;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

	
	private Context context;
	private List<String> objects;
	private LayoutInflater mInflater;
	
	public CustomAdapter(Context context, int resource, List<String> objects) {
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
		name.setText(objects.get(position));
		
		return convertView;
	}
	
	
	
	
	
	
	
}
