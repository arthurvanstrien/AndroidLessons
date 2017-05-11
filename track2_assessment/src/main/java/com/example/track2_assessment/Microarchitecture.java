package com.example.track2_assessment;

import java.io.Serializable;

/**
 * Created by Arthur on 3-5-2017.
 */

public class Microarchitecture implements Serializable{

    private String processor;
    private double clockMhz;
    private String socket;
    private int nr_cores;
    private String brand;

    public Microarchitecture(String processor, double clockMhz, String socket, int nr_cores, String brand) {
        this.processor = processor;
        this.clockMhz = clockMhz;
        this.socket = socket;
        this.nr_cores = nr_cores;
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public double getClockMhz() {
        return clockMhz;
    }

    public String getSocket() {
        return socket;
    }

    public int getNr_cores() {
        return nr_cores;
    }

    public String getBrand() {
        return brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setClockMhz(double clockMhz) {
        this.clockMhz = clockMhz;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void setNr_cores(int nr_cores) {
        this.nr_cores = nr_cores;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Microarchitecture{" +
                "processor='" + processor + '\'' +
                ", clockMhz=" + clockMhz +
                ", socket='" + socket + '\'' +
                ", nr_cores=" + nr_cores +
                ", brand='" + brand + '\'' +
                '}';
    }
}
