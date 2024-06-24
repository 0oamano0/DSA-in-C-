public class useOfBinarySearchTree {
    public static void binarySearch(int arr[],int first,int last,int key) {
        int mid =(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.println("Element is Found at index : "+mid);
                break;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not found !");
        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,6,9,2,3,4,5};
        int key=5;
        int last=arr.length-1;
        binarySearch(arr, 0, last, key);
    }
    
}


//! Using Libraries


// import java.util.Arrays;

// class useOfBinarySearchTree{
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50,60};
//         int key=30;
//         int result=Arrays.binarySearch(arr,key);
//         if(result<0){
//             System.out.println("Elemnt is not found !");

//         }else{
//             System.out.println("Element found at index : "+result);
//         }
//     }
    
// }
