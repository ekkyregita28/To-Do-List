package com.example.todolist.home;

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

    @Override
    public void performNewTask(){
        //proses login
        //if login success call redirect to profile
        view.redirectToNew();
    }

    @Override
    public void performUpdateTask() {
        view.redirectToUpdate();
    }
}
