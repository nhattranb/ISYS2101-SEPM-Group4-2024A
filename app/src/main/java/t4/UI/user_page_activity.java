
package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.example.myapplication.R;

public class user_page_activity {
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
    private TextView last_updated;

    @Override
    public void onCreate(Bundle savedInstanceState) {
            
            super.onCreate(savedInstanceState);
            setContentView(R.layout.user_page);

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
            last_updated = (TextView) findViewById(R.id.last_updated);
            
            _bg__home_page_ek2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(user_page_activity.this, home_page_activity.class);
                    startActivity(intent);
                }
            });

            // on click listener
            last_updated.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(user_page_activity.this, user_detail_activity.class);
                    startActivity(intent);
                }
            });
    }
}
