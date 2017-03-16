package com.tekkini.listview_q;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView listView;
    ArrayList<ItemData> listItem;
    ItemAdapter itemAdapter;

    Integer[] image = {
            R.drawable.hp,
            R.drawable.laptop,
    };
    String[] name = {
            "Handphone",
            "Laptop"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, name, image);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(this, MerkActivity.class);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String selectedItem = name[+i];
//                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_LONG).show();
                Bundle tempatData = new Bundle();
                tempatData.putString("name", name[+i]);
                intent.putExtras(tempatData);
                startActivity(intent);
            }
        });

    }
}
