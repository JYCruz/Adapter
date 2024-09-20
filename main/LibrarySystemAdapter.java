public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem(String... args) {
        if (args.length > 1) {
            librarySystem.manageBooks(args[0], args[1]);
        }
    }
}
