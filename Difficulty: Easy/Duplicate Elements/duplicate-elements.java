/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
        // Your code here
        Arrays.sort(arr);
        int flag=0,lastPrinted=0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] && lastPrinted!=arr[i]){
                flag=1;
                System.out.print(arr[i]+" ");
                lastPrinted=arr[i];
            } 
        }
        if(flag==0){
            System.out.print("-1");
        }
    }
}