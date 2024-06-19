public class stack {
    public static void main(String[] args) {
        stackmodel<Integer> st1=new stackmodel<>();
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        st1.show();
        stackmodel<String> st2=new stackmodel<>();
        st2.push("a");
        st2.push("m");
        st2.push("a");
        st2.push("l");
        st2.push("s");
        st2.show();
    }
}
class stackmodel<T>{
    int top=-1;
    Object [] arr=new Object[5];

    void push(T data){
        arr[++top]=data;
    }
    void show(){
    for (Object num:arr){
        System.out.print(num+" ");
    }
    }
}