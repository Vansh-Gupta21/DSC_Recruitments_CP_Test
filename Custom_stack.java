package DSCcp;

public class Custom_stack {
    public static void main(String[] args) {
        Stack newstack = new Stack(3);

        newstack.push(1);
        newstack.push(2);
        newstack.push(3);

        newstack.peek();
        newstack.pop();
        newstack.peek();

        newstack.pop();
        newstack.pop();
        newstack.pop(); // Edge Case - Underflow Condition

    }

    public static class Stack{
        private int[] arr;
        private final int cap;
        private int ind;

        public Stack(int size){
            cap=size;
            arr = new int[size];
            ind =-1;
        }

        public void push(int num){
            if(ind == cap-1){
                System.out.println("Overflow");
                return;
            }
            arr[++ind] = num;
        }

        public void pop(){
            if(ind < 0){
                System.out.println("Underflow");
                return;
            }
            System.out.println(arr[ind]);
            ind--;
        }

        public void peek(){
            if(ind < 0){
                System.out.println("Stack is Empty");
                return;
            }

            System.out.println(arr[ind]);
        }
    }
}
