package question1;

import java.util.Stack;

public class SkyscraperDriver {

    private int n;
    private int[] sizes;
    private Stack<Integer> stack;

    public SkyscraperDriver(int n, int[] sizes) {
        this.n = n;
        this.sizes = sizes;
        this.stack = new Stack<Integer>();
    }

    public void printConstructionOrder() {
    	System.out.println("The order of construction is as follows:");
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && sizes[i] < stack.peek()) {
                System.out.print(stack.pop() + " ");
                
            }
            stack.push(sizes[i]);
            System.out.println();
            System.out.print("Day " + (i+1) + ": ");
           
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
