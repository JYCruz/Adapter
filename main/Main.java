public class Main{
    public static void main(String args[]){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        AttendanceSystemAdapter attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        GradingSystemAdapter GradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        LibrarySystemAdapter librarySystemAdapter = new LibrarySystemAdapter(librarySystem);
        
        AttendanceSystemAdapter.integrateSystem();
        GradingSystemAdapter.integrateSystem();
        LibrarySystemAdapter.integrateSystem();
    }
}
