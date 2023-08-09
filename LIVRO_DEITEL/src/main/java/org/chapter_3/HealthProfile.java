package org.chapter_3;

public class HealthProfile extends HeartRates {

    private double height;
    private double weight;

    public HealthProfile(String name, String lastName, Date date, double height, double weight) {
        super(name, lastName, date);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HealthProfile{" +
                "nome='" + getNome() + '\'' + "\n" +
                ", sobrenome='" + getSobrenome() + '\'' + "\n" +
                ", dateOfBirth=" + getDateOfBirth().toString() + "\n" +
                ", maxHeartRate=" + calculateMaxHeartRate() + "\n" +
                ", TargetHeartRate=" + calculateTargetHeartRateInterval() + "\n" +
                "height=" + height +
                ", weight=" + weight +
                ", weight=" + weight +
                ", IMC=" + calculateIMC() +
                '}';
    }

    public void generateTableIMC() {
        System.out.println("BMI\t\tClassification");
        System.out.println("------------------------");
        System.out.println("Less than 16.0\tSevere Thinness");
        System.out.println("16.0 - 16.9\tModerate Thinness");
        System.out.println("17.0 - 18.4\tMild Thinness");
        System.out.println("18.5 - 24.9\tNormal Weight");
        System.out.println("25.0 - 29.9\tOverweight");
        System.out.println("30.0 - 34.9\tObesity Class I");
        System.out.println("35.0 - 39.9\tObesity Class II");
        System.out.println("40.0 or more\tObesity Class III");
    }

    public double calculateIMC() {
        return weight / Math.pow(height, 2d);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
