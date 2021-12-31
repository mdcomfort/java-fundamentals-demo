public class Droid {

    private String serialNumber;
    private String modelType;
    private String purpose;

    public Droid(String serialNumber, String modelType, String purpose) {
        this.serialNumber = serialNumber;
        this.modelType = modelType;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "serialNumber='" + serialNumber + '\'' +
                ", modelType='" + modelType + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModelType() {
        return modelType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void speak() {
        System.out.println("Well hello!");
    }

    public static void main(String[] args) {

        Droid r2 = new Droid("R2D2", "Astromech", "Starship repair/support");
        System.out.println(r2);
        r2.speak();

    }
}
