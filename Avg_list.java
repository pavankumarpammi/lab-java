
public class Avg_list {
    public static void main(String[] args) {
        int arr[]={25,8,67,58,28,89};
        int n = arr.length;
        double avg;
        int sum=0;
        int i=0;
        do{
           
           sum+=arr[i];
           i++;
        }
        while(i<n);
        avg=sum/n;
        System.out.println(avg);
    }
}
