package UNI_STS.Stacks;

//MIN STACK
import java.util.*;

class Main {
    Stack<Integer> s = new Stack<Integer>();
    int min_elem;

    void push(int d) {
        if (s.isEmpty()) {
            min_elem = d;
            s.push(d);
            return;
        }
        if (d < min_elem) {
            s.push(2 * d - min_elem);
            min_elem = d;
        } else {
            s.push(d);
        }
    }

    int pop() {
        if (s.isEmpty()) {
            return -1;
        }
        int d = s.pop();
        if (d < min_elem) {
            min_elem = 2 * min_elem - d;
            return min_elem;
        } else {
            return d;
        }
    }

    int getMin() {
        if (s.peek() < min_elem) {
            return 2 * min_elem - s.peek();
        }
        return s.peek();
    }

    public static void main(String args[]){

    }
}