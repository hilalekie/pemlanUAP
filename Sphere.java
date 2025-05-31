package uap.models;

import uap.bases.Shape;

public class Sphere extends Shape {
    
    public Sphere(double radius) {
        super(radius);
    }
    
    @Override
    public double hitungVolume() {
        double volumeLuar = (4.0/3.0) * PI * Math.pow(radius, 3);
        double radiusDalam = radius - KETEBALAN;
        double volumeDalam = (4.0/3.0) * PI * Math.pow(radiusDalam, 3);
        return volumeLuar - volumeDalam;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 4 * PI * Math.pow(radius, 2);
    }
}
