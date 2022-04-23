package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    public int a;
    private int b;
    private int hasil;

    public Perhitungan(int a, int b, int hasil) {
        this.a = a;
        this.b = b;
        this.hasil = hasil;
        this.printJudulClass("Judul dalam class Perhitungan ");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }

    public void PrintJudul() {
        System.out.println("Judul Dalam Interfaces");
    }

    public void HitungTambah() {
        this.hasil = this.a + this.b;
    }

    public void HitungKali() {
        this.hasil = this.a * this.b;
    }

    public int hsltmbh(int a1, int b2) {
        this.a = a1;
        this.b = b2;
        this.HitungTambah();
        return this.hasil;
    }

    public int hslkli(int _a, int _b) {
        this.a = _a;
        this.b = _b;
        this.HitungKali();
        return this.hasil;
    }
}