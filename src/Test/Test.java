package Test;

public class Test {

    public static int firstDuplicateOccurence(int[] arr){
        for (int i=0;i<arr.length; i++)
            for (int j=i + 1;j<arr.length; j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        return 0;
    }
    // First duplicate occurence in an array
    public static void main(String[] args) {

        int arr[] = {1,2,3,45};

        System.out.println(firstDuplicateOccurence(arr));

    }
}
