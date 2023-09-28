public class Clovek {
    String meno;
    int vek;
    int id;

    public Clovek(String meno, int vek, int id){
        this.meno = meno;
        this.vek = vek;
        this.id = id;
    }
    public int getVek() {
        return vek;
    }
    public void setVek(int vek){
        this.vek = vek;
    }
    public String getMeno() {
        return meno;
    }
    public void setMeno(String meno){
        this.meno = meno;
    }


    public void porovnajVek(){
        if(this.vek < 40){
            System.out.println("Si mladý");
        }
        else{
            System.out.println("Si starý");
       }
    }

    public void vypisCisla(int max){
      /*    for(int i = 0; i < max; i++){
            System.out.println(i);
            if(i == 5 ){
                continue;
            }
            System.out.println(i);
        }
        */
        int i = 0;
        while(i<11){
            System.out.println(i);
            i++;
        }
    }

}

