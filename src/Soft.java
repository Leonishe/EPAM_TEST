import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Soft {

    private String name;

    public Soft() {
    }


    public String getName(){
        return name;
    }

    private List<Company> company;

    @XmlElement
    public List<Company> getCompany(){
        return company;
    }



}
