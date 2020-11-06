package com.example.todolist.modul.updatetask;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;
import com.example.todolist.model.Task;

public interface UpdateTaskContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
        void showData(Task task);
        void setId(String id);
    }

    interface Presenter extends BasePresenter {
        void saveData(String title, String description);
        void loadData(String id);
    }
}
