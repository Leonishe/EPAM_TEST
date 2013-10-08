
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.transform.stream.StreamSource;

public class Main{

    public static void main(String[] args) {

        try {

            File file = new File("SoftList.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{Soft.class, Company.class, Product.class});
            Unmarshaller um = jaxbContext.createUnmarshaller();
            Soft soft = (Soft) um.unmarshal(file);



        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }



}