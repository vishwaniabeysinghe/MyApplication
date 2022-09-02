package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.temporal.ValueRange;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText val1;
    EditText val2;
    TextView answer;

    public void Sum(View v){
        val1=findViewById(R.id.txtValue1);
        double value1=Double.parseDouble(val1.getText().toString());

         val2=findViewById(R.id.txtValue2);
        double value2=Double.parseDouble(val2.getText().toString());

         double ans= value1 + value2;
        answer  =  findViewById(R.id.lblAnwer);
        answer.setText(""+ans);
    }

    public void Sub(View v){
         val1=findViewById(R.id.txtValue1);
        double value1=Double.parseDouble(val1.getText().toString());

         val2=findViewById(R.id.txtValue2);
        double value2=Double.parseDouble(val2.getText().toString());

        double ans= value1 - value2;
         answer  =  findViewById(R.id.lblAnwer);
        answer.setText(""+ans);
    }

    public void Multi(View v){
        EditText val1=findViewById(R.id.txtValue1);
        double value1=Double.parseDouble(val1.getText().toString());

        EditText val2=findViewById(R.id.txtValue2);
        double value2=Double.parseDouble(val2.getText().toString());

        double ans= value1 * value2;
        TextView answer  =  findViewById(R.id.lblAnwer);
        answer.setText(""+ans);
    }

    public void Div(View v){
        EditText val1=findViewById(R.id.txtValue1);
        double value1=Double.parseDouble(val1.getText().toString());

        EditText val2=findViewById(R.id.txtValue2);
        double value2=Double.parseDouble(val2.getText().toString());

        double ans= value1 /value2;
        TextView answer  =  findViewById(R.id.lblAnwer);
        answer.setText(""+ans);
    }

    public  void ClearCount(View v){
        int ans=0;
        TextView lblCount=findViewById(R.id.lblAnwer);
        lblCount.setText(""+ans);
    }


//    public void Sum(View v){
//        //step 1:find/save all the elements that are required to acces
//        EditText txtValue1=findViewById(R.id.txtValue1);
//        EditText txtValue2=findViewById(R.id.txtValue2);
//        TextView lblAns = findViewById(R.id.lblAnwer);
//
//        //Step2:get requied values from above saved element
//    String value1=txtValue1.getText().toString();
//    String value2=txtValue2.getText().toString();

//    double v1=Double.parseDouble(Value1);
//    double v2=Double.parseDouble(Value2);

//double ans=v1+v2;
//
//        //step 3:show the answer on the lblAnswer
//        lblAnswer.setText("Answer is:"+ans );
//    }
}