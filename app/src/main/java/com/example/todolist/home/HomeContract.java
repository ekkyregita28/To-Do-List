package com.example.todolist.home;

import com.example.todolist.base.*;

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void redirectToNew();
        void redirectToUpdate();
    }

    interface Presenter extends BasePresenter {
        void performNewTask();
        void performUpdateTask();
    }
}
