package com.mauricioalmeida.trafficlights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageView redLight;
    private ImageView yellowLight;
    private ImageView greenLight;

    private Button redButton;
    private Button yellowButton;
    private Button greenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redLight = (ImageView) findViewById(R.id.red_light);
        yellowLight = (ImageView) findViewById(R.id.yellow_light);
        greenLight = (ImageView) findViewById(R.id.green_light);

        redButton = (Button) findViewById(R.id.red_button);
        yellowButton = (Button) findViewById(R.id.yellow_button);
        greenButton = (Button) findViewById(R.id.green_button);

        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        turnAllLightsOff();

        if (v == redButton) {
            turnOnRedLight();
        } else if (v == yellowButton) {
            turnOnYellowLight();
        } else if (v == greenButton) {
            turnOnGreenLight();
        }
    }

    private void turnAllLightsOff() {
        redLight.setImageResource(R.drawable.light_off);
        yellowLight.setImageResource(R.drawable.light_off);
        greenLight.setImageResource(R.drawable.light_off);
    }

    private void turnOnRedLight() {
        redLight.setImageResource(R.drawable.red_on);
    }

    private void turnOnYellowLight() {
        yellowLight.setImageResource(R.drawable.yellow_on);
    }

    private void turnOnGreenLight() {
        greenLight.setImageResource(R.drawable.green_on);
    }

}
