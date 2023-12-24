package OOP2;

public abstract class WheeledTransport extends Transport {
    private final String modelName;
    private final int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    void service() {

    }
}
