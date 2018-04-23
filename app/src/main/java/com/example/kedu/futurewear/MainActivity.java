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

        final ListView listView1 = (ListView)findViewById(R.id.listView1);
        final ListView listView2 = (ListView)findViewById(R.id.listView2);
        final ListView listView3 = (ListView)findViewById(R.id.listView3);
        listView1.setAdapter(new ServiceAdapter(this,sampleData1()));
        listView2.setAdapter(new ServiceAdapter(this,sampleData2()));
        listView3.setAdapter(new ServiceAdapter(this,sampleData3()));
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Service> actorList1 = ((ServiceAdapter)listView1.getAdapter()).getSelectActorList();
                ArrayList<Service> actorList2 = ((ServiceAdapter)listView2.getAdapter()).getSelectActorList();
                ArrayList<Service> actorList3 = ((ServiceAdapter)listView3.getAdapter()).getSelectActorList();

                Toast.makeText(MainActivity.this,"hi 1 "+actorList1.size(),Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"hi 2 "+actorList2.size(),Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"hi 3 "+actorList3.size(),Toast.LENGTH_LONG).show();
            }




        });

    }


    public ArrayList<Service> sampleData1(){
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
    public ArrayList<Service> sampleData2(){
        ArrayList<Service> dataList = new ArrayList<>();

        String filters[];
        filters=getResources().getStringArray(R.array.strings2);
        for(int i=0;i<filters.length;i++){
            Service servic = new Service();
            servic.setName(filters[i]);
            dataList.add(servic);
        }
        return dataList;
    }    public ArrayList<Service> sampleData3(){
        ArrayList<Service> dataList = new ArrayList<>();

        String filters[];
        filters=getResources().getStringArray(R.array.strings3);
        for(int i=0;i<filters.length;i++){
            Service servic = new Service();
            servic.setName(filters[i]);
            dataList.add(servic);
        }
        return dataList;
    }



    }
