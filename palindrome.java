class palindrome{
    public static void main(String[] args){
        int a=121;
        int n=a;
        int sum=0;
        while(a!=0)
        {
            int r=a%10;
            a=a/10;
            sum=sum*10+r;
        }
        if(sum==n)
        {
            System.out.println("Number is Palindrome");

        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}