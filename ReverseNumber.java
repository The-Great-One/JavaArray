public class ReverseNumber {

    public static void main(String[] args)
    {
        int num = 123456;
        System.out.println("Original: "+num);

        int temp,rev=0;
        while(num!=0)
        {
            temp = num%10;
            rev = (rev*10)+temp;
            num = num/10;
        }
        System.out.println("Reverse: "+rev);
    }

}