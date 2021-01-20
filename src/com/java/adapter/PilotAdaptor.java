package com.java.adapter;

public class PilotAdaptor implements Pen {
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
