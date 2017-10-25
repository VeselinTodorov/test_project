package com.veso.test.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View test = new View(this);
		test.setOnClickListener(view -> {
			Log.d("Veso","Zakvo cukash na view-to be maina " + view.getVisibility());
		});
	}
}
