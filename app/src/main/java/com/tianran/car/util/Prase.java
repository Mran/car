package com.tianran.car.util;

import com.tianran.car.main.modle.CarBrandEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class Prase {
    public static List<CarBrandEntity> getAllCarBrands(String page) {
        List<CarBrandEntity> carBrandInfos = new ArrayList();
        Iterator it = Jsoup.parse(page).getElementById("div_ListBrand").getElementsByTag("ul").iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Element) it.next()).getElementsByTag("li").iterator();
            while (it2.hasNext()) {
                Element bb = (Element) it2.next();
                CarBrandEntity carBrandInfo = new CarBrandEntity();
                carBrandInfo.setId(bb.attr("id"));
                carBrandInfo.setBrand(bb.text());
                String temp = bb.getElementsByTag("img").toString();
                carBrandInfo.setBrandImg("http://" + temp.substring(temp.indexOf("//") + 2, temp.indexOf("\">")));
                carBrandInfos.add(carBrandInfo);
            }
        }
        return carBrandInfos;
    }
}
