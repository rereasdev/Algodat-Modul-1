package algomod1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {  
        String nama, jabatan;
        float lama;
        Scanner scan = new Scanner(System.in);
        Gaji staff = new Gaji();
        try{
            System.out.println("Masukkan Nama Pegawai!");
            nama = scan.nextLine();
            System.out.println("Masukkan Jabatan Pegawai!(KARYAWAN/ MANAGER/ SUPERVISOR");
            jabatan = scan.next().toLowerCase();
            System.out.println("Masukkan Lama Kerja Pegawai!");
            lama = scan.nextFloat();
            staff.gaji(nama, jabatan, lama);
        } catch(java.util.InputMismatchException a){
            System.err.println("INPUTAN SALAH, LAMA KERJA HARUS ANGKA!");
        }
    }
}
