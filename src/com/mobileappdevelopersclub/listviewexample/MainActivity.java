package com.mobileappdevelopersclub.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	
	ListView mList;
	ArrayList<String> contacts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		contacts = new ArrayList<String>();
		
		for(int i = 0; i < 100; i++) {
			contacts.add("Person " + Integer.toString(i));
		}
		
		mList = (ListView) findViewById(R.id.myListView);
		
		CustomAdapter adapter = new CustomAdapter(this, 0, contacts);
		 
		mList.setAdapter(adapter);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
