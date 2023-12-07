public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String email) {
        super(adSoyad, telefon, email);
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriş yaptı ");
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " Akademisyeni B kapısından giriş yaptı ");
    }
}
