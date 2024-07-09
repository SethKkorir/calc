package com.example.addcaclculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText firstnumbertext;
    EditText secondnumbertext;
    Button addbutton;
    TextView resulttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        firstnumbertext=findViewById(R.id.fnuminput);
        secondnumbertext=findViewById(R.id.snuminput);
        addbutton=findViewById(R.id.addbutton);
        resulttext=findViewById(R.id.result);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(firstnumbertext.getText().toString());
                int y = Integer.parseInt(secondnumbertext.getText().toString());
                int sum = x+y;
                resulttext.setText("" + sum);
            }
        });
    }
}