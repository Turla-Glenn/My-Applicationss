package com.example.myapplicationss;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplicationss.MainActivity2;
import com.example.myapplicationss.MainActivity3;
import com.example.myapplicationss.R;

/*import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

/*    TextView tv;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        tv = findViewById(R.id.tv1);
        StrictMode.enableDefaults();*/


        // Find buttons by their IDs
        Button btnLogin = findViewById(R.id.btn1);
        Button btnRegister = findViewById(R.id.btnRegister);
        Button btnProfile = findViewById(R.id.btnProfile);


/*        try {
            URL url = new URL("http://192.168.100.155/myapplication/connect.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            Toast.makeText(getApplicationContext(), "PHP MYSQL CONNECT...", Toast.LENGTH_LONG).show();
            Log.e("pass 1", "Connection Success");
            tv.setText("Connected Successfully....");

            reader.close();
            inputStream.close();
        } catch (Exception e) {
            Log.e("Fail 1", e.toString());
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }*/



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
