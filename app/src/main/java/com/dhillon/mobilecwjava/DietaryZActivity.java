package com.dhillon.mobilecwjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


//Sanjeev Dhillon 000857825 LoogBook task 4

public class DietaryZActivity extends AppCompatActivity {

    EditText etFoodName;
    EditText etFoodGroup;
    EditText etDate;
    EditText etTime;
    EditText etReporterName;
    Button btnConfirm;
    private CheckBox cbGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_z);



        etFoodName = (EditText)findViewById(R.id.etFoodName);
        etFoodGroup = (EditText)findViewById(R.id.etFoodGroup);
        etDate = (EditText)findViewById(R.id.etDate);
        etTime = (EditText)findViewById(R.id.etDate);
        etReporterName = (EditText)findViewById(R.id.etReporterName);
        cbGPS = (CheckBox)findViewById(R.id.cbGps);


        cbGPS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent MapIntent = new Intent(DietaryZActivity.this,MapsActivity.class);
                DietaryZActivity.this.startActivity(MapIntent);
            }
        });

        btnConfirm = (Button)findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etFoodName = (EditText)findViewById(R.id.etFoodName);
                EditText etFoodGroup = (EditText)findViewById(R.id.etFoodGroup);
                EditText etDate = (EditText)findViewById(R.id.etDate);
                EditText etTime = (EditText)findViewById(R.id.etTime);
                EditText etReporterName = (EditText)findViewById(R.id.etReporterName);

                if( etFoodName.getText().toString().trim().equals(""))
                {
                    etFoodName.setError("required!");
                }
                if( etFoodGroup.getText().toString().trim().equals(""))
                {
                    etFoodGroup.setError("required!");
                }
                if( etDate.getText().toString().trim().equals(""))
                {
                    etDate.setError("required!");
                }
                if( etTime.getText().toString().trim().equals(""))
                {
                    etTime.setError("required!");
                }
                if( etReporterName.getText().toString().trim().equals(""))
                {
                    etReporterName.setError("required!");
                }

                else{
                    Toast.makeText(DietaryZActivity.this,
                            "Successful", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void writeMessage(View view){

    }

        public void ReadMessage(View view){

        }

}





