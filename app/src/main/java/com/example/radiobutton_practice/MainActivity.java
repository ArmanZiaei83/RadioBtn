package com.example.radiobutton_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup ;
    RadioButton radbtn ;
    TextView txt ;
    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        txt = (TextView) findViewById(R.id.txtv_1);
        btn = (Button) findViewById(R.id.applyBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = radioGroup.getCheckedRadioButtonId() ;
                radbtn = findViewById(count) ;

                txt.setText("Ur Selection : " + radbtn.getText());
            }
        });
    }
    public void  checkButton (View v){
        int count = radioGroup.getCheckedRadioButtonId() ;
        radbtn = findViewById(count);
        Toast.makeText(this , "Your selection : " + radbtn.getText() , Toast.LENGTH_SHORT).show();
    }
}