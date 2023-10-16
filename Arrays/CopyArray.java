public class CopyArray {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {5,6,7,8,9};

        for(int i = 0; i<5; i++){
            list2[i] = list1[i];
            System.out.println(list2[i]);
        }
    }
}
