public class SecondLargest{
public static int find(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } 
else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    return secondLargest;
}
public static void main(String args[]){  
int[] arr = { 5, 7, 3, 9, 1, 4 };
int secondLargest = find(arr);
System.out.println("The second largest number is: " + secondLargest);
}
}