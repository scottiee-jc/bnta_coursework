package data_structures;

public class Task {

    private String title;
    private boolean complete;

    public Task(String title){
        this.title = title;
        this.complete = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    // generate -> toString -> select both properties -> boom!
    // override the toString to print out the object details, as opposed to the hashmap reference

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", complete=" + complete +
                '}';
    }
}
