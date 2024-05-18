

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class home_page_activity extends Activity {

	
	private View _bg__home_page_ek2;
	private ImageView rectangle_14;
	private View rectangle_11;
	private ImageView circle;
	private ImageView user;
	private ImageView notification;
	private ImageView rectangle_12;
	private TextView exp__12_12_2024;
	private TextView floyd_nguyen;
	private TextView id__503882;
	private ImageView training;
	private TextView healthypal;
	private TextView hcm___nguyen_van_linh;
	private TextView healthypal_ek1;
	private TextView day__10_15;
	private ImageView wallet;
	private ImageView calendar;
	private ImageView friends;
	private TextView membership;
	private TextView callender;
	private TextView referal;
	private TextView extensions;
	private TextView special_offers;
	private ImageView home;
	private ImageView settings;
	private ImageView _jogging;
	private ImageView heartbeat;
	private TextView home_ek1;
	private TextView home_ek2;
	private TextView home_ek3;
	private TextView heath;
	private TextView activity;
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
		setContentView(R.layout.home_page);


		_bg__home_page_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
		rectangle_14 = (ImageView) findViewById(R.id.rectangle_14);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		circle = (ImageView) findViewById(R.id.circle);
		user = (ImageView) findViewById(R.id.user);
		notification = (ImageView) findViewById(R.id.notification);
		rectangle_12 = (ImageView) findViewById(R.id.rectangle_12);
		exp__12_12_2024 = (TextView) findViewById(R.id.exp__12_12_2024);
		floyd_nguyen = (TextView) findViewById(R.id.floyd_nguyen);
		id__503882 = (TextView) findViewById(R.id.id__503882);
		training = (ImageView) findViewById(R.id.training);
		healthypal = (TextView) findViewById(R.id.healthypal);
		hcm___nguyen_van_linh = (TextView) findViewById(R.id.hcm___nguyen_van_linh);
		healthypal_ek1 = (TextView) findViewById(R.id.healthypal_ek1);
		day__10_15 = (TextView) findViewById(R.id.day__10_15);
		wallet = (ImageView) findViewById(R.id.wallet);
		calendar = (ImageView) findViewById(R.id.calendar);
		friends = (ImageView) findViewById(R.id.friends);
		membership = (TextView) findViewById(R.id.membership);
		callender = (TextView) findViewById(R.id.callender);
		referal = (TextView) findViewById(R.id.referal);
		extensions = (TextView) findViewById(R.id.extensions);
		special_offers = (TextView) findViewById(R.id.special_offers);
		home = (ImageView) findViewById(R.id.home);
		settings = (ImageView) findViewById(R.id.settings);
		_jogging = (ImageView) findViewById(R.id._jogging);
		heartbeat = (ImageView) findViewById(R.id.heartbeat);
		home_ek1 = (TextView) findViewById(R.id.home_ek1);
		home_ek2 = (TextView) findViewById(R.id.home_ek2);
		home_ek3 = (TextView) findViewById(R.id.home_ek3);
		heath = (TextView) findViewById(R.id.heath);
		activity = (TextView) findViewById(R.id.activity);

		
		_jogging.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), workout_activity.class);
				startActivity(nextScreen);


			}
		});

		heartbeat.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), bmi_output_activity.class);
				startActivity(nextScreen);


			}
		});
		rectangle_11.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), user_page_activity.class);
				startActivity(nextScreen);


			}
		});
		//custom code goes here
	
	}
}
	
	