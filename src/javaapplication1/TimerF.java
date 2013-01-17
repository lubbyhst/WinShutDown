/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Timer;

/**
 *
 * @author Falk
 */
public class TimerF {
    
    Timer timer;    
    boolean reset;
    int todo;
    int time;
    int progress;

public TimerF(){
    reset = true;
    todo = 1;
    time  = 3600000; // 1h = 360000, 1/2h = 1800000 1s = 1000
}
public void createT(){
    timer = new Timer();    
}
        
public void startTimer(){
if(reset){
    createT();
}    
    timer.schedule(new Task2(), 1000,1000);
    timer.schedule(new Task(getToDo()), getTime());
    
    
}        
public void stopTimer(){
    timer.cancel();
}
public int getToDo(){
    return todo;
}
public void setToDo(int x){
    todo = x;    
}
public void setTime(int x){
    time = x;
}
public int getTime(){
    return time;
}

public int getProgress(){
    return progress;
}
}
