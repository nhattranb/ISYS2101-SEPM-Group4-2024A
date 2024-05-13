
package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class jump_activity extends Activity {

	
	private View _bg__jump_ek2;
	private ImageView rectangle_71_ek8;
	private TextView april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek1;
	private ImageView image_19_ek1;
	private ImageView _image_16_ek3;
	private TextView start__;
	private View ellipse_6;
	private TextView _00_30;
	private TextView _2_ek1;
	private TextView rep;
	private TextView _56;
	private TextView calories_ek1;
	private ImageView rectangle_71_ek9;
	private TextView pause;
	private ImageView rectangle_71_ek10;
	private TextView go;
	private ImageView rectangle_71_ek11;
	private TextView video_tutorial;
	private ImageView vector_ek54;
	private View dynamic_island_ek6;
	private ImageView vector_ek55;
	private ImageView vector_ek56;
	private ImageView vector_ek57;
	private ImageView vector_ek58;
	private ImageView vector_ek59;
	private ImageView vector_ek60;
	private ImageView vector_ek61;
	private ImageView vector_ek62;
	private View rectangle_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.jump);

		
		_bg__jump_ek2 = (View) findViewById(R.id._bg__jump_ek2);
		rectangle_71_ek8 = (ImageView) findViewById(R.id.rectangle_71_ek8);
		april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek1 = (TextView) findViewById(R.id.april_15__2024_jump_jack_30_reps___5_sets__30_sec_rest_ek1);
		image_19_ek1 = (ImageView) findViewById(R.id.image_19_ek1);
		_image_16_ek3 = (ImageView) findViewById(R.id._image_16_ek3);
		start__ = (TextView) findViewById(R.id.start__);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		_00_30 = (TextView) findViewById(R.id._00_30);
		_2_ek1 = (TextView) findViewById(R.id._2_ek1);
		rep = (TextView) findViewById(R.id.rep);
		_56 = (TextView) findViewById(R.id._56);
		calories_ek1 = (TextView) findViewById(R.id.calories_ek1);
		rectangle_71_ek9 = (ImageView) findViewById(R.id.rectangle_71_ek9);
		pause = (TextView) findViewById(R.id.pause);
		rectangle_71_ek10 = (ImageView) findViewById(R.id.rectangle_71_ek10);
		go = (TextView) findViewById(R.id.go);
		rectangle_71_ek11 = (ImageView) findViewById(R.id.rectangle_71_ek11);
		video_tutorial = (TextView) findViewById(R.id.video_tutorial);
		vector_ek54 = (ImageView) findViewById(R.id.vector_ek54);
		dynamic_island_ek6 = (View) findViewById(R.id.dynamic_island_ek6);
		vector_ek55 = (ImageView) findViewById(R.id.vector_ek55);
		vector_ek56 = (ImageView) findViewById(R.id.vector_ek56);
		vector_ek57 = (ImageView) findViewById(R.id.vector_ek57);
		vector_ek58 = (ImageView) findViewById(R.id.vector_ek58);
		vector_ek59 = (ImageView) findViewById(R.id.vector_ek59);
		vector_ek60 = (ImageView) findViewById(R.id.vector_ek60);
		vector_ek61 = (ImageView) findViewById(R.id.vector_ek61);
		vector_ek62 = (ImageView) findViewById(R.id.vector_ek62);
		rectangle_ek4 = (View) findViewById(R.id.rectangle_ek4);
	
		
		_image_16_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fatloss_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	