import java.util.Stack;

public class useStackCollection {
    public static void main(String[] args) {
        Stack<Integer> arr=new Stack<>();
        System.out.println(arr.capacity());
        for(int i=1;i<=10;i++){
            arr.push(i);
        }
        System.out.println(arr.capacity());
        arr.push(11);
        System.out.println(arr.capacity());
        arr.pop();
        arr.pop();
        System.out.println(arr.capacity());
    }
}
