package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.firstproject.Adapter.ToDoAdapter;
import com.example.firstproject.Models.ToDoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView taskRecyclerView;
    private ArrayList<ToDoModel> list = new ArrayList<ToDoModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskRecyclerView = findViewById(R.id.taskRecyclerView);
        taskRecyclerView.setHasFixedSize(true);

        list.addAll(TaskDatas.getListData());
        showRecyclerList();
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Aplikasi To-Do-List");
        }
    }

        private void showRecyclerList(){
        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ToDoAdapter toDoAdapter = new ToDoAdapter(list);
        taskRecyclerView.setAdapter(toDoAdapter);
    }
}