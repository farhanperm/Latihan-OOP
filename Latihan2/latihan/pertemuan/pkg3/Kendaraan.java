
package latihan.pertemuan.pkg3;

public class Kendaraan {
    public void infoKendaraan() {
        System.out.println("Ini adalah sebuah kendaraan.");
    }
}

class Mobil extends Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin mobil sedang dinyalakan.");
    }
    
    public void infoKendaraan() {
        System.out.println("Ini adalah sebuah mobil.");
    }
}

class SepedaMotor extends Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin sepeda motor sedang dinyalakan.");
    }

    public void infoKendaraan() {
        System.out.println("Ini adalah sebuah sepeda motor.");
    }
}
