package com.worldsoft.rootchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.text);
        boolean isRooted = RootUtil.isRooted(this);
        if(isRooted) {
            text.setText(R.string.device_is_rooted);
        } else {
            text.setText(R.string.device_is_not_rooted);
        }
    }
}
