package miscellaneous.dependency_injection.injection;

/*
    Setter injection

    One of the best example of setter dependency injection is Struts2 Servlet API Aware interfaces. Whether to use Constructor based dependency injection
    or setter based is a design decision and depends on your requirements. For example, if my application can’t work at all without the service class then
    I would prefer constructor based DI or else I would go for setter method based DI to use it only when it’s really needed. Dependency Injection in Java
    is a way to achieve Inversion of control (IoC) in our application by moving objects binding from compile time to runtime. We can achieve IoC through
    Factory Pattern, Template Method Design Pattern, Strategy Pattern and Service Locator pattern too. Spring Dependency Injection, Google Guice and
    Java EE CDI frameworks facilitate the process of dependency injection through use of Java Reflection API and java annotations. All we need is to
    annotate the field, constructor or setter method and configure them in configuration xml files or classes.
 */
public class MyDIApplication2 implements Consumer{

    private MessageService service;

    public MyDIApplication2(){}

    //setter dependency injection
    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}