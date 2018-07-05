package com.example.cecildot.sharedprefernce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Shared_ex extends AppCompatActivity {
Button btn;
EditText edt1,edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_ex);
    btn = (Button)findViewById(R.id.btnsh);
    edt1 = (EditText)findViewById(R.id.edtsh);
    edt2 = (EditText)findViewById(R.id.edtsh2);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    }
}
