public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem(String... args) {
        if (args.length > 1) {
            gradingSystem.recordGrades(args[0], args[1]);
        }
    }
}
