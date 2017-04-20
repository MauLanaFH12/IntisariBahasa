package id.sch.smktelkom_mlg.xirpl42022242835.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Izza on 12/04/2017.
 */

public class AwalanActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_awalan);
        ImageButton ib1 = (ImageButton) findViewById(R.id.btBer);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanBerActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib2 = (ImageButton) findViewById(R.id.btKe);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanKeActivity.class);
                startActivity(i);
            }
        });
    }
}



