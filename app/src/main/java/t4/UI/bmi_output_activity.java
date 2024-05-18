
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bmi_output
	 *	@date 		Friday 17th of May 2024 11:43:27 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;
public class bmi_output_activity extends Activity {

	
	private View _bg__bmi_output;
	private ImageView circle;
	private ImageView training;
	private TextView healthypal;
	private TextView start_your_project;
	private TextView your_current_bmi___28;
	private TextView your_daily_calogies_in__1890;
	private TextView your_daily_calogies_out__2100;
	private TextView next;
	private ImageView _left_arrow;
	private View rectangle_16;
	private TextView exercise_explore;
	private View rectangle_16_ek1;
	private TextView meal_explore;
	private ImageView vector;
	private View dynamic_island;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi_output);

		
		_bg__bmi_output = (View) findViewById(R.id._bg__bmi_output);
		circle = (ImageView) findViewById(R.id.circle);
		training = (ImageView) findViewById(R.id.training);
		healthypal = (TextView) findViewById(R.id.healthypal);
		start_your_project = (TextView) findViewById(R.id.start_your_project);
		your_current_bmi___28 = (TextView) findViewById(R.id.your_current_bmi___28);
		your_daily_calogies_in__1890 = (TextView) findViewById(R.id.your_daily_calogies_in__1890);
		your_daily_calogies_out__2100 = (TextView) findViewById(R.id.your_daily_calogies_out__2100);
		next = (TextView) findViewById(R.id.next);
		_left_arrow = (ImageView) findViewById(R.id._left_arrow);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		exercise_explore = (TextView) findViewById(R.id.exercise_explore);
		rectangle_16_ek1 = (View) findViewById(R.id.rectangle_16_ek1);
		meal_explore = (TextView) findViewById(R.id.meal_explore);

	
		
		_left_arrow.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		exercise_explore.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), fatloss_activity.class);
				startActivity(nextScreen);


			}
		});

		 meal_explore.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), daily_meal_activity.class);
				startActivity(nextScreen);


			}
		});
		//custom code goes here
	
	}
}
	
	