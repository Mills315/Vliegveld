package VliegveldXYZ;

import org.springframework.data.annotation.Id;

public class Vliegtuig {
    @Id

    private String naam;
    private String type;
    private double kerosine;

    public Vliegtuig(String naam, String type) {
        this.naam = naam;
        this.type = type;
        this.kerosine = 5;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKerosine() {
        return kerosine;
    }

    public void setKerosine(double kerosine) {
        this.kerosine = kerosine;
    }
}

