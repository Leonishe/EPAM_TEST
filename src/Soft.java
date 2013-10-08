import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Soft {



    private List<Company> company;    //Получаем список компаний
    @XmlElementWrapper(name = "company")
    @XmlElement
    public List<Company> getCompany(){
        return company;
    }



}
