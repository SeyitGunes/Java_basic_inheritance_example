public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adSoyad, String telefon, String email, String ofisSaati) {
        super(adSoyad, telefon, email);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad() + " quiz başarı ile gerçekleştirilmiştir.");
    }

}
