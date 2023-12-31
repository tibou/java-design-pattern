package com.example.command;

/*
    Behavioral Design Pattern

    Command design pattern is used to implement loose coupling in a request-response model.
    
    In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to
    the appropriate method of Receiver to perform the specific action. The client program create the receiver object and then attach it to the Command.
    Then it creates the invoker object and attach the command object to perform an action. Now when client program executes the action, it’s processed
    based on the command and receiver object.

    We will look at a real life scenario where we can implement Command pattern. Let’s say we want to provide a File System utility with methods to open,
    write and close file. This file system utility should support multiple operating systems such as Windows and Unix. To implement our File System
    utility, first of all we need to create the receiver classes that will actually do all the work.

    Command Pattern Important Points
    - Command is the core of command design pattern that defines the contract for implementation.
    - Receiver implementation is separate from command implementation.
    - Command implementation classes chose the method to invoke on receiver object, for every method in receiver there will be a command implementation.
        It works as a bridge between receiver and action methods.
    - Invoker class just forward the request from client to the command object.
    - Client is responsible to instantiate appropriate command and receiver implementation and then associate them together.
    - Client is also responsible for instantiating invoker object and associating command object with it and execute the action method.
    - Command design pattern is easily extendible, we can add new action methods in receivers and create new Command implementations without changing
        the client code.
    - The drawback with Command design pattern is that the code gets huge and confusing with high number of action methods and because of so many
        associations.

    Command Design Pattern JDK Example
    - Runnable interface (java.lang.Runnable) and Swing Action (javax.swing.Action) uses command pattern.
 */

public class TestCommand {

    public static void main(String[] args){
        //Creating the receiver object
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        Command command = new OpenFileCommand(fileSystemReceiver);
        FileInvoker invoker = new FileInvoker(command);

        //perform action on invoker object
        invoker.execute();

        command = new WriteFileCommand(fileSystemReceiver);
        invoker = new FileInvoker(command);
        invoker.execute();

        command = new CloseFileCommand(fileSystemReceiver);
        invoker = new FileInvoker(command);
        invoker.execute();
    }
}
