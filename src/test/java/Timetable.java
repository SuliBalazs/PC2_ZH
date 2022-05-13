import java.util.ArrayList;
import java.util.Scanner;

public class Timetable {
    private static final Scanner scanner = new Scanner(System.in);
    static String newCourse(Timetable timetable){
        ArrayList<Timetable> adatlist = new ArrayList();
        System.out.print("Adja meg a nevét: ");
        String uj =adatlist.add(new Timetable(scanner.NextInt));
        return uj;

    }
    static void getCourses(Timetable timetable){
        ArrayList<Timetable> adatlist = new ArrayList();
        System.out.println(timetable);
        System.out.println(adatlist);
    }
    static void removeCourse(Timetable timetable){
        ArrayList<Timetable> adatlist = new ArrayList();
        int j=0;
        j=scanner.nextInt();
        for (int i=0;i<adatlist.size();i++)
        {
        adatlist.remove(i);
        }
    }
}
