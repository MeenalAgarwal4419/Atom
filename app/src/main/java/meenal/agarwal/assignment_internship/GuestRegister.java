package meenal.agarwal.assignment_internship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GuestRegister extends AppCompatActivity {
    Button cntnu;
EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_register);
        cntnu = (Button) findViewById(R.id.button);
        name=(EditText)findViewById(R.id.nameText);
        cntnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=name.getText().toString();

                Intent intent=new Intent(getApplicationContext(),home.class);
                intent.putExtra("keyname",str);
                startActivity(intent);
            }
        });
    }
}
