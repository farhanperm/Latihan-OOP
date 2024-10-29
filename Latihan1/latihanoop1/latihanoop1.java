package latihanoop1;
import java.util.Scanner;
public class latihanoop1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nilai eksekusi_nilai = new nilai();
        mahasiswa eksekusi_mahasiswa = new mahasiswa();
        
        System.out.println("DATA MAHASISWA");
        eksekusi_mahasiswa.datadiri();
        System.out.println("\n");
        
        
        System.out.println("PENGINPUTAN NILAI");
        System.out.println("Basis Data Terdistribusi = ");
        eksekusi_nilai.setnilaimatkul(0, input.nextInt());
        
        System.out.println("Jaringan Komputer = ");
        eksekusi_nilai.setnilaimatkul(1, input.nextInt());  
        
        System.out.println("Perangkat Berorientasi Objek = ");
        eksekusi_nilai.setnilaimatkul(2, input.nextInt()); 
        
        System.out.println("Rekayasa Perangkat Lunak = ");
        eksekusi_nilai.setnilaimatkul(3, input.nextInt()); 
        
        System.out.println("Sistem Operasi = ");
        eksekusi_nilai.setnilaimatkul(4, input.nextInt()); 
        
        System.out.println("Statistika = ");
        eksekusi_nilai.setnilaimatkul(5, input.nextInt()); 
        
        System.out.println("Teori Bahasa Otomata = ");
        eksekusi_nilai.setnilaimatkul(6, input.nextInt());  
        
        System.out.println("\nMATAKULIAH DAN NILAI");
        matakuliah eksekusi_matkul = new matakuliah();
        matakuliah.detailmatkul(eksekusi_matkul.namamatkul, eksekusi_matkul.sks, eksekusi_mahasiswa.semester, eksekusi_nilai);
        System.out.println("\nNILAI AKHIR");
        System.out.println("Nilai Rata-rata = " + eksekusi_nilai.ratanilai());
        System.out.print("Grade = " );
        nilai.gradenilai(eksekusi_nilai.ratanilai());
    }
}

