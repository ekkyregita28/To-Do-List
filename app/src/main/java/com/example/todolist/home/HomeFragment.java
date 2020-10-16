package com.example.todolist.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.todolist.R;
import com.example.todolist.addtask.AddTaskActivity;
import com.example.todolist.base.*;
import com.example.todolist.updatetask.UpdateTaskActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends BaseFragment<HomeActivity, HomeContract.Presenter> implements HomeContract.View {

    //EditText etEmail;
    //EditText etPassword;
    //String email,password;
    Button btEdit;
    FloatingActionButton fabAddNewTask;

    public HomeFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.activity_main, container, false);
        mPresenter = new HomePresenter(this);
        mPresenter.start();

        //etEmail = fragmentView.findViewById(R.id.et_email);
        btEdit = fragmentView.findViewById(R.id.btEdit);
        fabAddNewTask = fragmentView.findViewById(R.id.fabAddNewTask);
        fabAddNewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setFabAddNewTaskClick();
            }
        });

        btEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setBtEditClick();
            }
        });

        setTitle("My Login View");

        return fragmentView;
    }

    public void setFabAddNewTaskClick(){
        mPresenter.performNewTask();
    }

    public void setBtEditClick(){
        mPresenter.performUpdateTask();
    }

    /*public void setBtLoginClick(){
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
        mPresenter.performLogin(email,password);
    }*/

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToNew() {
            Intent intent = new Intent(activity, AddTaskActivity.class);
            startActivity(intent);
            activity.finish();
    }

    @Override
    public void redirectToUpdate() {
        Intent intent = new Intent(activity, UpdateTaskActivity.class);
        startActivity(intent);
        activity.finish();
    }
}
