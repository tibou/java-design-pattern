package com.example.iterator;

/*
    Behavioral pattern

    Iterator pattern is used to provide a standard way to traverse through a group of Objects. Iterator pattern is widely used in Java
    Collection Framework. Iterator interface provides methods for traversing through a collection.

    According to GoF, iterator design pattern intent is:
           Provides a way to access the elements of an aggregate object without exposing its underlying represenation.

    Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators based on our requirements.
    Iterator design pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.

    Let’s understand iterator pattern with a simple example. Suppose we have a list of Radio channels and the client program want to traverse
    through them one by one or based on the type of channel. For example some client programs are only interested in English channels and want
    to process only them, they don’t want to process other types of channels. So we can provide a collection of channels to the client and let
    them write the logic to traverse through the channels and decide whether to process them. But this solution has lots of issues such as client
    has to come up with the logic for traversal. We can’t make sure that client logic is correct. Furthermore if the number of client grows then it
    will become very hard to maintain. Here we can use Iterator pattern and provide iteration based on type of channel. We should make sure that
    client program can access the list of channels only through the iterator. The first part of implementation is to define the contract for our
    collection and iterator interfaces.

    Iterator Design Pattern Important Points
    Iterator pattern is useful when you want to provide a standard way to iterate over a collection and hide the implementation logic from client program.
    The logic for iteration is embedded in the collection itself and it helps client program to iterate over them easily.

    Iterator Design Pattern in JDK
    We all know that Collection framework Iterator is the best example of iterator pattern implementation but do you know that java.util.Scanner
    class also Implements Iterator interface. Read this post to learn about Java Scanner Class. That’s all for iterator design pattern,
    I hope it’s helpful and easy to understand.

 */
public class TestIterator {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}
