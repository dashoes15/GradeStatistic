import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("AP Statistics", 94);
        grades.put("AP Lit", 94);
        grades.put("Military History", 97);
        grades.put("CCP Programming", 93);


        int min = 101;
        int max = 0;
        double sum = 0;
        double average = 0;
        String lowClass = "";
        String highestClass = "";
        for(String classes: grades.keySet()){
            System.out.printf("\n%-20s%7d", classes, grades.get(classes));
            sum += grades.get(classes);
            average = sum/grades.size();
            //lowest
            if (min > grades.get(classes)) {
                min = grades.get(classes);
                lowClass = classes;
            }
            //highest
            if (max < grades.get(classes)) {
                max = grades.get(classes);
                highestClass = classes;
            }
        }
        System.out.println("\n\nNumber of Classes: " + grades.size());
        System.out.println("\nLowest Grade: " + min);
        System.out.println("Class: " + lowClass);
        System.out.println("\nHighest Grade: " + max);
        System.out.println("Class: " + highestClass);
        System.out.println("\n\nAverage: " + average);
        //lowest
        //int min = 0;
        //for (int i = 0; i < grade.size(); i++) {
            //min = grade.get(0);
            //if(min > grade.get(i)) {
                //min = grade.get(i);
            //}
        //}
        //highest
        System.out.println();
        System.out.println();
        //System.out.println("Number of classes: " + grade.size());
       //System.out.println("Lowest grade: " + min);

    }
}