package com.java.adapter;

public class Main {
    public static void main(String[] args) {
        Assignment assignment = new Assignment();

        Pen pen = new PilotAdaptor();
        assignment.setPen(pen);
        assignment.writeAssignment("This is my assignment..!");
    }
}
