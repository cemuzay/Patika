package src.Inheritence;

public class calisan {
    private String adsoyad;
    private String telefon;
    private String eposta;
    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }


    public calisan(String adsoyad, String telefon, String eposta) {
        this.adsoyad = adsoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }
    public void giris(){
        System.out.println(this.adsoyad+ " Üniversiteye giriş yaptı ");
    }
    public void cikis(){
        System.out.println(this.adsoyad+ " Üniversiteden çıkış yaptı");
    }
    public void yemekhane(){
        System.out.println(this.adsoyad+ " yemekhaneye giriş yaptı ");
    }

}
