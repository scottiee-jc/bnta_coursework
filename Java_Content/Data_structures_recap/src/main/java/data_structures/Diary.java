package data_structures;

import java.util.*;

public class Diary {

    // going to have a collection that is going to store tasks in it

    // creating a property that stores the object Task within a stack

    private Stack<Task> tasks;
    // private HashMap <String, Task> tasks;
    // private List<Task> tasks;
    // private Queue<Task> tasks;


    // adding a Diary method that defines the tasks as a stack
    public Diary(){
        this.tasks = new Stack<>();
        // swapped out ArrayList<>() from original List because it doesn't implement queue
        // swapped out Queue<>() for Stack<>()
    }

    // adding a addTask method with .add to an arraylist
    // adding t1, which goes into index 0, t2 goes into index 1, t3 into index 2
    // when .remove is called, getNextTasks calls this
    // called in the DSMain to add task1, task2, task3 to the queue

    public void addTask(Task task){
        this.tasks.add(task);
    }

    // if we want a method that returns the next task?
    // no concept of ordering with HashMap... we can't get the next value :(
    // use a list... maybe, but might make it more convuluted to stop it just taking out the first item every time - hard to keep track of changes!
    // a queue - functionality built in to keep track of the next thing but remove the present thing once it's been returned
    // the removes t1 out and t2 replaces it at index 0
    // [_t1_, _t2_, _t3_] -----> [_t2_, _t3_]
    // the main prints the next task out as specified by the number of times we sout in the main
    // using stack and .pop will take the last bit off first
    // [_t1_, _t2_, _t3_] ------> [_t1_, _t2_]
    // .pop is just the method a stack uses to take away the item in the list - but it returns this before removing

    public Task getNextTask(){
        return this.tasks.pop();
    }
}
