package com.rrbofficial.todoister.adapter;

import com.rrbofficial.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
