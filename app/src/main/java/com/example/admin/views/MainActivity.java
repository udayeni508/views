package com.example.admin.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.ToggleButton;

import static android.support.v7.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    CheckBox ch1,ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.tgb);
        ch1=(CheckBox)findViewById(R.id.ch1);
        ch2=(CheckBox)findViewById(R.id.ch2);
        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"you checked python",Toast.LENGTH_SHORT).show();

            }
        });
        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"You checked java",Toast.LENGTH_SHORT).show();
            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(MainActivity.this, "turned on", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "turned off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void OpenAlert(View view){
        final AlertDialog.Builder myAlert=new AlertDialog.Builder(this);
        myAlert.setTitle("exit");
        myAlert.setMessage("are you sure you want to exit");
        myAlert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                finish();
            }
        });
        myAlert.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();

            }
        });
        myAlert.setCancelable(false);
        myAlert.show();
    }
}
