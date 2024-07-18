package model;

public class Voiture extends Véhicule implements Machine{

    private int immatriculation;
    private String model;
    private String type;
    private String moteur;

    public Voiture(int immatriculation, String model, String type, String moteur) {
        super(immatriculation, model, type);
        if(moteur.equals("V12") || moteur.equals("V6")) {
            this.moteur = moteur;
        } else {
            System.out.println("It's not a good type of moteur");
        }
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

    @Override
    public boolean isMachine(Voiture v1) {
        return false;
    }
}
