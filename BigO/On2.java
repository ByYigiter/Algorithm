package BigO;

public class On2 { // O(n^2)  eleman sayısının karesi kadar işlem buyuyor -->Quadratic Complexity //

    public static void main(String[] args) {
            // Time complexity açisindan istenmeyen algorithm dir en uzun suren algorithm denilebiilir

        int count = 0;
        int []  arr ={2,1,5,7}; // eğer iç içe loop varsa o işlem sayısı  en kotu senaryo n^2 dir
        // task her
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i]+arr[j]);
                count ++;
            }
            System.out.println();
        }
        System.out.println("count : "+ count );
    }
}
