package com.example.todolist.updatetask;

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
import com.example.todolist.home.HomeActivity;

public class UpdateTaskFragment extends BaseFragment<UpdateTaskActivity, UpdateTaskContract.Presenter> implements UpdateTaskContract.View {

    EditText etTitle;
    EditText etDate;
    EditText etDesc;
    //String email,password;
    Button btSave;


    public UpdateTaskFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.update_task, container, false);
        mPresenter = new UpdateTaskPresenter(this);
        mPresenter.start();

        etTitle = fragmentView.findViewById(R.id.etTitle);
        etDate = fragmentView.findViewById(R.id.etDate);
        etDesc = fragmentView.findViewById(R.id.etDesc);
        btSave = fragmentView.findViewById(R.id.btCreate);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtSaveClick();
            }
        });

        setTitle("My Login View");

        return fragmentView;
    }

    public void setBtSaveClick(){
        mPresenter.performHome();
    }

    /*public void setBtLoginClick(){
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
        mPresenter.performLogin(email,password);
    }*/

    @Override
    public void setPresenter(UpdateTaskContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToHome() {
            Intent intent = new Intent(activity, HomeActivity.class);
            startActivity(intent);
            activity.finish();
    }


}
