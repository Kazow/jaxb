package JAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "JAXB")
public class Carstore {

  @XmlElementWrapper(name = "AutoList")
  @XmlElement(name = "Auto")
  private ArrayList<Auto> AutoList;
  private String name;
  private String location;

  public void setAutoList(ArrayList<Auto> AutoList) {
    this.AutoList = AutoList;
  }

  public ArrayList<Auto> getAutosList() {
    return AutoList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
} 