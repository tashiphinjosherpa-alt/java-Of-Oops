import java.util.Scanner;

class squarer{
 public static void main(String [] arges) {

final double PI=3.14, area;
int  r;

System.out.print("enter the radius of circle");
Scanner ref= new Scanner (System.in);

r=ref.nextInt();

area=pi*r*r;

System.out.println("area of circle = " + area);