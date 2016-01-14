package com.sdp.helloworld.basic;

/**
 * Created by Basil on 14/01/2016.
 */
public class HelloWorldWithCommandLineArguments {

    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello SDP!");
        }

    }

}
