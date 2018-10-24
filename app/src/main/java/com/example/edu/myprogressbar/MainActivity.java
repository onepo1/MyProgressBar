package com.example.edu.myprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton; ProgressBar progressBar01;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton1);
        progressBar01 = (ProgressBar)findViewById(R.id.progressBar1);
        progressBar01.setVisibility(View.GONE);
        textView=(TextView)findViewById(R.id.textView);
    }
    public  void onClickWidget(View view){
        String text = toggleButton.getText()+"-"+ toggleButton.isChecked();
        if(toggleButton.isChecked())
            progressBar01.setVisibility(View.VISIBLE);
       else
           progressBar01.setVisibility(View.INVISIBLE);
        textView.setText(text);
//        Toast.makeText(view.getContext(),text, Toast.LENGTH_SHORT).show();


    }
}
