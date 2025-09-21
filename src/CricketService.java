import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CricketService {
public static void main(String args[]) {
    List<Player> players = new ArrayList<>();
    List<Stats> stats = new ArrayList<>(List.of(
            new Stats(1, 50, 90, 60)
    ));
    players.add(new Player(1, "Virat Kohli", "Batsman", "India", 57.68, stats));
    players.add(new Player(2, "Steve Smith", "Batsman", "Australia", 61.37, stats));
    players.add(new Player(3, "Ben Stokes", "All-Rounder", "England", 35.24, stats));
    players.add(new Player(4, "Jasprit Bumrah", "Bowler", "India", 12.5, stats));
    players.add(new Player(5, "Kane Williamson", "Batsman", "New Zealand", 53.83, stats));
    players.add(new Player(6, "Rashid Khan", "Bowler", "Afghanistan", 19.2, stats));
    players.add(new Player(7, "David Warner", "Batsman", "Australia", 45.2, stats));
    players.add(new Player(8, "Joe Root", "Batsman", "England", 51.23, stats));
    players.add(new Player(9, "Trent Boult", "Bowler", "New Zealand", 10.4, stats));
    players.add(new Player(10, "Quinton de Kock", "Batsman", "South Africa", 44.74, stats));
    players.add(new Player(11, "Andre Russell", "All-Rounder", "West Indies", 27.5, stats));
    players.add(new Player(12, "Shaheen Afridi", "Bowler", "Pakistan", 14.7, stats));
    players.add(new Player(13, "Babar Azam", "Batsman", "Pakistan", 59.22, stats));
    players.add(new Player(14, "Shakib Al Hasan", "All-Rounder", "Bangladesh", 37.65, stats));
    players.add(new Player(15, "Chris Gayle", "Batsman", "West Indies", 39.72, stats));
    players.add(new Player(16, "Marnus Labuschagne", "Batsman", "Australia", 55.44, stats));
    players.add(new Player(17, "Pat Cummins", "Bowler", "Australia", 15.3, stats));
    players.add(new Player(18, "Mitchell Starc", "Bowler", "Australia", 15.3, stats));
    players.add(new Player(19, "Rohit Sharma", "Batsman", "India", 48.58, stats));
    players.add(new Player(20, "Lasith Malinga", "Bowler", "Sri Lanka", 11.3, stats));

    // Stream API operations
    //forEach
    //players.stream().forEach(p-> System.out.println(p.getName()));
    //players.stream().forEach(System.out::println);

    //filter && collect
    List<Player> filterPlayers = players.stream().filter(p-> p.getTeam().equals("India") && p.getBattingAverage() > 50).collect(Collectors.toList());
    Map<Integer, String> batsmenAboveFifty = players.stream().filter(p-> p.getTeam().equals("India") && p.getBattingAverage() > 50).collect(Collectors.toMap(Player::getId,Player::getName));


    //map && distinct
    List<String> batsmenNameAboveFifty = players.stream().filter(p->p.getBattingAverage() > 50 && p.getTeam().equals("India")).map(Player::getName).collect(Collectors.toList());
    Set<Double> battingAverage = players.stream().map(Player::getBattingAverage).collect(Collectors.toSet());
    List<Double> battingAverageDistinct = players.stream().map(Player::getBattingAverage).collect(Collectors.toList());


    //flatMap
    List<Stream<Integer>> getT20Stats= players.stream().map(p->p.getStats().stream().map(Stats::getT20)).collect(Collectors.toList());

    List<Integer> getT20Stats1 = players.stream()
            .flatMap(p->p.getStats().stream())
            .map(Stats::getT20)
            .distinct()
            .collect(Collectors.toList());

    // sorted asc
    List<String> sortByAverage = players.stream().sorted(Comparator.comparing(Player::getBattingAverage)).map(Player::getName).collect(Collectors.toList());
    // desc
    List<String> sortByAverageDesc = players.stream().sorted(Collections.reverseOrder(Comparator.comparing(Player::getBattingAverage))).map(Player::getName).collect(Collectors.toList());

    // limit
    List<String> TopBatsmen = players.stream()
            .sorted(Collections.reverseOrder(Comparator.comparing(Player::getBattingAverage)))
            .map(Player::getName)
            .limit(3)
            .collect(Collectors.toList());

    // skip
    List<String> skipTopBatsmen = players.stream()
            .sorted(Collections.reverseOrder(Comparator.comparing(Player::getBattingAverage)))
            .map(Player::getName)
            .skip(2)
            .collect(Collectors.toList());

    // Max and Min
    Optional<Player> maxAverageBatsmen= players.stream().max(Comparator.comparing(Player::getBattingAverage));
    Optional<Player> minAverageBatsmen= players.stream().min(Comparator.comparing(Player::getBattingAverage));


    //groupingby && mapping
    Map<String, List<Player>> groupbyTeam = players.stream().collect(Collectors.groupingBy(Player::getTeam));

    Map<String, List<String>> groupbyName = players.stream().collect(Collectors.groupingBy(Player::getTeam, Collectors.mapping(Player::getName, Collectors.toList())));

    // count
    Map<String, Long> countbyCountry = players.stream().collect(Collectors.groupingBy(Player::getTeam, Collectors.counting()));


    // findfirst
    Optional<Player> findFirstByTeam = players.stream().filter(p->p.getTeam().equals("India")).findFirst();
    //findFirstByTeam.ifPresent(System.out::print);



    // anyMatch, allMatch, noneMatch
    boolean isScotLand = players.stream().anyMatch(p -> p.getTeam().equals("ScotLand"));
    boolean isBatsmen = players.stream().allMatch(p -> p.getRole().equals("Batsmen"));
    boolean isNotScotland = players.stream().noneMatch(p -> p.getTeam().equals("Scotland"));



    System.out.print(groupbyName);

}
}
