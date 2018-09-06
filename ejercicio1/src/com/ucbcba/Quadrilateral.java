package com.ucbcba;

import static sun.misc.Version.println;

public abstract class  Quadrilateral implements Figure {
    //protected int length;//longuitud;
    protected int width;//ancho
    protected int height;// altura
    protected int hei;// altura
    Quadrilateral(int width){
        this.width = width;
        this.height = width;

    }
    Quadrilateral(int width, int height){
        this.width = width;
        this.height = height;

    }

    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimenter() {
        return 2*width + 2*height;
    }

    @Override
    public void draw() {
        //TODO implementar draw de square
        for(int i=0;i<height;i++) {
            for (int j=0;j<width;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
