package Iterator;

public class Music {
    private String name;
    private String singer;
    private double duretion;

    public Music(String name, String singer, double duretion) {
        this.name = name;
        this.singer = singer;
        this.duretion = duretion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getDuretion() {
        return duretion;
    }

    public void setDuretion(double duretion) {
        this.duretion = duretion;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", duretion=" + duretion +
                '}';
    }
}
