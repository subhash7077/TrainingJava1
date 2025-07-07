package training.java.Arrayex;

public class MoveZeroesToEnd {
    void moveZerosToLast(int[] arr){
        int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;

            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesToEnd move =new MoveZeroesToEnd();
        int[] arr={0,1,0,3,12};
        System.out.println("Array before moving zeros: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray after moving zeros to the end: ");
        move.moveZerosToLast(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
