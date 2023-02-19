import java.util.Stack;

/*
Implement a first in first out (FIFO) queue using only two stacks.
The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).*/
class MyQueue {
  // A stack is a LIFO queue - you add at the top; pop at the top
  // We want a FIFO queue w/2 stacks - add at the top; pop at the bottom
  final Stack<Integer> stack1 , stack2;
  int emptyS;

  public MyQueue() {
    emptyS = 1;
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void push(int x) {
    // do the thing to put a new element in the FIFO queue (empty one deck, put other)..
    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
    stack1.push(x);
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
  }

  public int pop() {
    return emptyS == 1 ? stack2.pop() : stack1.pop();
  }

  public int peek() {
    return stack1.isEmpty() ? stack2.peek() : stack1.peek();
  }

  public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }
}
/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */