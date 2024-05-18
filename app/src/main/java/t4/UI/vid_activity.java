

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class vid_activity extends Activity {

	
	private View _bg__vid_ek2;
	private ImageView rectangle_72;
	private ImageView rectangle_71_ek12;
	private TextView april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek2;
	private ImageView image_19_ek2;
	private ImageView _image_16_ek4;
	private TextView video_tutorial_ek1;
	private TextView how_to_do_a_jumping_jack___proper_form___technique;
	private TextView jump_jack___cardio;
	private TextView a_jumping_jack__also_known_as_a_star_jump_and_called_a_side_straddle_hop_in_the_us_military__is_a_physical_jumping_exercise_performed_by_jumping_to_a_position_with_the_legs_spread_wide_and_the_hands_going_overhead__sometimes_in_a_clap__and_then_returning_to_a_position_with_the_feet_together_and_the_arms_at_the_sides_;
	private ImageView image_21;
	private ImageView image_22;
	private ImageView vector_ek63;
	private View dynamic_island_ek7;
	private ImageView vector_ek64;
	private ImageView vector_ek65;
	private ImageView vector_ek66;
	private ImageView vector_ek67;
	private ImageView vector_ek68;
	private ImageView vector_ek69;
	private ImageView vector_ek70;
	private ImageView vector_ek71;
	private View rectangle_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.vid);

		
		_bg__vid_ek2 = (View) findViewById(R.id._bg__vid_ek2);
		rectangle_72 = (ImageView) findViewById(R.id.rectangle_72);
		rectangle_71_ek12 = (ImageView) findViewById(R.id.rectangle_71_ek12);
		april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek2 = (TextView) findViewById(R.id.april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek2);
		image_19_ek2 = (ImageView) findViewById(R.id.image_19_ek2);
		_image_16_ek4 = (ImageView) findViewById(R.id._image_16_ek4);
		video_tutorial_ek1 = (TextView) findViewById(R.id.video_tutorial_ek1);
		how_to_do_a_jumping_jack___proper_form___technique = (TextView) findViewById(R.id.how_to_do_a_jumping_jack___proper_form___technique);
		jump_jack___cardio = (TextView) findViewById(R.id.jump_jack___cardio);
		a_jumping_jack__also_known_as_a_star_jump_and_called_a_side_straddle_hop_in_the_us_military__is_a_physical_jumping_exercise_performed_by_jumping_to_a_position_with_the_legs_spread_wide_and_the_hands_going_overhead__sometimes_in_a_clap__and_then_returning_to_a_position_with_the_feet_together_and_the_arms_at_the_sides_ = (TextView) findViewById(R.id.a_jumping_jack__also_known_as_a_star_jump_and_called_a_side_straddle_hop_in_the_us_military__is_a_physical_jumping_exercise_performed_by_jumping_to_a_position_with_the_legs_spread_wide_and_the_hands_going_overhead__sometimes_in_a_clap__and_then_returning_to_a_position_with_the_feet_together_and_the_arms_at_the_sides_);
		image_21 = (ImageView) findViewById(R.id.image_21);
		image_22 = (ImageView) findViewById(R.id.image_22);

		rectangle_ek5 = (View) findViewById(R.id.rectangle_ek5);
	
		
		_image_16_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), jump_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	