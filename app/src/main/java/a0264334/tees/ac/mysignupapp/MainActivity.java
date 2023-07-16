package a0264334.tees.ac.mysignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    EditText username = (EditText) findViewById(R.id.username);

    MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

    public void setRegbtn(MaterialButton regbtn) {
        this.regbtn = regbtn;
        String Username1 = username.getText().toString();
        Toast.makeText(MainActivity.this, "username is"+Username1,Toast.LENGTH_SHORT).show();
    }
}