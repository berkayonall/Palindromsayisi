public class Palindromsayisi {

     static boolean isPalindrom(int number){
         int temp = number,reverseNumber =0,lastNumber;
         while (temp != 0){
             System.out.println("=============");
             System.out.println("Sayı =>" + temp);
             lastNumber = temp%10;
             System.out.println("Son basamak" + lastNumber);
             reverseNumber = (reverseNumber*10) + lastNumber;
             System.out.println("Yeni sayı" + reverseNumber);
             temp /=10;

         }
         if (number == reverseNumber){
             System.out .println("Bu bir polindrom sayıdır");

             return true;}
             else
                 System.out.println("Bu polindrom sayısı değildir");

             return false;

     }

    public static void main(String[] args) {
         isPalindrom(5456);



    }
}
