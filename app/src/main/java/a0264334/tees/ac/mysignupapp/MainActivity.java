package a0264334.tees.ac.mysignupapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.Openable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.security.PrivateKey;


public class MainActivity extends AppCompatActivity {
     private MaterialButton materialButton;

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
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });
    }
    public void openLoginActivity() {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }




}

