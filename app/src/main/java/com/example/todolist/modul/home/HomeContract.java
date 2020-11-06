package com.example.todolist.modul.home;

import com.example.todolist.base.*;
import com.example.todolist.model.Task;

import java.util.ArrayList;

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void redirectToNew();
        //void redirectToUpdate();
    }

    interface Presenter extends BasePresenter {
        ArrayList<Task> getDataSet();
        //void performUpdateTask();
    }
}
