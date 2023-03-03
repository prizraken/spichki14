package com.mirea.krylovvv.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку No Х");
                checkBox.setChecked(true);
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

    }
    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Еще один способ!");
        checkBox.setChecked(false);
    }
}
