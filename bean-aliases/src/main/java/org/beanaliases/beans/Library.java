package org.beanaliases.beans;

public class Library {

    private String name;
    private String location;
    private String timings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", timings='" + timings + '\'' +
                '}';
    }
}
