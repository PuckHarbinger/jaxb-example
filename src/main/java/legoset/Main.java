package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {

        LegoSet legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(List.of("Starfighter","Stormtrooper","Star Wars","Solo"));
        legoset.setMinifigs(List.of("Imperial Mudtrooper","Imperial Pilot","Mimban Stormtrooper"));
        legoset.setWeight(new BigDecimal("0.89"));
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoset,System.out);

        JAXBHelper.toXML(legoset,new FileOutputStream("legoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class,new FileInputStream("legoSet.xml")));

    }

}
