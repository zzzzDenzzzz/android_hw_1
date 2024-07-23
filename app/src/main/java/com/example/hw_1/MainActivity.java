package com.example.hw_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast(LifeCycle.ON_CREATE.getMessage());

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> textView.setText(String.valueOf(editText.getText()).toUpperCase()));
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        showToast(LifeCycle.ON_DESTROY.getMessage());
    }

    @Override
    protected void onStop(){
        super.onStop();
        showToast(LifeCycle.ON_STOP.getMessage());
    }

    @Override
    protected void onStart(){
        super.onStart();
        showToast(LifeCycle.ON_START.getMessage());
    }

    @Override
    protected void onPause(){
        super.onPause();
        showToast(LifeCycle.ON_PAUSE.getMessage());
    }

    @Override
    protected void onResume(){
        super.onResume();
        showToast(LifeCycle.ON_RESUME.getMessage());
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        showToast(LifeCycle.ON_RESTART.getMessage());
    }

    private void showToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}