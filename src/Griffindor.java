public class Griffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int distance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    private int sum() {
        return courage + honor + nobility;
    }
    public void compare(Griffindor other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if(thisPower > otherPower) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Griffindor. " + super.toString() +
                " nobility= " + nobility +
                ", honor= " + honor +
                ", courage= " + courage;
    }
}
