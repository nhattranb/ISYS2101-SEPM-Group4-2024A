

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class select_goal_activity extends Activity {

	
	private View _bg__select_goal_ek2;
	private ImageView circle_ek4;
	private ImageView training_ek4;
	private TextView healthypal_ek5;
	private TextView what_do_you_want_to_achieve__;
	private ImageView _image_16_ek1;
	private ImageView rectangle_71;
	private TextView fat_loss;
	private ImageView rectangle_71_ek1;
	private TextView muscle_gain;
	private ImageView rectangle_71_ek2;
	private TextView relieve_pain;
	private ImageView rectangle_71_ek3;
	private TextView overall_fitness;
	private ImageView vector_ek27;
	private View dynamic_island_ek3;
	private ImageView vector_ek28;
	private ImageView vector_ek29;
	private ImageView vector_ek30;
	private ImageView vector_ek31;
	private ImageView vector_ek32;
	private ImageView vector_ek33;
	private ImageView vector_ek34;
	private ImageView vector_ek35;
	private View rectangle_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_goal);

		
		_bg__select_goal_ek2 = (View) findViewById(R.id._bg__select_goal_ek2);
		circle_ek4 = (ImageView) findViewById(R.id.circle_ek4);
		training_ek4 = (ImageView) findViewById(R.id.training_ek4);
		healthypal_ek5 = (TextView) findViewById(R.id.healthypal_ek5);
		what_do_you_want_to_achieve__ = (TextView) findViewById(R.id.what_do_you_want_to_achieve__);
		_image_16_ek1 = (ImageView) findViewById(R.id._image_16_ek1);
		rectangle_71 = (ImageView) findViewById(R.id.rectangle_71);
		fat_loss = (TextView) findViewById(R.id.fat_loss);
		rectangle_71_ek1 = (ImageView) findViewById(R.id.rectangle_71_ek1);
		muscle_gain = (TextView) findViewById(R.id.muscle_gain);
		rectangle_71_ek2 = (ImageView) findViewById(R.id.rectangle_71_ek2);
		relieve_pain = (TextView) findViewById(R.id.relieve_pain);
		rectangle_71_ek3 = (ImageView) findViewById(R.id.rectangle_71_ek3);
		overall_fitness = (TextView) findViewById(R.id.overall_fitness);

		rectangle_ek1 = (View) findViewById(R.id.rectangle_ek1);
	
		
		_image_16_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fatloss_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	