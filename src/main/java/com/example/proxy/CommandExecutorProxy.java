package com.example.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if (user.equals("user") && password.equals("admin")) {
            this.isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }


    @Override
    public void runCommand(String cmd) throws Exception {
        if (this.isAdmin) {
            executor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else {
                executor.runCommand(cmd);
            }
        }
    }
}
