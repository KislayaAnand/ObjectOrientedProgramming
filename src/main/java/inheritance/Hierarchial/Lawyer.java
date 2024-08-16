package inheritance.Hierarchial;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lawyer extends Professional{
    private String court;

    public Lawyer(String name, String id, int experience, double salary, String court) {
        super(name,id, experience, salary);
        this.court = court;
    }

    public String fetchDetails() {
        return getInfo()+"\n"+
                "Domain: "+getCourt();
    }
}
