
public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("dusan tadic", "05055055005", "info@cumhuriyet.edu");
        Akademisyen a1 = new Akademisyen("ibo" ,"0510515152" , "ibo@gmail.com");
        OgretimGorevlisi o1 = new OgretimGorevlisi("selim", "0505215648948", "a@info.tr", "bilgisayar muhendisligi", "Dr.Öğretim Görevlisi", "12");
        LabAsistanı l1 = new LabAsistanı("doğu", "056548948948", "d@gmail.com", "12:00 - 19:00" , "Giriş yapıldı");
        BilgiIslem b1 = new BilgiIslem("ahmet kurtulmuş", "05050505412", "ahmet@gmail.com", "IT", "09:00 - 17:00", "ön uç geliştirici");
        Memur m1 = new Memur("ali koç", "050519071907", "fbkoçali@gmail.com", "finans", "7/24");
        a1.giris();
        o1.giris();
        c1.giris();
        m1.giris();
    }
}