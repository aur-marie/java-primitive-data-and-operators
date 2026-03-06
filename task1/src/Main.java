public static void main(String[]args){
    // creating value for my variable in(kg)
    float earthWeightIsingizwe = 98.05f;//
    System.out.println("Earth Weight: "+earthWeightIsingizwe+ "kg");

    // calculating mars weight using earth weight.
    float marsWeightIsingizwe = earthWeightIsingizwe * 0.38f;//formula=(earth weightx38)/100
    System.out.println("Mars Weight: "+marsWeightIsingizwe+ "kg");

    //converting mars weight from float to double datatype and adding limit to decimal place value
    double marsWeightdoubleIsingizwe = marsWeightIsingizwe;
    System.out.println("Mars Weight: "+marsWeightdoubleIsingizwe+ "kg");
    System.out.printf("Mars Weight:%.4f kg%n",marsWeightdoubleIsingizwe);
    //(%.4f)it is a specifier to specify well how many decimal places to have.(%n)this creates a new line.

    //After getting my result with four decimal places I had to cast it into int variable.
    int marsWeightintIsingizwe = (int) marsWeightdoubleIsingizwe;
    System.out.println("Mars Weight:"+marsWeightintIsingizwe+ "kg");

    //Casting my int into char,in ASCII values where char includes (@,!,#,%)etc ...
    char marsWeightcharIsingizwe = (char) marsWeightintIsingizwe;
    System.out.println("Mars Weight:"+marsWeightcharIsingizwe+ "kg");

    //Finally, I had to use math operation on my char variable and turn the result into int variable.
    int resultintIsingizwe =marsWeightcharIsingizwe+ 20;
    System.out.println("Math operation on mars weight:" +resultintIsingizwe+ "kg");

}
