package com.example.track2_practice2;

/**
 * Created by Arthur on 3-5-2017.
 */

public class Microarchitectures
{
    private String name;
    private Double clockSpeed;
    private String socket;
    private int coreCount;

    public Microarchitectures(String name, Double clockSpeed, String socket, int coreCount)
    {
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.socket = socket;
        this.coreCount = coreCount;
    }

    public String getName()
    {
        return name;
    }

    public Double getClockSpeed()
    {
        return clockSpeed;
    }

    public String getSocket()
    {
        return socket;
    }

    public int getCoreCount()
    {
        return coreCount;
    }

    @Override
    public String toString()
    {
        return "Microarchitectures{" +
                "name='" + name + '\'' +
                ", clockSpeed=" + clockSpeed +
                ", socket='" + socket + '\'' +
                ", coreCount=" + coreCount +
                '}';
    }
}
