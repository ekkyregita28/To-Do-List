package com.example.todolist.updatetask;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;

public interface UpdateTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void performHome();
    }
}
