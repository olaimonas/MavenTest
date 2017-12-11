package com.test.info.model;

public class Task {

    private String taskName;
    private int timeSpentOnTask;
    private String taskGroup;
    private String taskAssignee;
    private Task subTask;
    private boolean isTaskFinished;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTimeSpentOnTask() {
        return timeSpentOnTask;
    }

    public void setTimeSpentOnTask(int timeSpentOnTask) {
        this.timeSpentOnTask = timeSpentOnTask;
    }

    public String getTaskGroup() {
        return taskGroup;
    }

    public void setTaskGroup(String taskGroup) {
        this.taskGroup = taskGroup;
    }

    public String getTaskAssignee() {
        return taskAssignee;
    }

    public void setTaskAssignee(String taskAssignee) {
        this.taskAssignee = taskAssignee;
    }

    public Task getSubTask() {
        return subTask;
    }

    public void setSubTask(Task subTask) {
        this.subTask = subTask;
    }

    public boolean isTaskFinished() {
        return isTaskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        isTaskFinished = taskFinished;
    }
}