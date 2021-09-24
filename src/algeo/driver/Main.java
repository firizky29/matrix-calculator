package algeo.driver;
// disini isi input/output (semacam drivernya mungkin?) matriksnya (determinan dkk, kalau mau bikin class lgi sabi)
import algeo.adt.Matriks;
import algeo.lib.GaussSPL;
import algeo.lib.JordanSPL;
import algeo.lib.OBE;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Wow bisa!");
//        Matriks m,m3;
//        try{
//            m= new Matriks("D:\\Tubes\\koef3b.txt");
//            m.tulisMatriks1("D:\\Tubes\\out.txt");
//        } catch(FileNotFoundException exception) {
//            System.out.println("File tidak ditemukan");
//        }
//        m3 = new Matriks();
//        m3.tulisMatriks2();
//        GaussSPL m = new GaussSPL();
//        m.process();
//        m.M.tulisMatriks2();

//        JordanSPL n = new JordanSPL();
//        n.process();
//        n.M.tulisMatriks2();
        // Misalkan punya matriks m (dibuat pas awal banget)
        Matriks m = new Matriks();
        // buat nge-Jordan atau nge-Gauss berarti
        OBE childm = new OBE(m);
        childm.GaussProcess();
        childm.M.tulisMatriks2();
    }
}
