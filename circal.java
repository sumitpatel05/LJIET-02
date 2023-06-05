package day1;

import java.util.Scanner;

class Circle{
    static final float PI=3.14f;
    static Scanner sc= new Scanner(System.in);
    float rad,area,circumference;

    public void setData(){
        System.out.println("Enter the radius: ");
        this.rad= sc.nextFloat();
        this.area=PI*this.rad*this.rad;
        this.circumference=2*PI*this.rad;
    }

    public void getData(){
        System.out.println("This is radius: "+this.rad);
        System.out.println("This is area: "+this.area);
        System.out.println("This is circumfrences: "+this.circumference);
    }
}