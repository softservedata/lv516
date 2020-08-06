package Homework7.task7_2;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTenPerson {
    Map <String,String> personMap = new TreeMap<>();
   //не можу видалити об'єкт за значенням
    public void delete(){
        for (Iterator i = personMap.entrySet().iterator();i.hasNext();){
        Map.Entry entry = (Map.Entry) i.next();
        if(personMap.values().equals("Igor")){
            i.remove();
        }
        }


    }
}
