
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		daily_meal
	 *	@date 		Saturday 18th of May 2024 01:35:00 AM
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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import com.example.myapplication.R;

public class daily_meal_activity extends Activity {

	
	private View _bg__daily_meal;
	private TextView breakfast_meal;
	private TextView lunch_meal;
	private TextView dinner_meal;
	private TextView next;
	private ImageView _left_arrow;
	private ImageView image_2;
	private ImageView image_1;
	private ImageView image_3;
	private ImageView circle;
	private ImageView training;
	private TextView healthypal;
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
		setContentView(R.layout.daily_meal);

		
		_bg__daily_meal = (View) findViewById(R.id._bg__daily_meal);
		breakfast_meal = (TextView) findViewById(R.id.breakfast_meal);
		lunch_meal = (TextView) findViewById(R.id.lunch_meal);
		dinner_meal = (TextView) findViewById(R.id.dinner_meal);
		next = (TextView) findViewById(R.id.next);
		_left_arrow = (ImageView) findViewById(R.id._left_arrow);
		image_2 = (ImageView) findViewById(R.id.image_2);
		image_1 = (ImageView) findViewById(R.id.image_1);
		image_3 = (ImageView) findViewById(R.id.image_3);
		circle = (ImageView) findViewById(R.id.circle);
		training = (ImageView) findViewById(R.id.training);
		healthypal = (TextView) findViewById(R.id.healthypal);

		
		_left_arrow.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), bmi_output_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	