package BigO;

// elşimizdeki veri seti arttıkca çalıştırlşıma sureside doğru orantılı olarak artıyor
public class On { // O(n) --> Linear Complexity

    public static void main(String[] args) {

        int[] arr ={10,2,15,40,55,7};
        // array tum elemanlarını yazdır.
        for (int item:arr) {
            System.out.println(item +","); // burası array sayısı kadar işlem demek  yanı 6 işlem
        }
    }
}
