package com.example.firstproject.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstproject.MainActivity;
import com.example.firstproject.Models.ToDoModel;
import com.example.firstproject.R;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ListViewHolder> {
    private ArrayList<ToDoModel> todoList;
    private MainActivity activity;

    public ToDoAdapter(ArrayList<ToDoModel> Task){
        this.todoList=Task;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout,parent,false);
        return new ListViewHolder(itemView) ;
    }
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position){
        ToDoModel task = todoList.get(position);
        holder.check.setText(task.getTask());
    }
    @Override
    public int getItemCount(){
        return todoList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        CheckBox check;

        public ListViewHolder (@NonNull View itemView){
            super(itemView);
            check = itemView.findViewById(R.id.todoCheckBox1);
        }
    }
}
