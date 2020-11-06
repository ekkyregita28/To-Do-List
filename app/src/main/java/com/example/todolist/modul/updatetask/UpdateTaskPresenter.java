package com.example.todolist.modul.updatetask;

import com.example.todolist.model.Task;

/**
 * Created by fahrul on 13/03/19.
 */

public class UpdateTaskPresenter implements UpdateTaskContract.Presenter{
    private final UpdateTaskContract.View view;



    public UpdateTaskPresenter(UpdateTaskContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    public void saveData(final String title, final String description){
        Task newTask = new Task("3", title, description);
        //save new task
        //then go back to task list
        view.redirectToHome();
    }

    @Override
    public void loadData(String id) {
        //load data task by id
        //then send data to fragment
        Task task = new Task("3", "title of taskIndex:"+id, "description of taskIndex:"+id);
        view.showData(task);
    }

}
