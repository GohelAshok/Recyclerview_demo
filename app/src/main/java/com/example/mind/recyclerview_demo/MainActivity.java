package com.example.mind.recyclerview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.rv);

        ArrayList list= new ArrayList();
        list.add(new User(User.TEXT_TYPE,"Android1",0,"ashok@gmail.com","9723535837"));

        list.add(new User(User.IMAGE_TYPE,"Android1",R.drawable.aa,"",""));

        list.add(new User(User.TEXT_TYPE,"Android2",0,"ashvin@gmail.com","90909090090"));

        list.add(new User(User.IMAGE_TYPE,"Android2",R.drawable.dd,"",""));

        list.add(new User(User.TEXT_TYPE,"Android3",0,"kamal@gmailcom","8989898989"));

        list.add(new User(User.IMAGE_TYPE,"Android3",R.drawable.a,"",""));

        list.add(new User(User.TEXT_TYPE,"Android4",0,"kartik@gmail.com","1212121212"));

        list.add(new User(User.IMAGE_TYPE,"Android4",R.drawable.aa,"",""));

        list.add(new User(User.TEXT_TYPE,"Android5",0,"dipak@gmail.com","3434343434"));

        list.add(new User(User.IMAGE_TYPE,"Android5",R.drawable.d,"",""));



        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);


        MultiViewTypeAdapter multiViewTypeAdapter=new MultiViewTypeAdapter(MainActivity.this,list);
        recyclerView.setAdapter(multiViewTypeAdapter);

    }
}
