import java.util.*;

public class Student {
    String name;
    Integer course;

    public Student(String name, Integer course)
    {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer course)
    {
        ListIterator<Student> listIter = students.listIterator();
       if(listIter.hasNext()){
          for(Student st : students)
          {
              if(st.course.equals(course)) System.out.println(st.name+" "+st.course );
          }
        }
    }

    public void sortByCourse(List<Student> students)
    {
        Collections.sort(students, new Sortbycourse());
        System.out.println("Sorted by Course: ");
        for(int i=0; i<students.size();i++)
        {
            System.out.println(students.get(i).name+" "+students.get(i).course);
        }
    }
    public void sortByName(List<Student> students)
    {
        Collections.sort(students, new Sortbyname());
        System.out.println("Sorted by Name: ");
        for(int i=0;i<students.size();i++)
        {
            System.out.println(students.get(i).name+" "+students.get(i).course);
        }
    }
}

    class Sortbycourse implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            return a.course - b.course;
        }
    }

    class Sortbyname implements Comparator<Student>
    {
        public int compare(Student o1, Student o2) {
            return o1.name.toString().compareTo(o2.name.toString());
        }
    }
