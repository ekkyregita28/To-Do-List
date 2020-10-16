package com.example.todolist.updatetask;

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

    @Override
    public void performHome(){
        //proses login
        //if login success call redirect to profile
        view.redirectToHome();
    }

}
