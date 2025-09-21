public class Stats {
    private int id;
    private int test;
    private int oneDay;
    private int t20;

    public Stats(int id, int test, int oneDay, int t20) {
        this.id = id;
        this.test = test;
        this.oneDay = oneDay;
        this.t20 = t20;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", test=" + test +
                ", oneDay=" + oneDay +
                ", t20=" + t20 +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }


    public int getOneDay() {
        return oneDay;
    }

    public void setOneDay(int oneDay) {
        this.oneDay = oneDay;
    }


    public int getT20() {
        return t20;
    }

    public void setT20(int t20) {
        this.t20 = t20;
    }
}
