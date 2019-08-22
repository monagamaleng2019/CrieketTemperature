package com.example.criekettemperature;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

  EditText editText;
  Button button;
  TextView textView2 ;

        @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            //we have to check the edit text have text or not
             if(editText.getText().toString().isEmpty())
             {
                 Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
             }

             else {
                 String numberOFChirps = editText.getText().toString().trim();
                 int number = Integer.parseInt(numberOFChirps);

                 double temp = (number/3.0)+4.0;

                 String result = "the approximate temp outside is \n"+temp +"degree Celsuis" ;
                textView2.setText(result);

                }
         }
     });


    }
}
