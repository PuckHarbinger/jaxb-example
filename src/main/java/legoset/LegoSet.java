package legoset;

import lombok.Data;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


@XmlType(propOrder = {"name","theme","subtheme","year","pieces","tags","minifigs","weight","url"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    private List<String>tags;

    @XmlElementWrapper(name="minifigs")
    @XmlElement(name="minifig")
    private List<String> minifigs;
    private BigDecimal weight;



    private URL url;

    @XmlAttribute
    private String number;

}
