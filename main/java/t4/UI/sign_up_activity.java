

package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

	public class sign_up_activity extends Activity {

	
	private View _bg__sign_up_ek2;
	private ImageView circle_ek5;
	private ImageView training_ek5;
	private TextView healthypal_ek6;
	private TextView your_info;
	private View _rectangle_16;
	private TextView email_or_phone_ek1;
	private TextView full_name;
	private TextView next_ek1;
	private View line_3;
	private View line_4;
	private TextView password_ek1;
	private View line_5;
	private TextView confirm_password;
	private View line_6;
	private ImageView _left_arrow;
	private ImageView vector_ek72;
	private View dynamic_island_ek8;
	private ImageView vector_ek73;
	private ImageView vector_ek74;
	private ImageView vector_ek75;
	private ImageView vector_ek76;
	private ImageView vector_ek77;
	private ImageView vector_ek78;
	private ImageView vector_ek79;
	private ImageView vector_ek80;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);

		
		_bg__sign_up_ek2 = (View) findViewById(R.id._bg__sign_up_ek2);
		circle_ek5 = (ImageView) findViewById(R.id.circle_ek5);
		training_ek5 = (ImageView) findViewById(R.id.training_ek5);
		healthypal_ek6 = (TextView) findViewById(R.id.healthypal_ek6);
		your_info = (TextView) findViewById(R.id.your_info);
		_rectangle_16 = (View) findViewById(R.id._rectangle_16);
		email_or_phone_ek1 = (TextView) findViewById(R.id.email_or_phone_ek1);
		full_name = (TextView) findViewById(R.id.full_name);
		next_ek1 = (TextView) findViewById(R.id.next_ek1);
		line_3 = (View) findViewById(R.id.line_3);
		line_4 = (View) findViewById(R.id.line_4);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		line_5 = (View) findViewById(R.id.line_5);
		confirm_password = (TextView) findViewById(R.id.confirm_password);
		line_6 = (View) findViewById(R.id.line_6);
		_left_arrow = (ImageView) findViewById(R.id._left_arrow);
		vector_ek72 = (ImageView) findViewById(R.id.vector_ek72);
		dynamic_island_ek8 = (View) findViewById(R.id.dynamic_island_ek8);
		vector_ek73 = (ImageView) findViewById(R.id.vector_ek73);
		vector_ek74 = (ImageView) findViewById(R.id.vector_ek74);
		vector_ek75 = (ImageView) findViewById(R.id.vector_ek75);
		vector_ek76 = (ImageView) findViewById(R.id.vector_ek76);
		vector_ek77 = (ImageView) findViewById(R.id.vector_ek77);
		vector_ek78 = (ImageView) findViewById(R.id.vector_ek78);
		vector_ek79 = (ImageView) findViewById(R.id.vector_ek79);
		vector_ek80 = (ImageView) findViewById(R.id.vector_ek80);
	
		
		_rectangle_16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), bmi_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_left_arrow.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	