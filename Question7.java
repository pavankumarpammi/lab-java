class Sol{
    public void pushzeros(int arr[])
    {
        int n =arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(n>count)
        {
            arr[count++]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        Sol ob =new Sol();
        ob.pushzeros(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}