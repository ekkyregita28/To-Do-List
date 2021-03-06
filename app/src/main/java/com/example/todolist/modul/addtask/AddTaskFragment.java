package com.example.todolist.modul.addtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.todolist.R;
import com.example.todolist.base.BaseFragment;
import com.example.todolist.modul.home.HomeActivity;

public class AddTaskFragment extends BaseFragment<AddTaskActivity, AddTaskContract.Presenter> implements AddTaskContract.View {

    EditText etTitle;
    EditText etDesc;
    //String email,password;
    Button btCreate;


    public AddTaskFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.add_task, container, false);
        mPresenter = new AddTaskPresenter(this);
        mPresenter.start();

        etTitle = fragmentView.findViewById(R.id.etTitle);
        etDesc = fragmentView.findViewById(R.id.etDesc);
        btCreate = fragmentView.findViewById(R.id.btCreate);
        btCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtCreateClick();
            }
        });

        setTitle("Add New Task");

        return fragmentView;
    }

    public void setBtCreateClick(){
        String title = etTitle.getText().toString();
        String description = etDesc.getText().toString();
        mPresenter.saveData(title,description);
    }

    /*public void setBtLoginClick(){
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
        mPresenter.performLogin(email,password);
    }*/

    @Override
    public void setPresenter(AddTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToHome() {
            Intent intent = new Intent(activity, HomeActivity.class);
            startActivity(intent);
            activity.finish();
    }


}
