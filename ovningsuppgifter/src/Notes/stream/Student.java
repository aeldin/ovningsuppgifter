package Notes.stream;

import java.util.List;

public record Student(String firstName, String lastName, String email, int credits, List<Course> courseList) {

}
