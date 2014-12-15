package edu.sicsr.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EventHandle extends Activity {
	private Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handle);
       
        btnClick = (Button) findViewById(R.id.btnClick);
        OnClickListener listener = new OnClickListener() {
        	
        	
        	
        	
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btnClick.setText("button was clicked!");
				
				
				
			}
		};
        btnClick.setOnClickListener(listener);
    }

    

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.event_handle, menu);
        return true;
        
       
    }
    
}
