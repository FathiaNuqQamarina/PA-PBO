/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminGudangJayaAbadi;
/**
 *
 * @author LENOVO
 */
public class Admin extends Judul implements validasiAdmin {
    private final String Username = "admingudang";
    private final String Password = "admin1234";

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public void login() {
        System.err.println("\t\tAnda telah berhasil login sebagai Admin\n");
    }

    @Override
    public void logout() {
        System.err.println("\n\t\tAnda telah logout\n");
    }

    @Override
    protected void tampiljudul() {
        System.out.println("\n\n==== Program Manajemen Gudang Obat dan Pendistribusian Obat =====");
        System.out.println("\t|     Fayza Virdana Addiza/2009106004       |");
        System.out.println("\t|     Fathia Nuq Qamarina/2009106012        |");
        System.out.println("\t|     Indah Wulan Lestari/2009106027        |");
        System.out.println("\t|     Jihan Hafizah Ariyani/2009106038      |");
        System.out.println("==================================================================\n");
        
    }
    
    
}
