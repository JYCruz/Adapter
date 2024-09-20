public class Main {
   public static void main(String[] args) {
       
       AttendanceSystem attendanceSystem = new AttendanceSystem();
       GradingSystem gradingSystem = new GradingSystem();
       LibrarySystem librarySystem = new LibrarySystem();

      
       SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
       SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
       SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

       
       attendanceAdapter.integrateSystem("22724");
       gradingAdapter.integrateSystem("13139", "A");
       libraryAdapter.integrateSystem("Book_12", "add");
   }
}
