package principle.demeter;

public class MainTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNumber(new TeamLeader());
    }
}
