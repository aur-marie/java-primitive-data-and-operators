public class Evenorodd { // creating an Evenorodd class.
    public static void main(String[] args) {
        //Generating number from1-100,with amethod random() and java in built-class Math.
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated number: " + randomNumber);
        // % this a remainder in my if condition where any random number divided by two and we get zero as remainder it is even otherwise it's odd.
        if (randomNumber % 2 == 0){
            System.out.println(randomNumber + ",THIS IS AN EVEN NUMBER!");
        }else{
            System.out.println(randomNumber + ",THIS IS AN ODD NUMBER!");
        }
    }

}
