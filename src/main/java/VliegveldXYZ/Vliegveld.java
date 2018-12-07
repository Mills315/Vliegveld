package VliegveldXYZ;

import javax.persistence.Id;
import java.util.*;

public class Vliegveld {
    @Id

    private String Plaats;
    public ArrayList<Vliegtuig> vliegtuigen;

    public Vliegveld() {
    }

    public String getPlaats() {
        return Plaats;
    }

    public void setPlaats(String plaats) {
        Plaats = plaats;
    }

    public ArrayList<Vliegtuig> getVliegtuigen() {
        return vliegtuigen;
    }

    public void setVliegtuigen(ArrayList<Vliegtuig> vliegtuigen) {
        this.vliegtuigen = vliegtuigen;
    }
}
