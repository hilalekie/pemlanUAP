package uap.models;

import uap.bases.Shape;

public class Torus extends Shape {
    private double radiusKecil;
    
    public Torus(double radiusBesar, double radiusKecil) {
        super(radiusBesar);
        this.radiusKecil = radiusKecil;
    }
    
    @Override
    public double hitungVolume() {
        double volumeLuar = (4.0/3.0) * PI * Math.pow(radius, 3);
        double volumeDalam = (4.0/3.0) * PI * Math.pow(radiusKecil, 3);
        double volumeDonat = volumeLuar - volumeDalam;
        double volumeMaterial = 2 * PI * PI * radius * Math.pow(radiusKecil, 2);
        return volumeMaterial * KETEBALAN;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 4 * PI * PI * radius * radiusKecil;
    }
}

