package com.example.m3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Visualization extends AppCompatActivity {

    public FloatingActionButton toDoneScreenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualization);
        toDoneScreenBtn = findViewById(R.id.toDoneScreenBtn);

        toDoneScreenBtn.setOnClickListener(view -> {
            showCustomDialog();
        });
    }
    private void showCustomDialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Visualization.this);
        final View customLayout = getLayoutInflater().inflate(R.layout.completed_dialog, null);
        //message
        TextView message = customLayout.findViewById(R.id.message);
        message.setText("Visualizations completed !");
        builder.setPositiveButton("Go ahead", (dialogInterface, i) -> {
            Intent intent = new Intent(Visualization.this, Exercises.class);
            startActivity(intent);
        });
        builder.setCancelable(false);
        builder.setView(customLayout);
        builder.show();
    }
}