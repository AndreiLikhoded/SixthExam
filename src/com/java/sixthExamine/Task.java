package com.java.sixthExamine;

public class Task {

    private String id;
    private String name;
    private String description;
    private String priority;

    public Task(String name, String description, String priority, String id) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
