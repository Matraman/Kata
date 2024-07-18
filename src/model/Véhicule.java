package model;

public class Véhicule {

    private int immatriculation;
    private String model;
    private String type;

    public Véhicule(int immatriculation, String model, String type) {
        this.immatriculation = immatriculation;
        this.model = model;
        this.type = type;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
