package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "car")
@XmlType(propOrder = { "marke", "bez", "marke", "kennzeichen" })
public class Auto {

  private String bez;
  private String marke;
  private String doors;
  private String kennzeichen;


  @XmlElement(name = "bez")
  public String getbez() {
    return bez;
  }

  public void setbez(String bez) {
    this.bez = bez;
  }

  public String getmarke() {
    return marke;
  }

  public void setmarke(String marke) {
    this.marke = marke;
  }

  public String getdoors() {
    return doors;
  }

  public void setdoors(String doors) {
    this.doors = doors;
  }

  public String getkennzeichen() {
    return kennzeichen;
  }

  public void setkennzeichen(String kennzeichen) {
    this.kennzeichen = kennzeichen;
  }

}
