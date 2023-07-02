public class Exercise14 {
    
    public static void main(String[] args) 
    {
    int a,b,c,d,p,ans,num;
    a=86400;
    p=312032486;
    b=a/7;
    c=a/13;
    d=a/45;
    num=(b+c+d)*(365*5);
    ans=p-num;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(ans);
   
    }
}
