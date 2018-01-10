package in.vamsoft.collection;

import java.util.Stack;

public class StackDemo {

  /**
   * @param args
   *          get the values as a parameter.
   */
  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    
    stack.push(12);
    stack.pop();
    stack.push(11);
    stack.push(33);
    
    System.out.println(stack.isEmpty());
    System.out.println(stack);

  }

}
