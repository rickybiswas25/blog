package staticdescriptopn;

public class Start {

    public static void main(String[] args) {
        //nested class example
        Book book = new Book();
        //Book.Page page = new Book.Page();// cannot create the object of nested class
        book.addPages(1);
        //static class example
        Building building = new Building();
        building.addRoom(new Building.Room("Room 214"));
    }
}
