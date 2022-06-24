package data_structures;

public class DSMain {

    public static void main(String[] args) {
        Task task1 = new Task("Buy milk");
        Task task2 = new Task("Empty bins");
        Task task3 = new Task("Cut grass");

        Diary diary = new Diary();

        diary.addTask(task1);
        diary.addTask(task2);
        diary.addTask(task3);

        // we're just asking it to get the first thing on the task list
        // the getNextTask calls the method from Diary Class
        // when we implement a Queue, using .remove it takes the first item, prints it here, then removes, which means at index 0 it is replaced with the second task in the queue
        // when we implement a Stack, using .pop it does the same but in reverse (from t3 counting down)

        System.out.println(diary.getNextTask());
        System.out.println(diary.getNextTask());
        System.out.println(diary.getNextTask());



       // exactly how we handle these data structures can be changed
        // unordered with Hashmaps - but, need to call keys
        // key? HashMaps need two bits of info - doesn't have index numbers. keys are the values associated with certain things
        // can access keys using the dot, e.g. tasks.


    }
}
