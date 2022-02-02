package com.cgi.fantest;

/*
    The unit has 2 pull cords:
      - One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting.
            §  If the cord is pulled on speed 3, the fan returns to the “off” setting.
      - One reverses the direction of the fan at the current speed setting.
            §  Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
 */
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
