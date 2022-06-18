/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MitraGudangJayaAbadi;

/**
 *
 * @author LENOVO
 */
public class Mitra implements validasi{
    protected String NamaMitra,NamaObat,LokasiDis;
    private String status;
    protected int JumlahObat;
    private int NoMitra;
    
    public Mitra (int NoMitra,String NamaMitra, String NamaObat,int JumlahObat,String LokasiDis,String status){ //Constructor
        this.NoMitra = NoMitra;
        this.NamaMitra = NamaMitra;
        this.NamaObat = NamaObat;
        this.LokasiDis = LokasiDis;
        this.JumlahObat = JumlahObat;
        this.status = status;
       
    }

    public Mitra (){
     
    }
    
    public String getNamaMitra() {
        return NamaMitra;
    }

    public void setNamaMitra(String NamaMitra) {
        this.NamaMitra = NamaMitra;
    }

    public String getNamaObat() {
        return NamaObat;
    }

    public void setNamaObat(String NamaObat) {
        this.NamaObat = NamaObat;
    }

    public String getLokasiDis() {
        return LokasiDis;
    }

    public void setLokasiDis(String LokasiDis) {
        this.LokasiDis = LokasiDis;
    }

    public int getJumlahObat() {
        return JumlahObat;
    }

    public void setJumlahObat(int JumlahObat) {
        this.JumlahObat = JumlahObat;
    }    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoMitra() {
        return NoMitra;
    }

    public void setNoMitra(int NoMitra) {
        this.NoMitra = NoMitra;
    }
    
    @Override
    public String toString(){ // method print
        return ("\t\t"+ NoMitra+"\t\t"+NamaMitra+"\t\t"+NamaObat+"\t\t"+JumlahObat+"\t\t"+LokasiDis+"\t\t"+status);
    }

    @Override
    public void login() {
        System.err.println("\t\tAnda telah berhasil login sebagai Mitra");
    }

    @Override
    public void logout() {
       System.err.println("\n\t\tAnda telah logout\n");
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

