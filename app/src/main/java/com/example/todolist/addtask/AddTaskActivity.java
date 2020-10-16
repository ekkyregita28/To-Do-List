package com.example.todolist.addtask;

import android.view.View;

import com.example.todolist.base.BaseFragmentHolderActivity;


public class AddTaskActivity extends BaseFragmentHolderActivity {
    AddFragment addTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        addTaskFragment = new AddFragment();
        setCurrentFragment(addTaskFragment, false);

    }



}
