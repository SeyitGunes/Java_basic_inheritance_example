public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon , String email, String bolum, String unvan, String kapiNo){
        super(adSoyad, telefon, email);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }
    public void setKapiNo(){
        this.kapiNo = kapiNo;
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " tarafından sınav yapılmıştır. ");
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " Öğretim Görevlisi A kapısından giriş yapmıştır. ");
    }
}
