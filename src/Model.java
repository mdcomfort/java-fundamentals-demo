public class Model {
    private String type;
    private String purpose;

    public Model(String type, String purpose) {
        this.type = type;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Model{" +
                "type='" + type + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
