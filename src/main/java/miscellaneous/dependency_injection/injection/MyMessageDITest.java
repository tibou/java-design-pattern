package miscellaneous.dependency_injection.injection;
/*
    Dependency Injection in java requires at least the following:

    -Service components should be designed with base class or interface. It’s better to prefer interfaces or abstract classes that would define
    contract for the services.
    -Consumer classes should be written in terms of service interface.
    -Injector classes that will initialize the services and then the consumer classes.


    Benefits of Java Dependency Injection
    Some of the benefits of using Dependency Injection in Java are:

    -Separation of Concerns
    -Boilerplate Code reduction in application classes because all work to initialize dependencies is handled by the injector component
    -Configurable components makes application easily extendable
    -Unit testing is easy with mock objects


    Disadvantages of Java Dependency Injection
    Java Dependency injection has some disadvantages too:

    -If overused, it can lead to maintenance issues because the effect of changes are known at runtime.
    -Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.

 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
