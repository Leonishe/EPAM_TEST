import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


public class Company {

    private String name;

    @XmlAttribute          //Получаем название компании
    public String getName(){
        return name;
    }



    private List<Product> system;           //Получаем список продуктов в поле system
    @XmlElementWrapper(name = "system")
    @XmlElement
    public List<Product> getSystem(){
        return system;
    }




    public List<Product> editor;           //Получаем список продуктов в поле editor
    @XmlElementWrapper(name = "editor")
    @XmlElement
    public List<Product> getEditor(){
        return editor;
    }


}
