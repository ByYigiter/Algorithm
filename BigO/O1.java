package BigO;

public class O1 { // O1 Constant Comlexity
    public static void main(String[] args) {

        int[] arr ={10,2,15,40,55,7};
        // Task array son elemanı yazdır
        System.out.println(arr[arr.length-1]); // bu kodun time complexity i O(1) dir yani array uznluğunun ne olduğu onemli değil
                                                // sayı ne olursa olsun sure sabittir.

        // task verilen bir sayının çift olma durumu
        int x =24;
        if (x%2 == 0) {
            System.out.println("çift"); // O(1) yani ne olursa olsun onemli değil işlem aynıdır
        }



    }

}
