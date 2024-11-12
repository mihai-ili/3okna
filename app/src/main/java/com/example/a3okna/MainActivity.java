package com.example.a3okna;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void r(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали кролика!",Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void rr(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали белку!",Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void rrr(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали котенка!",Toast.LENGTH_SHORT);
        myToast.show();
    }
}