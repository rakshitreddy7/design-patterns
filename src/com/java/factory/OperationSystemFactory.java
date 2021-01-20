package com.java.factory;

public class OperationSystemFactory {
    public OperatingSystem getOs(String type) {
        if (type.equals("gaming")) {
            return new WindowsOS();
        } else if(type.equals("sleek")) {
            return new MacOS();
        } else {
            return new LinuxOS();
        }
    }
}
