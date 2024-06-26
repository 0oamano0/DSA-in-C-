//! Heap -> two types 
//?         1. Minheap(min root node and child node having max )
//?         2. Maxheap(max root node and data will be added based on level)

public class useOfHeap {

    int[] arr;
    int size;
    useOfHeap(){
        this.size=0;
        arr=new int[20];

    }

    int parentpos(int pos){
        return (pos-1)/2;
    }

    int getLeftChildPos(int pos){
        return (pos*2)+1;

    }
    int getRightChildPos(int pos){
        return (pos*2)+2;

    }

    void print(){
        for (int i = 0; i < size/2; i++) {
            System.out.println("parent : "+arr[i]);
            if(getLeftChildPos(i)<size){
                System.out.println("Left Child : "+arr[getLeftChildPos(i)]);
            }
            if(getRightChildPos(i)<size){
                System.out.println("Right Child : "+arr[getRightChildPos(i)]);
            }
            System.out.println();
        }
    }

    void swap(int curpos,int parpos){
        int t;
        t=arr[curpos];
        arr[curpos]=arr[parpos];
        arr[parpos]=t;
    }

    void insert(int ele){
        arr[size]=ele;
        int current=size;
        while(arr[current]<arr[parentpos(current)]){
            swap(current,parentpos(current));
            current=parentpos(current);
        }
        size++;

    }

    boolean isLeaf(int pos){
        if(pos>(size/2) && pos<=size){
            return true;
        }
        return false;
    }

    int poll(){
        int popped=arr[0];
        arr[0]=arr[--size];
        heapify(0);
        return popped;
    }
    void heapify(int pos) {
        if(isLeaf(pos)){
            return;
        }
        if(arr[pos]>arr[getLeftChildPos(pos)]  || arr[pos]<arr[getRightChildPos(pos)]){
            if(arr[getLeftChildPos(pos)]<arr[getRightChildPos(pos)]){
                swap(pos,getLeftChildPos(pos));
                heapify(getLeftChildPos(pos));
            }else{
                swap(pos,getRightChildPos(pos));
                heapify(getRightChildPos(pos));
            }
        }
    }

    public static void main(String[] args) {

        useOfHeap mp=new useOfHeap();
        mp.insert(10);
        mp.insert(5);
        mp.insert(6);
        mp.insert(2);
        mp.insert(30);
        mp.insert(8);
        mp.insert(9);
        mp.insert(1);
        mp.print();
        System.out.println("--------------------------");
        mp.poll();
        mp.print();
        

    }
    
}
