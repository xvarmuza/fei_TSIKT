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
}

