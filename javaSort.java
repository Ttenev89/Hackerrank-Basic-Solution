import java.util.*;

public class javaSort {
    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int testCases = Integer.parseInt(scanner.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while (testCases-- > 0) {
                int id = scanner.nextInt();
                String fname = scanner.next();
                double cgpa = scanner.nextDouble();
                Student st = new Student(id, fname, cgpa);
                studentList.add(st);
            }
            scanner.close();

            Collections.sort(studentList, new StudentComparator());
            for (Student st : studentList) {
                System.out.println(st.getFname());
            }
        }
    }

    static class StudentComparator implements Comparator<Student> {
        double epsilon = 0.001; // since we shouldn't use "==" with doubles

        @Override
        public int compare(Student s1, Student s2) {
            if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
                return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
            } else if (!s1.getFname().equals(s2.getFname())) {
                return s1.getFname().compareTo(s2.getFname());
            } else {
                return s1.getId() - s2.getId();
            }
        }
    }
}
