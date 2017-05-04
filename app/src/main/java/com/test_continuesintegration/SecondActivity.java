package com.test_continuesintegration;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Zeki Guler on 04,May,2017
 * ©2015 Appscore. All Rights Reserved
 */
public class SecondActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView viewById = (TextView) findViewById(R.id.resultView);
        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("input");
        viewById.setText(input);
    }
}
