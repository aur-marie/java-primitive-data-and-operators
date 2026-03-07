public class legoContainer {
    public static void main(String[] args){
        //amount of bricks which is an odd number.
        int amountOfBricks = 75;
        System.out.println("Number of Lego bricks: " + amountOfBricks);
        //the amount of bricks one container can hold.
        int containercapacity = 8;
        System.out.println("My container capacity: " +containercapacity);
        //using the bricks i have and the capacity of my container i am calculating the full containers i will have .
        int fullcontainers = amountOfBricks /containercapacity;
        System.out.println("Full containers: " + fullcontainers);
        //Calculating how many bricks will be leftover after my container reaches its capacity amount.
        int remainingblock = amountOfBricks %  containercapacity;
        System.out.println("remainingblock:" +remainingblock);
        //calculating both full and partial container i will have.
        int totalcontainers = fullcontainers +(remainingblock> 0 ?1:0);
        // ?1:0 if the remaining block is greater than 0 then add one container or else add zero container.
        System.out.println("Total container we have:"+totalcontainers);
    }
}
