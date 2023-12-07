public class LabAsistanı extends Asistan {
    private  String labaGir;
    public LabAsistanı(String adSoyad, String telefon, String email, String ofisSaati, String labaGir){
        super(adSoyad,telefon,email,ofisSaati);
        this.labaGir = labaGir;
    }

    public String getLabaGir() {
        return labaGir;
    }

    public void setLabaGir(String labaGir) {
        this.labaGir = labaGir;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " lab asistanı derse girdi");
    }
}
