package com.example.todolist.modul.addtask;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface AddTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void saveData(String title, String description);
    }
}
