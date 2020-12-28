package meenal.agarwal.assignment_internship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {
Button logout;
TextView name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout = (Button) findViewById(R.id.button2);
        name1=(TextView) findViewById(R.id.textView);
        GoogleSignInAccount acc= GoogleSignIn.getLastSignedInAccount(this);
        if(acc!=null)
        {
            name1.setText(acc.getDisplayName());
        }
        else {
            String user = getIntent().getStringExtra("keyname");
            name1.setText(user);

        }
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }

}
