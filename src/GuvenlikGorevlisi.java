public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String email, String departman, String mesai, String belge) {
        super(adSoyad, telefon, email, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad() + " nöbetini tutmuştur. ");
    }

}
