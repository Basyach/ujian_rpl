/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

public class DataMahasiswa {
    private String nomor;
    private String nama;
    private String kamar;
    private boolean jenkel;

    public DataMahasiswa(String nomor, String nama, String kamar, boolean jenkel){
        this.nomor = nomor;
        this.nama = nama;
        this.kamar = kamar;
        this.jenkel = jenkel;
    }
    
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public boolean isJenkel() {
        return jenkel;
    }

    public void setJenkel(boolean jenkel) {
        this.jenkel = jenkel;
    }
}







