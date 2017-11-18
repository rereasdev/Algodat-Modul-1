package algomod1;

public class Gaji extends Pegawai {
    @Override
    public void gaji(String nama, String jabatan, float lama){
        if(nama.matches("[a-zA-Z]*")){
            if(jabatan.matches("[a-zA-Z]*")){
                switch (jabatan) {
                    case "karyawan":
                        if(lama < 2){
                            gaji = "Rp. 3.000.000";
                        }
                        else if(lama <= 5){
                            gaji = "Rp. 6.000.000";
                        }
                        else if(lama > 5){
                            gaji = "Rp. 12.000.000";
                        }       
                        break;
                    case "supervisor":
                        if(lama < 2){
                            gaji = "Rp. 4.000.000";
                        }
                        else if(lama<= 5){
                            gaji = "Rp. 8.000.000";
                        }
                        else if(lama > 5){
                            gaji = "Rp. 16.000.000";
                        }       
                        break;
                    case "manager":
                        if(lama < 2){
                            gaji = "Rp. 5.000.000";
                        }
                        else if(lama <= 5){
                            gaji = "Rp. 10.000.000";
                        }
                        else if(lama > 5){
                            gaji = "Rp. 20.000.000";
                        }   
                        break;
                    default:
                            gaji = "Rp. 0";
                            jabatan = jabatan+" (tidak ada)";
                        break;
                }
                
                System.out.println("Nama:\t\t"+nama);
                System.out.println("Jabatan:\t"+jabatan);
                System.out.println("Gaji:\t\t"+gaji);
            
            }
            else{
                System.out.println("JABATAN Harus Huruf");
            }
        }
        else{
            System.out.println("NAMA harus Huruf");
        }
    }
}
