package com.example.proxy;

public class TestProxy {
    public static void main(String args[]){
        CommandExecutor executor = new CommandExecutorProxy("user", "password");
        try {
            executor.runCommand("ls -la");
            executor.runCommand("rm abc.pf");
        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
