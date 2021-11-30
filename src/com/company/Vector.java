package com.company;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() { return String.format("[x = %f, y = %f, z = %f]",x,y,z); }

    //Длина вектора
    public double length() {
        return Math.sqrt((x * 2) + (y * 2) + (z * 2));
    }

    //Скалярное произведение
    public double scalar(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    //Векторное произведение
    public Vector cross(Vector other) {
        double x = this.y * other.z - this.z * other.y;
        double y = this.z * other.x - this.x * other.z;
        double z = this.x * other.y - this.y * other.x;

        return new Vector(x, y, z);
    }

    //Косинус угла
    public static double cosine(Vector vectorOne, Vector vectorTwo) {
        return vectorOne.scalar(vectorTwo) / (vectorOne.length() * vectorTwo.length());
    }

    //Сумма векторов
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    //Разность векторов
    public Vector sub(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public static Vector[] randomMasVector(int num) {
        Vector[] randomMV = new Vector[num];
        for (int i = 0; i < num; i++) {
            randomMV[i] = new Vector((Math.random() * (25 + 1)), (Math.random() * (25 + 1)), (Math.random() * (25 + 1)));
            System.out.println(randomMV[i].toString());
        }
        return  randomMV;
    }

}
