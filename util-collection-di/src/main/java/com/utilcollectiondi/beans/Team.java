package com.utilcollectiondi.beans;

import java.util.Properties;

public class Team {

    private String teamName;
    private String country;
    private Properties members;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Properties getMembers() {
        return members;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMembers(Properties members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", country='" + country + '\'' +
                ", members=" + members +
                '}';
    }

}
