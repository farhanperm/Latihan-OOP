package latihanoop1;

class nilai {
     private int[] nilaimatkul = new int[7]; 
    
    public void setnilaimatkul(int index, int nilai) {
        if(index >= 0 && index < nilaimatkul.length) {
            nilaimatkul[index] = nilai;
        }
    }
    
    public int getnilaimatkul(int index) {
        if(index >= 0 && index < nilaimatkul.length) {
            return nilaimatkul[index];
        }
        return -1;
    }
    
    static void gradenilai(int nilai) {
        if(nilai >= 85 && nilai <= 100) {
            System.
            out.println("A");
        } else if (nilai >= 80 && nilai <= 84) {
            System.out.println("AB");
        } else if (nilai >= 75 && nilai <= 79) { 
            System.out.println("B");
        } else if (nilai >= 70 && nilai <= 74) { 
            System.out.println("BC");
        } else if (nilai >= 60 && nilai <= 69) { 
            System.out.println("C");
        } else if (nilai >= 41 && nilai <= 59) { 
            System.out.println("D");
        } else if (nilai >= 0 && nilai <= 40) { 
            System.out.println("E");
        } else {
            System.out.println("NILAI KURANG DARI 0 ATAU LEBIH DARI 100");
        }
    }
     
    public int ratanilai(){
        int total = 0;
        for(int i=0;i<nilaimatkul.length;i++){
           total += nilaimatkul[i];
        }
        int rataakhir = total / nilaimatkul.length;
        return rataakhir;
    }
}
