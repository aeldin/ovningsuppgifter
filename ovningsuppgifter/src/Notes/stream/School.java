package Notes.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class School {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Olle", "Ollesson", "olle@gmail.com", 58, List.of(new Course("Java", 60))));
        students.add(new Student("Pelle", "Pellesson", "Pelle@gmail.com", 51, List.of(new Course("Web", 70))));
        students.add(new Student("Ture", "Turesson", "ture@gmail.com", 28, List.of(new Course("Math", 50), new Course("Java", 60))));
        students.add(new Student("Jerker", "Jerkersson", "jerker@gmail.com", 35, List.of(new Course("SQL", 30))));
        students.add(new Student("Alvin", "Alvinsson", "alvin@gmail.com", 70, List.of(new Course("Gympa", 10))));
        students.add(new Student("Klara", "Klarasson", "klara@gmail.com", 73, List.of(new Course("Database", 50))));
        students.add(new Student("Ingrid", "Ingridsson", "ingrid@gmail.com", 20, List.of(new Course("Potions", 80))));
        students.add(new Student("Fredrika", "Fredrikasson", "fredrika@gmail.com", 45, List.of(new Course("Spells", 40))));
        students.add(new Student("Frans", "Fransson", "frans@gmail.com", 10, List.of(new Course("Gardening", 5))));
        students.add(new Student("Frasse", "Fransson", "frans@gmail.com", 10, List.of(new Course("Gardening", 5))));

        //How mny students have more than 10 credits
        System.out.println(students.stream()
                .filter(student -> student.credits() > 30)
                .count());

        System.out.println(" ");

        //How many total credits for students
        int totalCredits = students.stream()
                .mapToInt(Student::credits)
                .sum();
        System.out.println(totalCredits);

        System.out.println(" ");

        //Get an unmodifiable list of student mail addresses
        List<String> emails = students.stream()
                .map(Student::email)
                .toList();
        System.out.println(" ");
        emails.forEach(System.out::println);

        //Get a not guarantied modifiable list of student mail addresses
        List<String> modifiableEmailList = students.stream()
                .map(Student::email)
                .collect(Collectors.toList());

        modifiableEmailList.add("hej@hej.com");

        System.out.println(" ");

        modifiableEmailList.forEach(System.out::println);

        //Get a set/list of unique email addresses
        Set<String> modifiableEmailSet = students.stream()
                .map(Student::email)
                .collect(Collectors.toSet());
        System.out.println(" ");
        modifiableEmailSet.forEach(System.out::println);

        //Get a list of students full names in alphabetical order. .sorted kräver att listan har ett slut
        List<String> fullNames = students.stream()
                .map(student -> student.firstName() + " " + student.lastName())
                .sorted()
                .toList();

        System.out.println(" ");

        fullNames.forEach(System.out::println);

        System.out.println(" ");

        students.stream()
                .map(StudentNameAndEmail::of)
                .forEach(System.out::println);

        System.out.println(" ");

        //Which students are enrolled on more than one course
        students.stream()
                .filter(student -> student.courseList().size() > 1)
                .forEach(System.out::println);

        System.out.println(" ");

        //Which course names are the students taking - flatMap gör om streams av listor till individuella objekt
        students.stream()
                .map(Student::courseList)
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);

        System.out.println(" ");

        //Same as last but as a set
        students.stream()
                .map(Student::courseList)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println(" ");

        //How many students are enrolled in a specific course (Courses with a shared name)
        var javaStudents = students.stream()
                .filter(student -> student.courseList().stream().anyMatch(course -> course.name().equals("Java")))
                .count();
        System.out.println(javaStudents);


    }
}

record StudentNameAndEmail(String fullName, String email) {


    public static StudentNameAndEmail of(Student student) {
        return new StudentNameAndEmail(
                student.firstName() + " " + student.lastName(),
                student.email());
    }
}
