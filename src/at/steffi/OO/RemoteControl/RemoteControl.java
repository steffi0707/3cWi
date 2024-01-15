package at.steffi.OO.RemoteControl;

import at.steffi.OO.Wheel;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {


    private final List<Battery> batteries = new ArrayList<>();
    public void addBattery(Battery battery){
        this.batteries.add(battery);

    }

    public int getStatus(){
        int sum = 0;
        for (Battery battery : this.batteries){
            sum += battery.getStatus();
        }
        return sum/this.batteries.size();

    }

    public void turnOn(){
        for (Battery battery : this.batteries){
            battery.turnOn();
        }
    }

    public void turnOff(){
        for (Battery battery : this.batteries){
            battery.turnOff();
        }
    }


}
