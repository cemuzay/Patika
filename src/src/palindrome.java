package src.src;

public class palindrome {
    public static void main(String[] args) {
        palindrome(2476);
    }
    public static boolean palindrome(int number){
        int temp=number;
        int reversenumber=0;
        int lastnumber;

        while(temp!=0){
            System.out.println("sayı : "+temp);
            lastnumber=temp%10;
            System.out.println("son basamak : "+lastnumber);
            reversenumber=(reversenumber*10)+lastnumber;
            System.out.println("ters sayı : "+ reversenumber);
            temp/=10;
        }
        return true;
    }
}
