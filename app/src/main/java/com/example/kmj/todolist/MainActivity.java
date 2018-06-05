package com.example.kmj.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items = new ArrayList<>();
    CustomListAdapter mAdapter;
    ListView list;
    Button btn;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        btn = findViewById(R.id.btn);
        inputText = findViewById(R.id.input);

        mAdapter = new CustomListAdapter(items);
        list.setAdapter(mAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inp=inputText.getText().toString();g
                items.add(inp);
                mAdapter.notifyDataSetChanged();
                inputText.setText("");
            }
        });


    }
}
