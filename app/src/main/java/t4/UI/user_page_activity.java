

	

package t4.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;

public class user_page_activity extends Activity {

	
	private View _bg__user_page;
	private ImageView circle;
	private ImageView training;
	private TextView healthypal;
	private TextView day__10_15;
	private TextView current_bmi___28;
	private TextView last_updated;
	private TextView daily_calogies_in__1890;
	private TextView daily_calogies_out__2100;
	private View rectangle_11;
	private ImageView rectangle_12;
	private TextView floyd_nguyen;
	private TextView id__503882;
	private TextView hcm___nguyen_van_linh;
	private TextView healthypal_ek1;
	private View rectangle_16;
	private TextView update_your_bmi;
	private View rectangle_16_ek1;
	private TextView share_the_app;
	private ImageView left_arrow;
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
		setContentView(R.layout.user_page);

		
		_bg__user_page = (View) findViewById(R.id._bg__user_page);
		circle = (ImageView) findViewById(R.id.circle);
		training = (ImageView) findViewById(R.id.training);
		healthypal = (TextView) findViewById(R.id.healthypal);
		day__10_15 = (TextView) findViewById(R.id.day__10_15);
		current_bmi___28 = (TextView) findViewById(R.id.current_bmi___28);
		last_updated = (TextView) findViewById(R.id.last_updated);
		daily_calogies_in__1890 = (TextView) findViewById(R.id.daily_calogies_in__1890);
		daily_calogies_out__2100 = (TextView) findViewById(R.id.daily_calogies_out__2100);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		rectangle_12 = (ImageView) findViewById(R.id.rectangle_12);
		floyd_nguyen = (TextView) findViewById(R.id.floyd_nguyen);
		id__503882 = (TextView) findViewById(R.id.id__503882);
		hcm___nguyen_van_linh = (TextView) findViewById(R.id.hcm___nguyen_van_linh);
		healthypal_ek1 = (TextView) findViewById(R.id.healthypal_ek1);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		update_your_bmi = (TextView) findViewById(R.id.update_your_bmi);
		rectangle_16_ek1 = (View) findViewById(R.id.rectangle_16_ek1);
		share_the_app = (TextView) findViewById(R.id.share_the_app);
		left_arrow = (ImageView) findViewById(R.id.left_arrow);



		left_arrow.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(),home_page_activity.class);
				startActivity(nextScreen);


			}
		});
	
	}
}
	
	