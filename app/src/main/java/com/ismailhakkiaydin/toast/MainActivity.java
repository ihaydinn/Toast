package com.ismailhakkiaydin.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout pnl;
    private Button btn;

    private void init(){

        pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        btn = new Button(this);
        btn.setText("Toast Message");

        pnl.addView(btn);

    }

    private void btnClick(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Toast is succesfull", Toast.LENGTH_LONG);
                //Toast.makeText(MainActivity.this, "Toast is succesfull", Toast.LENGTH_LONG).show();
                t.setGravity(Gravity.CENTER, 5,10);
                t.show();
            }
        });
    }

    private void registeredHandlers(){
        btnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        registeredHandlers();
        setContentView(pnl);

    }
}
