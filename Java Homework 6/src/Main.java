import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
       Set <String>set1 = new HashSet<String>();
       Set <String>set2 = new HashSet<String>();

       set1.add("Ukraine");
       set1.add("USA");

       set2.add("England");
       set2.add("Germany");
       set2.add("USA");

        Methods test = new Methods();
        test.union(set1,set2);
        test.intersect(set1,set2);

        //Task 2
        Map<String, String> people = new HashMap<String, String>();
        people.put("Boiko", "Liza");
        people.put("Shevch", "John");
        people.put("Marcon", "Steve");
        people.put("Bondar", "Diana");
        people.put("London", "Vita");
        people.put("Voichar", "Liza");
        people.put("Savchenko", "Vita");
        people.put("Johns", "Ksenia");
        people.put("Lovchenko", "Max");
        people.put("Entinov", "Leo");

        test.output(people);
        test.sameName(people);

        System.out.println("Enter the name of the person you want to remove:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        test.removeName(people, name);

        //Task 3
        ArrayList<Student> studentList = new ArrayList<Student>();
        System.out.println("Enter amount of students you want to add to the list:");
        Integer studentKol = sc.nextInt();
        int num =0;

        while(num<studentKol)
        {
            num++;
            System.out.println("Enter the course of student number "+num+":");
            Integer studCourse = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of student number "+num+":");
            String studName = sc.nextLine();

            Student s = new Student(studName, studCourse);
            studentList.add(s);
            if(num==studentKol){
                System.out.println("Enter the course number to search students: ");
                int searchCourse = sc.nextInt();
                s.printStudents(studentList, searchCourse);
                s.sortByCourse(studentList);
                s.sortByName(studentList);
            }
        }

        sc.close();
    }

}
