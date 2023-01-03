/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<DataMahasiswa> ArrayData;
    DefaultTableModel tabelModel;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<DataMahasiswa>();
    }
    
    public void InsertData(String nomor, String nama, String kamar, boolean jenkel){
        DataMahasiswa mhs = new DataMahasiswa(nomor, nama, kamar, jenkel);
        ArrayData.add(mhs);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"NOMOR", "NAMA", "KAMAR", "JENIS KELAMIN"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(DataMahasiswa n : ArrayData){
            String[] arrData = {n.getNomor(), n.getNama(), n.getKamar(), ((n.isJenkel()) ? "Laki-Laki" : "Perempuan")};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            public boolean isCellEdittable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tabelModel;        
    }
    
    public static void main(String[] args) {
    }
}
