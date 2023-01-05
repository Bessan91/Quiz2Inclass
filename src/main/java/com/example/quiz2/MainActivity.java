package com.example.quiz2;
import com.example.quiz2.Model.Employee;
import com.google.gson.Gson;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.security.PrivateKey;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spn;
    private ListView lst;
    private Button btn;
    private EditText salary;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn=findViewById(R.id.button);
       spn=findViewById(R.id.spn);
        lst=findViewById(R.id.list);
        salary=findViewById(R.id.salaybtn);
        name=findViewById(R.id.namebtn);

    }
//        btn.OnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//
//            String str = spn.getSelectedItem().toString();
//            List<Employee> result =
//            ArrayAdapter<String> adapterItems = new ArrayAdapter<Employee>(MenuActivity.this,
//                    android.R.layout.simple_list_item_1, result);
//            lst.setAdapter(adapterItems);
//        }
//    });


    }
