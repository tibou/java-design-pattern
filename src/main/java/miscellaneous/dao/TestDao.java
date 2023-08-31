package miscellaneous.dao;

/*
DAO stands for Data Access Object. DAO Design Pattern is used to separate the data persistence logic in a separate layer. This way, the service remains
completely in dark about how the low-level operations to access the database is done. This is known as the principle of Separation of Logic.

With DAO design pattern, we have following components on which our design depends:

-The model which is transferred from one layer to the other.
-The interfaces which provides a flexible design.
-The interface implementation which is a concrete implementation of the persistence logic.

There are many advantages for using DAO pattern. Let’s state some of them here:

-While changing a persistence mechanism, service layer doesn’t even have to know where the data comes from. For example, if you’re thinking of shifting
    from using MySQL to MongoDB, all changes are needed to be done in the DAO layer only.
-DAO pattern emphasis on the low coupling between different components of an application. So, the View layer have no dependency on DAO layer and only
    Service layer depends on it, even that with the interfaces and not from concrete implementation.
-As the persistence logic is completely separate, it is much easier to write Unit tests for individual components. For example, if you’re using JUnit
    and Mockito for testing frameworks, it will be easy to mock the individual components of your application.
-As we work with interfaces in DAO pattern, it also emphasizes the style of “work with interfaces instead of implementation” which is an excellent
    OOPs style of programming.

https://www.oracle.com/java/technologies/dataaccessobject.html

 */
public class TestDao {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Book book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Book book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}
