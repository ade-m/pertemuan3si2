import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //aplikasi untuk mencetak bil genap dari 1 -20
        //ulang2 bilangan dari 1 -20 1,2,3,4,5,6,7,8-20
        for(int i=1;i<=50;i++){
            // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        int[] numbers = {10,5,7,9,6,55,23,101};
        //membandingkan setiap angka < bubble sort?
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");

         //aplikasi untuk mencetak bil ganjil dari 1 -20
        //ulang2 bilangan dari 20 -1 1,2,3,4,5,6,7,8-20
        int x=4;
        while(x>0){ //kalau x<=0 hentikan
             // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
             System.out.print(x + " " + ((x%2==1) ? " Ganjil " : " Genap "));

            // if(x%2==1){
            //     System.out.print(x + " ");
            // }
            x-=1; // x-=1; x=x-1; x--;
        }
        System.out.println("");


         //aplikasi untuk mencetak bil ganjil dari 1 -20
        //ulang2 bilangan dari 20 -1 1,2,3,4,5,6,7,8-20
        int y=4;
        do{ //kalau x<=0 hentikan
             // modulus %, i (bilangan) % 2 = 0 Genap. i % 2 =1 Ganjil
             System.out.print(y + " " + ((y%2==1) ? " Ganjil " : " Genap "));

             // if(y%2==1){
            //     System.out.print(y + " ");
            // }
            y-=1; // x-=1; x=x-1; x--;
        }while(y>0);
        System.out.println("");
    }
}
