package lego.v6;

public class LegoSet implements Comparable<LegoSet>{
    private final String code;
    private final String name;
    private final String theme;
    private final int bricks;

    public LegoSet(String line) {
        String[] tokens = line.split(";");
        code = tokens[0];
        name = tokens[1];
        theme = tokens[2];
        bricks = Integer.parseInt(tokens[3]);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public int getBricks() {
        return bricks;
    }

    @Override
    public String toString() {
        return "LegoSet{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", bricks=" + bricks +
                '}';
    }

    @Override
    public int compareTo(LegoSet o) {
        return this.name.compareTo(o.name);
    }
}



