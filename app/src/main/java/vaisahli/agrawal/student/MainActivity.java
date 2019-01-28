package vaisahli.agrawal.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//first_name last_name course email
    EditText firstName,lastName, Course, Email;
    Button bt_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        Course = findViewById(R.id.co);
        Email=findViewById(R.id.email);
        bt_check = findViewById(R.id.button);

            bt_check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    String fname = firstName.getText().toString();
                    String lname = lastName.getText().toString();
                    String cname = Course.getText().toString();
                    String ename = Email.getText().toString();


                    if (fname.matches("")||lname.matches("")||cname.matches("")||ename.matches(""))
                    {
                        Toast.makeText(MainActivity.this, " Please input detail", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
}
