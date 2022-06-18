/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obat;

/**
 *
 * @author LENOVO
 */
public class Obat {
    protected int id;
    protected String Nama;
    protected String Jenis; // Properti/Atribut
    protected int Stock;
    
    public Obat(){
        
    }
    
    public Obat(int id, String Nama, String Jenis, int Stock){ //Constructor
        this.id = id;
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Stock = Stock;
    }
    
    
    public int getid(){ // method
        return id;
    }
    public String getNama(){ // method
        return Nama;
    }
    public String getJenis(){ // method
        return Jenis;
    }
    public int getStock(){ // method
        return Stock;
    }
    
    public void setid (int id){
        this.id = id ;
    }
    
    public void setNama (String Nama){
        this.Nama = Nama;
    }
    
    public void setJenis (String Jenis){
        this.Jenis = Jenis;
    }
    
    public void setStock (int Stock){
        this.Stock = Stock;
    }
   
    @Override
    public String toString(){ // method print
        return "\t\t"+id+"\t"+Nama+"\t"+Jenis+"\t\t"+Stock;
    }
    
}
