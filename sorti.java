/**
 * sorti
 */
public class sorti {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
        
    }
    public static boolean sorted( int[] arr, int indx){
        //baseCondition
        if(indx== arr.length-1){
            return true;
        }
        return arr[indx] < arr[indx+1] && sorted (arr, indx+1);

    }
}