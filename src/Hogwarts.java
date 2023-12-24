public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int distance;

    public Hogwarts(String name, int powerOfMagic, int distance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        distance = distance;
    }

    private int sum() {
        return powerOfMagic + distance;
    }
public void compare(Hogwarts other) {
        if(sum() > other.sum()){
            System.out.println(name + " обладает большей мощностью магии, чем" + other.name);
        } else {
            System.out.println(other.name + " обладает большей мощностью магии, чем" + name);
        }
}

    @Override
    public String toString() {
        return name + ": " +
                ", powerOfMagic= " + powerOfMagic +
                ", Distance= " + distance;

    }
}
