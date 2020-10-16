package com.example.todolist.addtask;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface AddTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void performHome();
    }
}
