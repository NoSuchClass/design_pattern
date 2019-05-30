package principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    // 这儿Boss这个类实际上不需要知道Course这个类的具体情况，可以移动到TeamLeader进行处理
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumber(courseList);
    }
}
