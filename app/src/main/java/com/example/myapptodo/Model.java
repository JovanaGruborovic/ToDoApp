package com.example.myapptodo;

import java.util.HashMap;

public class Model {
    private String task, description, id, date;

    private Model(){

    }

    public Model(String task, String description, String id, String date) {
        this.task = task;
        this.description = description;
        this.id = id;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String,String> toFirebaseObject() {
        HashMap<String,String> todo =  new HashMap<String,String>();
        todo.put("task", task);
        todo.put("description", description);
        todo.put("id", id);
        todo.put("date", date);

        return todo;
    }

}
