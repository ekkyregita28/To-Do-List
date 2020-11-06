package com.example.todolist.modul.home;

import com.example.todolist.model.Task;

import java.util.ArrayList;

/**
 * Created by fahrul on 13/03/19.
 */

public class HomePresenter implements HomeContract.Presenter{
    private final HomeContract.View view;



    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    public ArrayList<Task> getDataSet() {
        //get Data from DB
        ArrayList<Task> data = new ArrayList<Task> ();
        data.add(new Task("1","Task 1", "Kerjakan task satu"));
        data.add(new Task("2", "Task 2", "Kerjakan task dua"));
        return data;
    }
}
