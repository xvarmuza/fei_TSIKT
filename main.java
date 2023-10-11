public class main {

    public static void main(String[] args) {


//primeNumber
        int cislo = 17;
        int c = 1;
        for (int n = cislo-1; n >= 3; n--) {
            if (cislo % n == 0) {
                System.out.println("False");
                c=2;
                break;
            }
        }
        if (c == 1) {
            System.out.println("True");
        }




//factorial
        int f_cislo = 5;
            int i;
            int j = 1;
            for(i=1;i<=f_cislo;i++){
                j = j * i;
            }
            System.out.println(j);

//fibonaciho s 3mi

        int pocet_vo_fibonacim = 6;
            int  f1 = 0, f2 = 1, f3 = 1, nove;
            for(i = 0; i < pocet_vo_fibonacim;i++){
                nove = f1 + f2 + f3;
                f1 = f2;
                f2 = f3;
                f3 = nove;
                System.out.print(f1+" ");
            }
    }
}
