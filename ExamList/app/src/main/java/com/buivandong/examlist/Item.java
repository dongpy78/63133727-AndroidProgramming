package com.buivandong.examlist;

public class Item {
    String heading;
    String time;
    String gradute;

    public Item(String heading, String time, String gradute) {
        this.heading = heading;
        this.time = time;
        this.gradute = gradute;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGradute() {
        return gradute;
    }

    public void setGradute(String gradute) {
        this.gradute = gradute;
    }
}
