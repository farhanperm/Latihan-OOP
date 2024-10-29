package latihanoop1;

class matakuliah {
    String[] namamatkul = {
        "1. Basis Data Terdistribusi", 
        "2. Jaringan Komputer", 
        "3. Perangkat Berorientasi Objek", 
        "4. Rekayasa Perangkat Lunak", 
        "5. Sistem Operasi", 
        "6. Statistika",
        "7. Teori Bahasa Otomata"
    };
    int[] sks = {2, 3};
    
    static void detailmatkul(String[] matkul, int[] sks, int x, nilai eksekusi_nilai) {
            System.out.println("Mata Kuliah Semester 3 dan Nilai: ");
            for (int i = 0; i < matkul.length; i++) {
                System.out.print(matkul[i] + " (SKS: " + sks[1] + ") = " + eksekusi_nilai.getnilaimatkul(i) + " => Grade: ");
                eksekusi_nilai.gradenilai(eksekusi_nilai.getnilaimatkul(i));
            }
    }
}
