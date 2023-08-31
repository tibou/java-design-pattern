package miscellaneous.dependency_injection.legacy;

/*
    certain limitations.

-MyApplication class is responsible to initialize the email service and then use it. This leads to hard-coded dependency. If we want to switch to some other
advanced email service in the future, it will require code changes in MyApplication class. This makes our application hard to extend and if email service is
used in multiple classes then that would be even harder.
-If we want to extend our application to provide an additional messaging feature, such as SMS or Facebook message then we would need to write another
application for that. This will involve code changes in application classes and in client classes too.
-Testing the application will be very difficult since our application is directly creating the email service instance. There is no way we can mock these
objects in our test classes.

One can argue that we can remove the email service instance creation from MyApplication class by having a constructor that requires email service as an argument.

But in this case, we are asking client applications or test classes to initializing the email service that is not a good design decision. Now let’s see how
we can apply java dependency injection pattern to solve all the problems with the above implementation.
 */
public class MyLegacyTest {
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Hi Pankaj", "pankaj@abc.com");
    }
}
