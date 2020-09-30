package com.example.quizlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textModel, textBrand, textLicense;

    ArrayList<Car> cars= new ArrayList<>();
    CarAdapter carAdapter;
    ListView carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textModel = (EditText) findViewById(R.id.editTextModel);
        textBrand = (EditText) findViewById(R.id.editTextBrand);
        textLicense = (EditText) findViewById(R.id.editTextLicense);

        carList = findViewById(R.id.carList);

        Button submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(this);

        this.carAdapter = new CarAdapter(this, cars);
    }

    @Override
    public void onClick(View view) {

        Car car = new Car(textModel.getText().toString(), textBrand.getText().toString(), textLicense.getText().toString());
        if(car.isNotEmpty())
        {
            cars.add(car);
            carList.setAdapter(carAdapter);


            textModel.setText("");
            textBrand.setText("");
            textLicense.setText("");
        }else {
            Toast.makeText(this, "Faltan datos por llenar", Toast.LENGTH_SHORT).show();
        }
    }
}