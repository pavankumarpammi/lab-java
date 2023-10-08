import java.util.*;

class Sol{
    public static void main(String[] args) {
        Map map =new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        System.out.println(map);
        Set es=map.entrySet();
        Iterator itr =es.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Collection v =map.values();
        Iterator itr1 =v.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        Set es1 =map.keySet();
        Iterator itr3=es1.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }
        Set set = map.entrySet();
        Iterator it =set.iterator();
        while(it.hasNext())
        {
            Map.Entry data = (Entry)it.next();
            System.out.println(data.getKey()+ "  :  "+data.getValue());
        }
    }
}