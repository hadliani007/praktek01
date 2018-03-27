/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Hadli
 */
public class ular {
    public static void main(string[] args){
    
    ular tambang = new binatang();
    ular sanca kembang= new binatang();
    ular cobra = new binatang();
    
    tambang.ukuran = "kecil";
    tambang.cara_merayap = "lambat";
    tambang.warna = "kuning";
    tambang.jenis_makanan = "serangga";
    tambang.jenis_bisa= "tidak berbisa";
    
    sanca.ukuran = "besar";
    sanca.cara_merayap ="cepat";
    sanca.warna = "kuning kecoklatan";
    sanca.jenis_makanan = "ikan kecil";
    sanca.jenis_bisa = "sedang";
            
    cobra.ukuran = "sedang";
    cobra.cara_merayap ="cepat";
    cobra.warna = "cokelat";
    cobra.jenis_makanan = "sejenis tikus";
    cobra.jenis_bisa = "mematikan";
    
    ular_tambang.tampildata();
    ular_sanca.tampildata();
    ular_cobra.tampildata();
    }
}