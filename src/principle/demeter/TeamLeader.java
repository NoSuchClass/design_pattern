package principle.demeter;

import java.util.List;

public class TeamLeader {
    public void checkNumber(List<Course> courseList) {
        System.out.println(courseList.size());
    }
}
