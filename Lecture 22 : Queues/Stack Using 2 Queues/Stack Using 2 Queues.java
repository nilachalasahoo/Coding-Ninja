import java.util.Queue;
import java.util.LinkedList;
public class Stack {

    //Define the data members

    Queue<Integer> q1,q2;
    public Stack() {
        //Implement the Constructor
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        //Implement the pop() function
        if(q1.isEmpty())
            return -1;
        q2=q1;
        q1=new LinkedList<>();
        while(q2.size()!=1){
            q1.add(q2.poll());
        }
        return q2.poll();
    }

    public int top() {
        //Implement the top() function
         if(q1.isEmpty())
            return -1;
        q2=q1;
        q1=new LinkedList<>();
        while(q2.size()!=1){
            q1.add(q2.poll());
        }
        int x=q2.poll();
        q1.add(x);
        return x;
    }
}
