public class perfectNumber {
    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if(number < 1){
            return false;
        }

        for (int i = 1; i < number; i++) {
            if ( number % i == 0) {
                System.out.println(i + "");
                sum = sum + i;
            }

        }

        if (number == sum){
            return true;
        }
        return false;
    }

}
