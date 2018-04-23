package com.example.kedu.futurewear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(new ServiceAdapter(this,sampleData()));
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Service> actorList = ((ServiceAdapter)listView.getAdapter()).getSelectActorList();
                Toast.makeText(MainActivity.this,""+actorList.size(),Toast.LENGTH_LONG).show();
            }




        });

    }


    public ArrayList<Service> sampleData(){
        ArrayList<Service> dataList = new ArrayList<>();
        String filters[];
        filters=getResources().getStringArray(R.array.strings);
        for(int i=0;i<filters.length;i++){
            Service servic = new Service();
            servic.setName(filters[i]);
            dataList.add(servic);
        }

        return dataList;
    }
}