import java.lang.*;
import java.util.*;

class Complex{
    int real ;
    int imaginary;
    Complex(){
    }

    Complex(int tempReal, int tempImaginary){
        real = tempReal;
        imaginary  = tempImaginary;
    }

    Complex addComp(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    Complex subComp(Complex c1, Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }
    public void printComplexNumber(){
        System.out.println("Complex number is : " + real + " + " + imaginary + "i");
    }
}
class ComplexNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the imaginary part: ");
        int b1 = sc.nextInt();
        Complex com1 = new Complex(a1,b1);
        com1.printComplexNumber();
        System.out.println("Enter the real part: ");
        int a2 = sc.nextInt();
        System.out.println("Enter the imaginary part: ");
        int b2 = sc.nextInt();
        Complex com2 = new Complex(a2,b2);
        com2.printComplexNumber();
        Complex com3 = new Complex();
        com3 = com3.addComp(com1,com2);
        System.out.println("Additon is : ");
        com3.printComplexNumber();
        com3 = com3.subComp(com1,com2);
        System.out.println("Difference is : ");
        com3.printComplexNumber();
        sc.close();
    }
}
