package latihan.pertemuan.pkg3;

public class LatihanPertemuan3 {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.infoKendaraan();
        mobil.nyalakanMesin();
        
        System.out.println(); 
        
        SepedaMotor sepedaMotor = new SepedaMotor();
        sepedaMotor.infoKendaraan(); 
        sepedaMotor.nyalakanMesin(); 
    }
    
}
