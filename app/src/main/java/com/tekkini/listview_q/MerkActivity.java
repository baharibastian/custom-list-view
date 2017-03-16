package com.tekkini.listview_q;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MerkActivity extends Activity {

    ListView listViewMerk;
    TextView tt;

    String[] laptop = {
            "Asus ROG",
            "Asus X550ZE",
            "DELL",
            "HP"
    };

    String[] handphone = {
            "Asus Zenfone",
            "Lenovo a5000",
            "Samsung Galaxy Core II"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merk);

        tt = (TextView) findViewById(R.id.t);

        Bundle bundle = getIntent().getExtras();
        tt.setText(bundle.getCharSequence("name"));
        if(tt.getText().toString().trim().equals("Laptop")) {
            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_merk, R.id.merkName, laptop);
            listViewMerk = (ListView) findViewById(R.id.listViewMerk);
            listViewMerk.setAdapter(adapter);
        } else if(tt.getText().toString().trim().equals("Handphone")) {
            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_merk, R.id.merkName, handphone);
            listViewMerk = (ListView) findViewById(R.id.listViewMerk);
            listViewMerk.setAdapter(adapter);
        }

    }
}
