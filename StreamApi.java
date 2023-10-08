import java.util.*;
import java.util.stream.*;
class Sol{
    public static void main(String[] args) {
        List<Integer> lis= Arrays.asList(2,4,5,8,3);
        //lis.forEach(n->System.out.println(n));
        Stream<Integer> stm =lis.stream();
        stm.forEach(n->System.out.println(n));
    }
}