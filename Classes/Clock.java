public class Clock {
    int hours; 
    int minutes;
    int seconds; 

    Clock(){
        this.hours = 12; 
        this.minutes = 0; 
        this.seconds = 0; 
    }

    Clock(int hours, int minutes, int seconds){
        this.hours = hours; 
        this.minutes = minutes; 
        this.seconds = seconds; 
    }

    Clock(int seconds){
        this.hours = seconds/3600;
        this.minutes = (seconds - this.hours*3600)/60; 
        this.seconds = (seconds - this.hours*3600 - this.minutes*60); 
    }

    public void setClock(int seconds){
        this.hours = seconds/3600;
        this.minutes = (seconds - this.hours*3600)/60; 
        this.seconds = (seconds - this.hours*3600 - this.minutes*60); 
    }

    public void setHours(int hours){
        this.hours = hours; 
    }

    public void setMinutes(int minutes){
        this.minutes = minutes; 
    }

    public void setSeconds(int seconds){
        this.seconds = seconds; 
    }

    public int getHours(){
        return this.hours; 
    }

    public int getMinutes(){
        return this.minutes; 
    }

    public int getSeconds(){
        return this.seconds; 
    }

    public void tik(){
        this.seconds += 1; 
    }

    public void addClock(Clock c){
        this.hours += c.hours; 
        this.minutes += c.minutes; 
        this.seconds += c.seconds; 
    }

    public String toString(){
        return "(" + String.format("%02d",this.hours) + 
            ":" + String.format("%02d",this.minutes) + 
            ":" + String.format("%02d",this.seconds) + ")"; 
    }

    public void tikDown(){
        this.seconds -= 1; 
    }

    public Clock subtractClock(Clock c){
        return new Clock(this.hours-c.getHours(), this.minutes-c.getMinutes(), this.seconds-c.getSeconds()); 
    }
}
