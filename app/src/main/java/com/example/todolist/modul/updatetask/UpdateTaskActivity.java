package com.example.todolist.modul.updatetask;

import android.view.View;

import com.example.todolist.base.BaseFragmentHolderActivity;


public class UpdateTaskActivity extends BaseFragmentHolderActivity {
    UpdateTaskFragment addTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        addTaskFragment = new UpdateTaskFragment();
        setCurrentFragment(addTaskFragment, false);

    }



}
