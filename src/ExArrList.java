public class ExArrList {
    public static void main(String[] args) {
        // Create an array list of integers
        java.util.ArrayList<Integer> arrList = new java.util.ArrayList<>();

        // Add elements to the array list
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);

        // Print the array list
        System.out.println("Array List: " + arrList);

        // Access an element at index 1
        int elementAtIndex1 = arrList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Remove an element at index 0
        arrList.remove(0);
        System.out.println("Array List after removal: " + arrList);

        // Get the size of the array list
        int size = arrList.size();
        System.out.println("Size of Array List: " + size);

    }
}
