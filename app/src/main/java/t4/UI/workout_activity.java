

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class workout_activity extends Activity {

	
	private View _bg__workout_ek2;
	private ImageView circle_ek3;
	private ImageView training_ek3;
	private TextView healthypal_ek4;
	private TextView training_plan;
	private TextView next;
	private TextView before_starting_your_training_plan__please_tell_us_your_physical_health_condition_;
	private TextView select_your_injury_or_pain_;
	private TextView knee_pain;
	private TextView back_pain;
	private TextView gape_neck_pain;
	private TextView headache;
	private TextView ankle_pain;
	private TextView wrist_pain;
	private TextView elbow_pain;
	private ImageView image_9;
	private ImageView image_10;
	private ImageView image_11;
	private ImageView image_12;
	private ImageView image_13;
	private ImageView image_14;
	private ImageView image_15;
	private ImageView _image_16;
	private ImageView vector_ek18;
	private View dynamic_island_ek2;
	private ImageView vector_ek19;
	private ImageView vector_ek20;
	private ImageView vector_ek21;
	private ImageView vector_ek22;
	private ImageView vector_ek23;
	private ImageView vector_ek24;
	private ImageView vector_ek25;
	private ImageView vector_ek26;
	private View rectangle;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.workout);

		
		_bg__workout_ek2 = (View) findViewById(R.id._bg__workout_ek2);
		circle_ek3 = (ImageView) findViewById(R.id.circle_ek3);
		training_ek3 = (ImageView) findViewById(R.id.training_ek3);
		healthypal_ek4 = (TextView) findViewById(R.id.healthypal_ek4);
		training_plan = (TextView) findViewById(R.id.training_plan);
		next = (TextView) findViewById(R.id.next);
		before_starting_your_training_plan__please_tell_us_your_physical_health_condition_ = (TextView) findViewById(R.id.before_starting_your_training_plan__please_tell_us_your_physical_health_condition_);
		select_your_injury_or_pain_ = (TextView) findViewById(R.id.select_your_injury_or_pain_);
		knee_pain = (TextView) findViewById(R.id.knee_pain);
		back_pain = (TextView) findViewById(R.id.back_pain);
		gape_neck_pain = (TextView) findViewById(R.id.gape_neck_pain);
		headache = (TextView) findViewById(R.id.headache);
		ankle_pain = (TextView) findViewById(R.id.ankle_pain);
		wrist_pain = (TextView) findViewById(R.id.wrist_pain);
		elbow_pain = (TextView) findViewById(R.id.elbow_pain);
		image_9 = (ImageView) findViewById(R.id.image_9);
		image_10 = (ImageView) findViewById(R.id.image_10);
		image_11 = (ImageView) findViewById(R.id.image_11);
		image_12 = (ImageView) findViewById(R.id.image_12);
		image_13 = (ImageView) findViewById(R.id.image_13);
		image_14 = (ImageView) findViewById(R.id.image_14);
		image_15 = (ImageView) findViewById(R.id.image_15);
		_image_16 = (ImageView) findViewById(R.id._image_16);
		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);
		dynamic_island_ek2 = (View) findViewById(R.id.dynamic_island_ek2);
		vector_ek19 = (ImageView) findViewById(R.id.vector_ek19);
		vector_ek20 = (ImageView) findViewById(R.id.vector_ek20);
		vector_ek21 = (ImageView) findViewById(R.id.vector_ek21);
		vector_ek22 = (ImageView) findViewById(R.id.vector_ek22);
		vector_ek23 = (ImageView) findViewById(R.id.vector_ek23);
		vector_ek24 = (ImageView) findViewById(R.id.vector_ek24);
		vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
		vector_ek26 = (ImageView) findViewById(R.id.vector_ek26);
		rectangle = (View) findViewById(R.id.rectangle);
	
		
		_image_16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), select_goal_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		

	}
}
	
	