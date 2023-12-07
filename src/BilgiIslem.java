public class BilgiIslem extends Memur{
    private String gorev;
    public BilgiIslem(String adSoyad, String telefon, String email, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, email, departman, mesai);
        this.gorev = gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad() + " network kurulumu başarı ile tamamnladı ");

    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
