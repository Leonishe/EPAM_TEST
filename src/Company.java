import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Company {

    private String name;

    @XmlAttribute(name="company")          //Получаем название компании
    public String getName(){
        return name;
    }



    public List<Product> system;           //Получаем список продуктов в поле system

    @XmlElement(name="system")
    public List<Product> getSystem(){
        return system;
    }

    public List<Product> editor;           //Получаем список продуктов в поле editor

    @XmlElement(name="editor")
    public List<Product> getEditor(){
        return editor;
    }












}
