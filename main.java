public class main {

    public static void main(String[] args) {
/*
        Clovek c1 = new Clovek("Fero",20,10);
        Clovek c2 = new Clovek("Šimon",70,11);
        System.out.println(c1.getVek());
        c1.setVek(39);
        System.out.println(c1.getVek());

        System.out.println(c1.getMeno());
        c1.setMeno("Jozko");
        System.out.println(c1.getMeno());
        c1.porovnajVek();
        System.out.println(c2.getMeno());
        c2.porovnajVek();

        c1.vypisCisla(10);

*/

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
