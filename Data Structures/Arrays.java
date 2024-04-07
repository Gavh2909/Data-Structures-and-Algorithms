
class Arrays{
    public static void main(String[] args){
        // Declaring and initialization
        int[] arr={11,2,3,4,5};

        //methods
        int length = arr.length; // to get a length of an array

        // Iterating Through an Array

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        // Enhanced for loop
        for(int n:arr){
            System.out.println(n);
        }

       
    }
}