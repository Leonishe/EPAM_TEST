import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement

public class Soft {
    @XmlElement
    List<String>[] Company;

    int price;
    int size;



}