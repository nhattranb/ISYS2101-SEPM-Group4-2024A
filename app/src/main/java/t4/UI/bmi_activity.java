
package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

public class bmi_activity extends Activity {

	
	private View _bg__bmi_ek2;
	private ImageView circle_ek6;
	private ImageView training_ek6;
	private TextView healthypal_ek7;
	private TextView bmi_calculator;
	private View _rectangle_16_ek1;
	private TextView weight;
	private TextView height;
	private TextView register;
	private View line_3_ek1;
	private View line_4_ek1;
	private TextView age;
	private View line_5_ek1;
	private TextView sex;
	private View line_6_ek1;
	private ImageView _left_arrow_ek1;
	private ImageView vector_ek81;
	private View dynamic_island_ek9;
	private ImageView vector_ek82;
	private ImageView vector_ek83;
	private ImageView vector_ek84;
	private ImageView vector_ek85;
	private ImageView vector_ek86;
	private ImageView vector_ek87;
	private ImageView vector_ek88;
	private ImageView vector_ek89;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi);

		
		_bg__bmi_ek2 = (View) findViewById(R.id._bg__bmi_ek2);
		circle_ek6 = (ImageView) findViewById(R.id.circle_ek6);
		training_ek6 = (ImageView) findViewById(R.id.training_ek6);
		healthypal_ek7 = (TextView) findViewById(R.id.healthypal_ek7);
		bmi_calculator = (TextView) findViewById(R.id.bmi_calculator);
		_rectangle_16_ek1 = (View) findViewById(R.id._rectangle_16_ek1);
		weight = (TextView) findViewById(R.id.weight);
		height = (TextView) findViewById(R.id.height);
		register = (TextView) findViewById(R.id.register);
		line_3_ek1 = (View) findViewById(R.id.line_3_ek1);
		line_4_ek1 = (View) findViewById(R.id.line_4_ek1);
		age = (TextView) findViewById(R.id.age);
		line_5_ek1 = (View) findViewById(R.id.line_5_ek1);
		sex = (TextView) findViewById(R.id.sex);
		line_6_ek1 = (View) findViewById(R.id.line_6_ek1);
		_left_arrow_ek1 = (ImageView) findViewById(R.id._left_arrow_ek1);

	
		
		_rectangle_16_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_left_arrow_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	