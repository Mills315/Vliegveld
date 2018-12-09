package VliegveldXYZ;

import javax.persistence.Id;
import java.util.*;

public class Vliegveld {


    private String plaats;

    @Id
        private String id;

    public ArrayList<Vliegtuig> vliegtuigen;

    public Vliegveld() {
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public ArrayList<Vliegtuig> getVliegtuigen() {
        return vliegtuigen;
    }

    public void setVliegtuigen(ArrayList<Vliegtuig> vliegtuigen) {
        this.vliegtuigen = vliegtuigen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
