public class main {

    public static void main(String[] args){

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
    }

}
