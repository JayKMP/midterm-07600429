package th.ac.su.cp.speedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import  android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calB =findViewById(R.id.cal);
        calB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText meterB = findViewById(R.id.km);
                EditText secondB = findViewById(R.id.time);
                String km = meterB.getText().toString();
                String time = secondB.getText().toString();

                if(km.isEmpty() || time.isEmpty()){
                    Toast t = Toast.makeText(MainActivity.this,
                            "Distance and time are required",
                            Toast.LENGTH_LONG);
                    t.show();

                }
                if(time.equals("=0")){
                    Toast t = Toast.makeText(MainActivity.this,
                            "Time must be greater than zero",
                            Toast.LENGTH_LONG);
                    t.show();
                }
            }

        });

    };
}
