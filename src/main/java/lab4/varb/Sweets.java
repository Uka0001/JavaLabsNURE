package lab4.varb;

public class Sweets {
    private String name;
    private double weight;
    private SugarLevel sugarLevel;

    public Sweets() {
    }

    public Sweets(String name, double weight, SugarLevel sugarLevel) {
        this.name = name;
        this.weight = weight;
        this.sugarLevel = sugarLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public SugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(SugarLevel sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarLevel=" + sugarLevel +
                '}';
    }
}
