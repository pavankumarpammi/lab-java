enum Result{
    PASS,FAIL,NR;
    int mark;
    Result()
    {
        System.out.println("constructor in enum");
    }
    public void setMark(int mark)
    {
        this.mark=mark;
    }
    public int getMark()
    {
        return mark;
    }
}
class Sol{
    public static void main(String[] args) {
        Result.PASS.setMark(50);
        int m= Result.PASS.getMark();
        System.out.println(m);
    }
}