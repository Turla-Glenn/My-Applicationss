package com.example.myapplicationss;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import com.example.myapplicationss.MainActivity2;
import com.example.myapplicationss.MainActivity3;
import com.example.myapplicationss.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find buttons by their IDs
        Button btnLogin = findViewById(R.id.btn1);
        Button btnRegister = findViewById(R.id.btnRegister);
        Button btnProfile = findViewById(R.id.btnProfile);

        // Set click listeners for each button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Login button clicked");
                // Add code to handle login button click
                // Start the LoginActivity
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Register button clicked");
                // Add code to handle register button click
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Profile button clicked");
                // Add code to handle profile button click
                // Since you're already in MainActivity, starting MainActivity again might not be the desired behavior.
                // You should replace MainActivity.class with the appropriate activity class that represents the user's profile.
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    // Helper method to show a toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
