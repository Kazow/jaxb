package JAXB;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class CarTest {

  private static final String CARESTORE_XML = "./carstore-jaxb.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Auto> carList = new ArrayList<Auto>();

    // create cars
    Auto car1 = new Auto();
    car1.setkennzeichen("W-2343290");
    car1.setbez("X6");
    car1.setmarke("BMW");
    car1.setdoors("5");
    carList.add(car1);

    Auto car2 = new Auto();
    car2.setkennzeichen("WU-2342341");
    car2.setbez("A§");
    car2.setmarke("Audo");
    car2.setdoors("2");
    carList.add(car2);


    Carstore carstore = new Carstore();
    carstore.setName("Autohaus Wien");
    carstore.setLocation("Wien");
    carstore.setAutoList(carList);


    JAXBContext context = JAXBContext.newInstance(Carstore.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

 
    m.marshal(carstore, System.out);

 
    m.marshal(carstore, new File(CARESTORE_XML));

    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Carstore carstore2 = (Carstore) um.unmarshal(new FileReader(CARESTORE_XML));
    ArrayList<Auto> list = carstore2.getAutosList();
    for (Auto car : list) {
      System.out.println("Auto: " + car.getbez() + " from "
          + car.getmarke());
    }
  }
} 