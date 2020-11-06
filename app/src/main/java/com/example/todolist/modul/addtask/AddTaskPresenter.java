package com.example.todolist.modul.addtask;

import com.example.todolist.model.Task;

public class AddTaskPresenter implements AddTaskContract.Presenter{
    private final AddTaskContract.View view;



    public AddTaskPresenter(AddTaskContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void saveData(final String title, final String description){
        Task newTask = new Task("3", title, description);
        //proses login
        //if login success call redirect to profile
        view.redirectToHome();
    }

}
