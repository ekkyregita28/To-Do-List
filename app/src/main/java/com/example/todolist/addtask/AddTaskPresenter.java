package com.example.todolist.addtask;

public class AddTaskPresenter implements AddTaskContract.Presenter{
    private final AddTaskContract.View view;



    public AddTaskPresenter(AddTaskContract.View view) {
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
