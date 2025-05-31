package uap.bases;

import uap.interfaces.*;

public abstract class Shape implements MassCalculable, MassConvertible, Printable{
    protected static final double PI = 22.0 / 7.0;
    protected static final double DENSITY_STAINLESS_STEEL = 8.0; // dalam g/cm³
    protected static final double KETEBALAN = 0.5; // dalam cm
    protected static final int BIAYA_KIRIM_PER_KG = 15000; // dalam rupiah 
    protected double radius;
    
    public Shape(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double hitungMassa() {
        return hitungVolume() * DENSITY_STAINLESS_STEEL;
    }
    
    @Override
    public double konversiKeKg() {
        return hitungMassa() / 1000.0;
    }
    
    @Override
    public String hitungBiayaKirim() {
        double massaKg = konversiKeKg();
        int massaBulat = (int) Math.ceil(massaKg);
        int totalBiaya = massaBulat * BIAYA_KIRIM_PER_KG;
        return String.format("Rp%,7d", totalBiaya);
    }
    
    @Override
    public void printInfo() {
        System.out.println("Volume : " + String.format("%.2f", hitungVolume()) + " cm³");
        System.out.println("Luas permukaan : " + String.format("%.2f", hitungLuasPermukaan()) + " cm²");
        System.out.println("Massa : " + String.format("%.2f", hitungMassa()) + " gr");
        System.out.println("Massa dalam kg : " + String.format("%.3f", konversiKeKg()) + " kg");
        System.out.println("Biaya kirim : " + hitungBiayaKirim());
    }
    
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
}