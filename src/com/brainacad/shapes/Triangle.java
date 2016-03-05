package com.brainacad.shapes;

public class Triangle {
    private double a=1.0;
    private double b=1.0;
    private  double c=1.0;

    public void setA(double a) {   this.a = a; }
    public void setB(double b) {  this.b = b;  }
    public void setC(double c) {   this.c = c; }

    public double getA() {     return a;  }
    public double getB() {     return b;  }
    public double getC() {     return c;}

    public static void getArea(Triangle X) {
        double S = (X.getA()+X.getB()+X.getC())/2;
        double A = Math.sqrt( S*(S-X.getA())*(S-X.getB())*(S-X.getC()));
        System.out.println(A);    }

    public  void  Triangle (double a,double b,double c){

        setA(a);setB(b);setC(c);    }    }
