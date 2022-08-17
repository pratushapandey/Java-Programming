import java.lang.*;
import java.util.*;

class AverageMarksForEachLoop {
    public static void main(String[] args){
        float [] marks = {85.5f, 78.6f, 90.0f, 56.8f, 77.9f};
        float sum = 0;
        for(float mark : marks){
            sum += mark;
        }
        System.out.println("SUm of marks obtained is: " + sum);
        System.out.println("Average of marks obtained is: " + sum/marks.length);
    }
}
