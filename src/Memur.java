public class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String email, String departman, String mesai) {
        super(adSoyad, telefon, email);
        this.departman = departman;
        this.mesai = mesai;
    }
    public String getDepartman(){
        return departman;
    }
    public void setDepartman(){
        this.departman = departman;
    }
    public String getMesai(){
        return departman;
    }
    public void setMesai(){
        this.mesai = mesai;
    }
    public void calis(){
        System.out.println(this.getAdSoyad() + " memur görevlerini yapıyor ");
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " memuru C kapısından giriş yaptı ");
    }

}
