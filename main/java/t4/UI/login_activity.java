
package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myapplication.R;

	public class login_activity extends Activity {

	
	private View _bg__login_ek2;
	private View _rectangle_15;
	private TextView welcome_____;
	private TextView email_or_phone;
	private TextView password;
	private TextView _register_now;
	private TextView login_ek3;
	private View line_1;
	private EditText __userid;
	private View line_2;
	private EditText __userpass;
	private ImageView circle_ek1;
	private ImageView training_ek1;
	private TextView healthypal_ek2;
	private ImageView circle_ek2;
	private ImageView training_ek2;
	private TextView healthypal_ek3;
	private TextView _1900_1111;
	private ImageView vector_ek9;
	private View dynamic_island_ek1;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private ImageView vector_ek14;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		_rectangle_15 = (View) findViewById(R.id._rectangle_15);
		welcome_____ = (TextView) findViewById(R.id.welcome_____);
		email_or_phone = (TextView) findViewById(R.id.email_or_phone);
		password = (TextView) findViewById(R.id.password);
		_register_now = (TextView) findViewById(R.id._register_now);
		login_ek3 = (TextView) findViewById(R.id.login_ek3);
		line_1 = (View) findViewById(R.id.line_1);
		__userid = (EditText) findViewById(R.id.__userid);
		line_2 = (View) findViewById(R.id.line_2);
		__userpass = (EditText) findViewById(R.id.__userpass);
		circle_ek1 = (ImageView) findViewById(R.id.circle_ek1);
		training_ek1 = (ImageView) findViewById(R.id.training_ek1);
		healthypal_ek2 = (TextView) findViewById(R.id.healthypal_ek2);
		circle_ek2 = (ImageView) findViewById(R.id.circle_ek2);
		training_ek2 = (ImageView) findViewById(R.id.training_ek2);
		healthypal_ek3 = (TextView) findViewById(R.id.healthypal_ek3);
		_1900_1111 = (TextView) findViewById(R.id._1900_1111);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		dynamic_island_ek1 = (View) findViewById(R.id.dynamic_island_ek1);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);
		vector_ek17 = (ImageView) findViewById(R.id.vector_ek17);
	
		
		_rectangle_15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_register_now.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	