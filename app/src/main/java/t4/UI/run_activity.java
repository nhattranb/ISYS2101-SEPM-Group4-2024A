

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class run_activity extends Activity {

	
	private View _bg__run_ek2;
	private View ellipse_5;
	private ImageView rectangle_71_ek7;
	private TextView april_15__2024_warm_up_run_02_km_ek1;
	private ImageView image_18_ek1;
	private ImageView _image_16_ek2;
	private TextView run_time__;
	private TextView _2_3;
	private TextView _11_00;
	private TextView _30_33;
	private TextView _345;
	private TextView km;
	private TextView start;
	private TextView time_ek10;
	private TextView calories;
	private ImageView vector_ek45;
	private View dynamic_island_ek5;
	private ImageView vector_ek46;
	private ImageView vector_ek47;
	private ImageView vector_ek48;
	private ImageView vector_ek49;
	private ImageView vector_ek50;
	private ImageView vector_ek51;
	private ImageView vector_ek52;
	private ImageView vector_ek53;
	private View rectangle_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.run);

		
		_bg__run_ek2 = (View) findViewById(R.id._bg__run_ek2);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		rectangle_71_ek7 = (ImageView) findViewById(R.id.rectangle_71_ek7);
		april_15__2024_warm_up_run_02_km_ek1 = (TextView) findViewById(R.id.april_15__2024_warm_up_run_02_km_ek1);
		image_18_ek1 = (ImageView) findViewById(R.id.image_18_ek1);
		_image_16_ek2 = (ImageView) findViewById(R.id._image_16_ek2);
		run_time__ = (TextView) findViewById(R.id.run_time__);
		_2_3 = (TextView) findViewById(R.id._2_3);
		_11_00 = (TextView) findViewById(R.id._11_00);
		_30_33 = (TextView) findViewById(R.id._30_33);
		_345 = (TextView) findViewById(R.id._345);
		km = (TextView) findViewById(R.id.km);
		start = (TextView) findViewById(R.id.start);
		time_ek10 = (TextView) findViewById(R.id.time_ek10);
		calories = (TextView) findViewById(R.id.calories);
		vector_ek45 = (ImageView) findViewById(R.id.vector_ek45);
		dynamic_island_ek5 = (View) findViewById(R.id.dynamic_island_ek5);
		vector_ek46 = (ImageView) findViewById(R.id.vector_ek46);
		vector_ek47 = (ImageView) findViewById(R.id.vector_ek47);
		vector_ek48 = (ImageView) findViewById(R.id.vector_ek48);
		vector_ek49 = (ImageView) findViewById(R.id.vector_ek49);
		vector_ek50 = (ImageView) findViewById(R.id.vector_ek50);
		vector_ek51 = (ImageView) findViewById(R.id.vector_ek51);
		vector_ek52 = (ImageView) findViewById(R.id.vector_ek52);
		vector_ek53 = (ImageView) findViewById(R.id.vector_ek53);
		rectangle_ek3 = (View) findViewById(R.id.rectangle_ek3);
	
		
		_image_16_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fatloss_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	