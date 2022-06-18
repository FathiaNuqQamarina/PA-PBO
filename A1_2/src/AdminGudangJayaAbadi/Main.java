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
import java.util.*;
import Obat.*;
import MitraGudangJayaAbadi.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
        static Scanner inputStr = new Scanner(System.in);
        static Scanner inputInt = new Scanner(System.in);
        static String pilih, admin, pLogin, mitra, pilihAd; static int phPesan,phMasuk,id,id1,Stock;
        static ArrayList<ObatGenerik> ObtG = new ArrayList<ObatGenerik>();
        static ArrayList<ObatPaten> ObtP = new ArrayList<ObatPaten>();
        static ArrayList<Mitra> Mtr = new ArrayList<Mitra>();
        static ObatGenerik masuk1 = new ObatGenerik();
        static ObatPaten masuk2 = new ObatPaten();
        static Mitra pesan = new Mitra();
        static Admin Ad = new Admin();
        public static void main(String[] args) {
            Boolean start,restart,restart2;
            start = true;
            while (start){
                menuLogin();
                switch(pLogin){
                    case "1":
                        restart = getAdmin();
                        while(restart){
                            menuAdmin();
                            switch(pilihAd){
                                case "1" :
                                    do{
                                        boolean done = false;
                                        while(!done){
                                        try{
                                        System.out.println("\n\n\t    :---------------------------------------:");
                                        System.out.println("\t    |               Jenis Obat              |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.println("\t    | 1. Obat Generik                       |");
                                        System.out.println("\t    | 2. Obat Paten                         |");
                                        System.out.println("\t    | 0. Kembali                            |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.print  ("\t     Pilih Menu : ");
        
                                        
                                        phMasuk = inputInt.nextInt();
                                        done = true;
                                        
                                        }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                        }
                                        }
                                        switch(phMasuk){
                                            
                                            case 1:
                                                boolean done1 = false;
                                                while(!done1){
                                                try{
                                                System.out.print("\t\tMasukkan Id Obat : ");
                                                masuk1.setid(inputInt.nextInt());
                                                done1 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.print("\t\tMasukkan Nama Obat : ");
                                                masuk1.setNama(inputStr.nextLine());
                                                System.out.print("\t\tMasukkan Jenis Obat : ");
                                                masuk1.setJenis(inputStr.nextLine());
                                                boolean done2 = false;
                                                while(!done2){
                                                try{
                                                System.out.print("\t\tMasukkan Stock Obat : ");
                                                masuk1.setStock(inputInt.nextInt());
                                                done2 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }

                                                int id = masuk1.getid();
                                                String Nama = masuk1.getNama();
                                                String Jenis = masuk1.getJenis();
                                                int Stock = masuk1.getStock();

                                                ObtG.add(new ObatGenerik(id,Nama,Jenis,Stock));
                                                System.out.println("\t\tData Berhasil Disimpan..."); 
                                                System.out.println(" ");
                                                break;
                                            case 2:
                                                boolean done3 = false;
                                                while(!done3){
                                                try{
                                                System.out.print("\t\tMasukkan Id Obat : ");
                                                masuk2.setid(inputInt.nextInt());
                                                done3 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.print("\t\tMasukkan Nama Obat : ");
                                                masuk2.setNama(inputStr.nextLine());
                                                System.out.print("\t\tMasukkan Jenis Obat : ");
                                                masuk2.setJenis(inputStr.nextLine());
                                                boolean done4 = false;
                                                while(!done4){
                                                try{
                                                System.out.print("\t\tMasukkan Stock Obat : ");
                                                masuk2.setStock(inputInt.nextInt());
                                                done4 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }

                                                int id2 = masuk2.getid();
                                                String Nama2 = masuk2.getNama();
                                                String Jenis2 = masuk2.getJenis();
                                                int Stock2 = masuk2.getStock();

                                                ObtP.add(new ObatPaten(id2,Nama2,Jenis2,Stock2));
                                                System.out.println("\t\tData Berhasil Disimpan..."); 
                                                System.out.println(" ");
                                                break;
                                            
                                            }
                                              
                                    }while(phMasuk!=0);
                                    break;
                                                
                                case "2":
                                    System.out.println("\t\t=============================================");
                                    System.out.println("\t\t======= Data Ketersediaan Obat Generik ======");
                                    System.out.println("\t\tID     |Nama           |Jenis          |Stock");
                                    Iterator<ObatGenerik> i = ObtG.iterator();
                                    while(i.hasNext()){
                                        ObatGenerik oG = i.next();
                                        System.out.println(oG);   
                                    }
                                    System.out.println("");
                                    System.out.println("\t\t=============================================");
                                    System.out.println("\t\t======= Data Ketersediaan Obat Paten ========");
                                    System.out.println("\t\tID     |Nama           |Jenis          |Stock");
                                    Iterator<ObatPaten> i1 = ObtP.iterator();
                                    while(i1.hasNext()){
                                        ObatPaten oP = i1.next();
                                        System.out.println(oP);   
                                    }
                                    System.out.println("\t\t=============================================");
                                    System.out.println(" ");
                                    break;
                                    
                                case "3":
                                    boolean found = false;
                                    do{
                                        boolean done5 = false;
                                        while(!done5){
                                        try{
                                        System.out.println("\n\n\t    :---------------------------------------:");
                                        System.out.println("\t    |               Jenis Obat              |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.println("\t    | 1. Obat Generik                       |");
                                        System.out.println("\t    | 2. Obat Paten                         |");
                                        System.out.println("\t    | 0. Kembali                            |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.print  ("\t     Pilih Menu : ");
        
                                        
                                        phMasuk = inputInt.nextInt();
                                        done5 = true;
                                        
                                        }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                        }
                                        }

                                        switch(phMasuk){
                                            
                                            case 1:
                                                boolean done6 = false;
                                                while(!done6){
                                                try{
                                                  System.out.print("\t\tMasukkan Id Obat yang ingin dihapus : ");
                                                  id = inputInt.nextInt();
                                                  done6 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t====================================");
                                                i = ObtG.iterator();
                                                while(i.hasNext()){
                                                    Obat o = i.next();
                                                    if(o.getid() == id){
                                                        i.remove();
                                                        found = true;
                                                    }
                                                }
                                                if (!found){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Dihapus..."); 
                                                }
                                                System.out.println("\t\t====================================");
                                                System.out.println(" ");
                                            break;   
                                            case 2:
                                                boolean done7 = false;
                                                while(!done7){
                                                try{
                                                    System.out.print("\t\tMasukkan Id Obat yang ingin dihapus : ");
                                                    id1 = inputInt.nextInt();
                                                    done7 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t====================================");
                                                i1 = ObtP.iterator();
                                                while(i1.hasNext()){
                                                    Obat o = i1.next();
                                                    if(o.getid() == id1){
                                                        i1.remove();
                                                        found = true;
                                                    }
                                                }
                                                if (!found){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Dihapus..."); 
                                                }
                                                System.out.println("\t\t====================================");
                                                System.out.println(" ");
                                            break;
                                            
                                        }
                                    }while(phMasuk!=0);
                                    break;          
                                case "4":
                                    found = false;
                                    do{
                                        boolean done8 = false;
                                        while(!done8){
                                        try{
                                        System.out.println("\n\n\t    :---------------------------------------:");
                                        System.out.println("\t    |               Jenis Obat              |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.println("\t    | 1. Obat Generik                       |");
                                        System.out.println("\t    | 2. Obat Paten                         |");
                                        System.out.println("\t    | 0. Kembali                            |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.print  ("\t     Pilih Menu : ");
        
                                        
                                        phMasuk = inputInt.nextInt();
                                        done8 = true;
                                        
                                        }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                        }
                                        }

                                        switch(phMasuk){
                                            
                                            case 1:
                                                boolean done9 = false;
                                                while(!done9){
                                                try{
                                                System.out.print("\t\tMasukkan Id Obat yang ingin diedit : ");
                                                id = inputInt.nextInt();
                                                done9 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t===================================");
                                                ListIterator<ObatGenerik>li= ObtG.listIterator();
                                                while(li.hasNext()){
                                                    ObatGenerik o = li.next();
                                                    if(o.getid() == id){
                                                        System.out.print("\t\tMasukkan Nama Obat Baru :");
                                                        String Nama = inputStr.nextLine();

                                                        System.out.print("\t\tMasukkan Jenis Obat Baru :");
                                                        String Jenis = inputStr.nextLine();
                                                        boolean done17 = false;
                                                        while(!done17){
                                                        try{
                                                        System.out.print("\t\tMasukkan Stock Obat Baru :");
                                                        Stock = inputInt.nextInt();
                                                        done17=true;
                                                        }catch(InputMismatchException e){
                                                        inputInt.nextLine();
                                                        System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                        }
                                                        }
                                                        li.set(new ObatGenerik (id, Nama, Jenis, Stock));
                                                        found = true;
                                                    }
                                                }
                                                if (!found){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Diupdate..."); 
                                                }
                                                System.out.println("\t\t===================================");
                                                System.out.println(" ");
                                                break;
                                            case 2:
                                                boolean done10 = false;
                                                while(!done10){
                                                try{
                                                System.out.print("\t\tMasukkan Id Obat yang ingin diedit : ");
                                                id = inputInt.nextInt();
                                                done10 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t===================================");
                                                ListIterator<ObatPaten>li1= ObtP.listIterator();
                                                while(li1.hasNext()){
                                                    ObatPaten o = li1.next();
                                                    if(o.getid() == id){
                                                        System.out.print("\t\tMasukkan Nama Obat Baru :");
                                                        String Nama = inputStr.nextLine();

                                                        System.out.print("\t\tMasukkan Jenis Obat Baru :");
                                                        String Jenis = inputStr.nextLine();
                                                        boolean done16 = false;
                                                        while(!done16){
                                                        try{
                                                        System.out.print("\t\tMasukkan Stock Obat Baru :");
                                                        Stock = inputInt.nextInt();
                                                        done16 = true;
                                                        }catch(InputMismatchException e){
                                                        inputInt.nextLine();
                                                        System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                        }
                                                        }
                                                        li1.set(new ObatPaten (id, Nama, Jenis, Stock));
                                                        found = true;
                                                    }
                                                }
                                                if (!found){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Diupdate..."); 
                                                }
                                                System.out.println("\t\t===================================");
                                                System.out.println(" ");
                                                break;
                                                
                                                
                                            }
                                    }while(phMasuk!=0);
                                    break;
                                case "5":
                                    int NoMitra = pesan.getNoMitra();
                                    
                                    do{
                                        boolean done11 = false;
                                        while(!done11){
                                        try{
                                        System.out.println("\n\n\t    :---------------------------------------:");
                                        System.out.println("\t    |               Menu Pesanan            |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.println("\t    | 1. Lihat Pesanan                      |");
                                        System.out.println("\t    | 2. Hapus Data Pesanan                 |");
                                        System.out.println("\t    | 3. Edit Status Pesanan                |");
                                        System.out.println("\t    | 4. Kembali                            |");
                                        System.out.println("\t    :---------------------------------------:");
                                        System.out.print  ("\t     Pilih Menu : ");
        
                                        phPesan = inputInt.nextInt();
                                        done11 = true;
                                        
                                        }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                        }
                                        }

                                        switch(phPesan){
                                            
                                            case 1:
                                                System.out.println("\t\t=====================================================================================================================");
                                                System.out.println("\t\t=====================================List Pesanan Pendistribusian Obat===============================================");
                                                System.out.println("\t\tNo Mitra       |Nama Mitra     |Nama Obat         |Jumlah Obat       |Lokasi Distribusi        |Status");
                                                Iterator<Mitra> j = Mtr.iterator();
                                                while(j.hasNext()){
                                                    Mitra p = j.next();
                                                    System.out.println(p);   
                                                }
                                                System.out.println("\t\t=====================================================================================================================");
                                                System.out.println(" ");
                                                break;
                                            case 2 :
                                                boolean found1 = false;
                                                boolean done12 = false;
                                                while(!done12){
                                                try{
                                                System.out.print("\t\tMasukkan No.Mitra  yang ingin dihapus : ");
                                                NoMitra = inputInt.nextInt();
                                                done12 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t======================================");
                                                j = Mtr.iterator();
                                                while(j.hasNext()){
                                                    Mitra p = j.next();
                                                    if(p.getNoMitra() == NoMitra){
                                                        j.remove();
                                                        found1 = true;
                                                    }
                                                }
                                                if (!found1){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Dihapus..."); 
                                                }
                                                System.out.println("\t\t======================================");
                                                System.out.println(" ");
                                            break;   
                                            case 3:
                                                found = false;
                                                boolean done13 = false;
                                                while(!done13){
                                                try{
                                                System.out.print("\t\tMasukkan No Mitra yang ingin diedit : ");
                                                NoMitra = inputInt.nextInt();
                                                done13 = true;
                                                }catch(InputMismatchException e){
                                                    inputInt.nextLine();
                                                    System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                                }
                                                }
                                                System.out.println("\t\t====================================");
                                                ListIterator<Mitra>liM= Mtr.listIterator();
                                                while(liM.hasNext()){
                                                    Mitra p = liM.next();
                                                    if(p.getNoMitra() == NoMitra){
                                                        String NamaMitra = p.getNamaMitra();
                                                        String NamaObat = p.getNamaObat();
                                                        int JumlahObat = p.getJumlahObat();
                                                        String LokasiDis = p.getLokasiDis();
                                                        System.out.print("\t\tMasukkan Status Pesanan Baru :");
                                                        String status = inputStr.nextLine();
                                                        liM.set(new Mitra (NoMitra, NamaMitra, NamaObat, JumlahObat,LokasiDis,status));
                                                        found = true;
                                                    }
                                                }
                                                if (!found){
                                                    System.out.println("\t\tData Tidak Ditemukan");
                                                }else{
                                                    System.out.println("\t\tData Berhasil Diupdate..."); 
                                                }
                                                System.out.println("\t\t==============================");
                                                System.out.println(" ");
                                            break;
                                            
                                          
                                            }
                                    }while(phPesan!=4);
                                    break;
                                case "6" :
                                    restart = false;
                                    Ad.logout();
                                    break;
                                case "0" :
                                    System.err.println("\t\tProgram Selesai");
                                    System.exit(0);
                                    break;
                                default:
                                     System.err.println("\t\tError: Pilihan Tidak Tersedia !!");
                                     break;
                            }
                        }
                        break;
                    case "2":
                        restart2 = true;
                        pesan.login();
                        while(restart2){
                            menuMitra();
                            switch(mitra){
                                case "1":
                                    boolean done14 = false;
                                    while(!done14){
                                    try{
                                    System.out.print("\t\tMasukkan Nomor Mitra : ");
                                    pesan.setNoMitra(inputInt.nextInt());
                                    done14 = true;
                                    }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                    }
                                    }
                                    System.out.print("\t\tMasukkan Nama Mitra : ");
                                    pesan.setNamaMitra(inputStr.nextLine());
                                    System.out.print("\t\tMasukkan Nama Obat : ");
                                    pesan.setNamaObat(inputStr.nextLine());
                                    boolean done15 = false;
                                    while(!done15){
                                    try{
                                    System.out.print("\t\tMasukkan Jumlah Pesanan Obat : ");
                                    pesan.setJumlahObat(inputInt.nextInt());
                                    done15 = true;
                                    }catch(InputMismatchException e){
                                            inputInt.nextLine();
                                            System.err.println("\t\t#error: Inputan Berupa Angka. silahkan coba lagi.");
                                    }
                                    }
                                    System.out.print("\t\tMasukkan Lokasi Pendistribusian Obat : ");
                                    pesan.setLokasiDis(inputStr.nextLine());
                                    
                                    int NoMitra = pesan.getNoMitra();
                                    String NamaMitra = pesan.getNamaMitra();
                                    String NamaObat = pesan.getNamaObat();
                                    int JumlahObat = pesan.getJumlahObat();
                                    String LokasiDis = pesan.getLokasiDis();
                                    String Status = pesan.getStatus();

                                    Mtr.add(new Mitra(NoMitra,NamaMitra,NamaObat,JumlahObat,LokasiDis,Status));
                                    System.out.println("\t\tData Berhasil Disimpan..."); 
                                    System.out.println(" ");
                                    break;
                                case "2":
                                    System.out.println("\t\t=====================================================================================================================");
                                    System.out.println("\t\t=====================================List Pesanan Pendistribusian Obat===============================================");
                                    System.out.println("\t\tNo Mitra       |Nama Mitra     |Nama Obat         |Jumlah Obat       |Lokasi Distribusi        |Status");
                                    Iterator<Mitra> j = Mtr.iterator();
                                    while(j.hasNext()){
                                        Mitra p = j.next();
                                        System.out.println(p);   
                                    }
                                    System.out.println("\t\t=====================================================================================================================");
                                    System.out.println(" ");
                                    break;
                                case "3":
                                    restart2 = false;
                                    pesan.logout();
                                    break;
                                default:
                                    System.err.println("\t\tError: Pilihan Tidak Tersedia !!");
                                    break;
                                    
                            }
                        }
                        break;
                    case "0" :
                        System.err.println("\t\tProgram Selesai");
                        System.exit(0);
                        break;
                    default:
                        System.err.println("\t\tError: Pilihan Tidak Tersedia !!");
                        break;
                        
                        
                }
            }
        }
        
     public static String menuLogin(){
         
       Ad.tampiljudul();
       System.out.println("\n\t\t=Pilihan Akses=");
       System.out.println("\t| Ingin Masuk Sebagai:          |");
       System.out.println("\t| 1. Admin                      |");
       System.out.println("\t| 2. Mitra                      |");
       System.out.println("\t| 0. Keluar                     |");
       System.out.print("\t| Pilih: ");
       pLogin = inputStr.nextLine();
       return pLogin;
       }
     
     private static boolean getAdmin(){
        boolean admin;
        Admin akun = new Admin();
        
//        clearScreen();
        System.out.println("\n\t ______________________________ ");
        System.out.println("\t|                               | ");
        System.out.println("\t|        Menu Konfirmasi        | ");
        System.out.println("\t|-------------------------------| ");
        System.out.print("\t| Username  : ");
        String uname = inputStr.nextLine();
        System.out.print("\t| Password  : ");
        String pass = inputStr.nextLine();
        
        while(!uname.equals(akun.getUsername()) || !pass.equals(akun.getPassword())){
            System.err.print("\t Username atau Password Anda Salah ");
            
            System.err.print("\t| Username  : ");
            uname = inputStr.nextLine();
            System.err.print("\t| Password  : ");
            pass = inputStr.nextLine();
            
        }
        admin = true;
        Ad.login();
        return admin;
    }
     
     
     
    public static String menuAdmin(){
        System.out.println("\n\n\t    :---------------------------------------:");
        System.out.println("\t    |               Menu Admin              |");
        System.out.println("\t    :---------------------------------------:");
        System.out.println("\t    | 1. Masukkan Data Obat                 |");
        System.out.println("\t    | 2. Lihat Data Obat                    |");
        System.out.println("\t    | 3. Hapus Data Obat                    |");
        System.out.println("\t    | 4. Edit Data Obat                     |");
        System.out.println("\t    | 5. Pesanan Pendistribusian Obat       |");
        System.out.println("\t    | 6. Kembali                            |");
        System.out.println("\t    | 0. Keluar                             |");
        System.out.println("\t    :---------------------------------------:");
        System.out.print  ("\t     Pilih Menu : ");
        
        pilihAd = inputStr.nextLine();
        return pilihAd;
    }
    
     
     public static String menuMitra(){
        System.out.println("\n\n\t    :-----------------------------:");
        System.out.println("\t    |          Menu Mitra         |");
        System.out.println("\t    :-----------------------------:");
        System.out.println("\t    | 1. Buat Pesanan             |");
        System.out.println("\t    | 2. Cek Status               |");
        System.out.println("\t    | 3. Kembali                  |");
        System.out.println("\t    :-----------------------------:");
        System.out.print  ("\t     Pilih Menu : ");
        
        mitra = inputStr.nextLine();
        return mitra;
    }   

}

