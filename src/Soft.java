import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Soft {

    private String name;


    public String getName(){
        return name;
    }

    private List<Company> company;    //Получаем список компаний

    @XmlElement
    public List<Company> getCompany(){
        return company;
    }



}
