import java.util.*;

public class Methods {
    public void union(Set set1, Set set2)
    {
        set1.addAll(set2);
        System.out.println("Union: ");
        for(Object i : set1)
        {
            System.out.println(i);
        }
    }
    public void intersect(Set set1, Set set2)
    {
       set1.retainAll(set2);
        System.out.println("Intersection: ");
        for(Object i : set1)
        {
            System.out.println(i);
        }
    }

    public void output(Map map)
    {
        Map<String, String> people = new HashMap<String, String>(map);
        System.out.println("Map: ");
        for (Map.Entry<String, String> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void sameName(Map map)
    {
        Map<String, String> map1 = new HashMap<String, String>(map);
        int kol=0;
        ArrayList<String> names = new ArrayList<String>();
        for (String v : map1.values())
        {
            if (Collections.frequency(map.values(), v) > 1) {
               kol++;
               names.add(v);
            }
        }
        if(kol>0)
        {
            System.out.println("There are at less two persons with the same firstName:");
            System.out.println(names);
        }
        else  System.out.println("There are no at less two persons with the same firstName:");
    }

    public void removeName(Map map, String name)
    {
        Map<String, String> people = new HashMap<String, String>(map);
        Map<String, String> newPeople = new HashMap<>();
        for (Map.Entry<String, String> entry : people.entrySet())
         {
              if(!entry.getValue().contains(name)) newPeople.put(entry.getKey(), entry.getValue());
         }
        people = newPeople;
        System.out.println("Result after removing: ");
        for (Map.Entry<String, String> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
