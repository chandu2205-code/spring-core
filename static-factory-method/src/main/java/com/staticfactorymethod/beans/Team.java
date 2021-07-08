package com.staticfactorymethod.beans;

import java.util.Calendar;
import java.util.List;

public class Team {
    private String teamName;
    private List<String> participants;
    private String description;
    private String location;
    private Calendar calendar;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", participants=" + participants +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", calendar=" + calendar +
                '}';
    }
}
