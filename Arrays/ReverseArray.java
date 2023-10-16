public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,};
        int temp = 0; 
        int rightPointer = array.length-1;

        for(int leftPointer = 0; leftPointer<=array.length/2; leftPointer++){
            temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;
            rightPointer--;
        }

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
