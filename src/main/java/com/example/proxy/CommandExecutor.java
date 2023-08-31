package com.example.proxy;

import java.io.IOException;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
