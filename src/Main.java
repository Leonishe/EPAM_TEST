import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
public class Main {




        public static void main(String[] args) {

            try {

                File file = new File("SoftList.xml");
                JAXBContext jaxbContext = JAXBContext.newInstance(Soft.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Soft customer = (Soft) jaxbUnmarshaller.unmarshal(file);
                System.out.println(customer);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }

}
