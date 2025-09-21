import java.util.List;

public class Player implements Comparable<Player> {
    private int id;
    private String name;
    private String role; // e.g., Batsman, Bowler, All-Rounder
    private String team;
    private double battingAverage;
    private List<Stats> stats;

    public Player(int id, String name, String role, String team, double battingAverage, List<Stats> stats) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.team = team;
        this.battingAverage = battingAverage;
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", team='" + team + '\'' +
                ", battingAverage=" + battingAverage +
                ", stats=" + stats +
                '}';
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    @Override
    public int compareTo(Player o) {
        return 0;
    }
}
