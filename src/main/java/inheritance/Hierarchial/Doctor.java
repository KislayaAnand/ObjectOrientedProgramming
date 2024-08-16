package inheritance.Hierarchial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doctor extends Professional {
    private String domain;

    public Doctor(String name, String id, int experience, double salary, String domain) {
        super(name, id, experience,salary);
        this. domain = domain;
    }

    public String fetchDetails() {
        return getInfo()+"\n"+
                "Domain: "+getDomain();
    }
}
