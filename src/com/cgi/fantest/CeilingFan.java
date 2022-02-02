package com.cgi.fantest;

public class CeilingFan implements Control{
    private int maxSpeed;
    private boolean isIncreased;
    private int currentSpeed;

    public CeilingFan(){
        this.maxSpeed = 3;
        this.isIncreased = true;
        this.currentSpeed = 0;
    }

    public CeilingFan(int maxSpeed, boolean isIncreased, int currentSpeed){
        this.maxSpeed = maxSpeed;
        this.isIncreased = isIncreased;
        this.currentSpeed = currentSpeed;
    }

    public void changeSpeed(){
        if (isIncreased)
            increaseSpeed();
        else
            decreaseSpeed();
    }

    public void changeDirection(){
        if (isIncreased)
            isIncreased = false;
        else
            isIncreased = true;
    }

    @Override
    public void increaseSpeed() {
        if (currentSpeed < maxSpeed)
            currentSpeed++;
        else
            currentSpeed = 0;
    }

    @Override
    public void decreaseSpeed() {
        if (currentSpeed > 0)
            currentSpeed--;
        else
            currentSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "CeilingFan {" +
                "maxSpeed=" + maxSpeed +
                ", isIncreased=" + isIncreased +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
