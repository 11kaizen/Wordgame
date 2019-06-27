package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
 TextView disp;
 EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp=findViewById(R.id.Display);
        input=findViewById(R.id.Input);
    }
    public void Check_Answer(View A){
        startActivity(new Intent(getApplicationContext(),ScrollingActivity.class));
        overridePendingTransition(R.anim.entry, R.anim.exit);
        //input.getText();
        //disp.setText(input.getText());

    }
}
