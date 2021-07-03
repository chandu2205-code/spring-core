package com.collectioninjection.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Team {

    private String teamName;
    private List<String> players;
    private Set<String> coachSet;
    private Map<String,Integer> playersJersey;
    private Properties playerSkills;

    public Team(List<String> list) {
        this.players = list;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Set<String> getCoachSet() {
        return coachSet;
    }

    public void setCoachSet(Set<String> coachSet) {
        this.coachSet = coachSet;
    }

    public Map<String, Integer> getPlayersJersey() {
        return playersJersey;
    }

    public void setPlayersJersey(Map<String, Integer> playersJersey) {
        this.playersJersey = playersJersey;
    }

    public Properties getPlayerSkills() {
        return playerSkills;
    }

    public void setPlayerSkills(Properties playerSkills) {
        this.playerSkills = playerSkills;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", players=" + players +
                ", coachSet=" + coachSet +
                ", playersJersey=" + playersJersey +
                ", playerSkills=" + playerSkills +
                '}';
    }

}
