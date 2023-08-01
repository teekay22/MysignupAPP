package a0264334.tees.ac.mysignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView signup = (TextView) this.findViewById(R.id.signuptitle);
        EditText username = (EditText) this.findViewById(R.id.username);
        EditText email = (EditText) this.findViewById(R.id.Email);
        EditText password = (EditText) this.findViewById(R.id.Password);
        EditText confirmPassword = (EditText) this.findViewById(R.id.ConfirmPassword);


        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);
        regbtn.setOnClickListener(view -> {

            String Username1 = username.getText().toString();
            Toast.makeText(MainActivity.this, "username is " + Username1, Toast.LENGTH_SHORT).show();
        });
    }

}

