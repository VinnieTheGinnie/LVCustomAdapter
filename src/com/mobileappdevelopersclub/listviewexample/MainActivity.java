package com.mobileappdevelopersclub.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	ListView mList;
	ArrayList<Contact> contacts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		contacts = new ArrayList<Contact>();
		
		for(int i = 0; i < 100; i++) {
			String ind = Integer.toString(i);
			Contact p = new Contact("Name" + ind, "Phone Num" , 
									"https://pbs.twimg.com/profile_images/633245787/borikanes.jpg" ,
									"contactemail@email.com");
			contacts.add(p);
		}
		
		mList = (ListView) findViewById(R.id.myListView);
		mList.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	        	
	       Toast.makeText(getBaseContext() , contacts.get(position).getName()
	    		   ,Toast.LENGTH_SHORT).show();
	        }
	    });
		
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
