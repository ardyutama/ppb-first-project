package com.example.firstproject;

import com.example.firstproject.Models.ToDoModel;

import java.util.ArrayList;
import java.util.Collection;

public class TaskDatas {
    private static String[] taskNames = {
            "Melakukan revisi user flow pada aplikasi mobile Halo Konsultan.",
            "Buat mockup icon untuk deliver.",
            "Nonton video tutorial interactive component figma.",
            "Upload eksplorasi UI",
            "Revisi UI Essential Icon Pack",
            "Upload Icon ke Iconfinder",
            "Design sync bersama mas Himma",
            "Bucin bersama ...."
    };

    static Collection<? extends ToDoModel> getListData() {
        ArrayList<ToDoModel> list = new ArrayList<>();
        for (int position = 0; position < taskNames.length; position++) {
            ToDoModel task = new ToDoModel();
            task.setTask(taskNames[position]);
            list.add(task);
        }
        return list;
    }
}
