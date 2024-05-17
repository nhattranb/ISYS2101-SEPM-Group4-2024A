package t4.UI;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;


    public class meal_activity extends Activity {

        private TextView calories_total;
        private TextView meal_name;
        private TextView meal_calories;
        private TextView meal_name_ek1;
        private TextView meal_calories_ek1;

        @Override
        public void onCreate(Bundle savedInstanceState) {
                
                super.onCreate(savedInstanceState);
                setContentView(R.layout.meal);
    
                calories_total = (TextView) findViewById(R.id.calories_total);
                meal_name = (TextView) findViewById(R.id.meal_name);
                meal_calories = (TextView) findViewById(R.id.meal_calories);
                meal_name_ek1 = (TextView) findViewById(R.id.meal_name_ek1);
                meal_calories_ek1 = (TextView) findViewById(R.id.meal_calories_ek1);

                // on click listener
                meal_name.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(meal_activity.this, meal_detail_activity.class);
                        startActivity(intent);
                    }
                });
        }
    }
