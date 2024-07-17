public class linear {

    public static void main(String[] args){
        int[] arr = {2,4,5,6,1,7,9,99};
        System.out.println(find(arr, 0, 3));
        System.out.println(findx(arr, 9, 0));

    }
    public static boolean find(int[] arr, int index,int trg){
        if(index == arr.length){
            return false;
        }
        return arr[index]== trg || find(arr, index+1, trg);
    }
    //finding the index of element 
    public static int findx(int[] arr, int trg, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == trg){
            return index;
        }
        else{
            return findx(arr, trg, index + 1);
        }
    }
    
}
