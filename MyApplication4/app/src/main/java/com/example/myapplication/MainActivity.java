package com.example.kobinath.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.stname);
        ed2 = findViewById(R.id.mark1);
        ed3 = findViewById(R.id.mark2);
        ed4 = findViewById(R.id.mark3);
        ed5 = findViewById(R.id.total);
        ed6 = findViewById(R.id.avg);
        ed7 = findViewById(R.id.grade);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stmarks();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }


    public void stmarks()
    {

        int m1,m2,m3,tot;
        double avg;
        String grade;
        m1 = Integer.parseInt(ed2.getText().toString());
        m2 = Integer.parseInt(ed3.getText().toString());
        m3 = Integer.parseInt(ed4.getText().toString());

        tot = m1 + m2 + m3;
        ed5.setText(String.valueOf(tot));
        avg = tot/3;
        ed6.setText(String.valueOf(avg));

        if(avg > 75)
        {
            ed7.setText("A");
        }
        else if(avg > 65)
        {
            ed7.setText("B");
        }

        else if(avg > 55)
        {
            ed7.setText("C");
        }


        else if(avg > 40)
        {
            ed7.setText("S");
        }

        else
        {
            ed7.setText("Fail");
        }
    }

    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");

        ed1.requestFocus();

    }
}