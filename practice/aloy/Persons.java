package practice.aloy;



public class Persons {
    
public void FirstGeneration(){
    // The first generation would be the parents

    String  father, mother;
    
    father = "Donald Jones";
    mother = "Mary Jones";
    
  
    System.out.println(father + " and " + mother + " make the first generation.");

}

public void SecondGeneration(){

    //The second generation would be the children of the first
    String   FirstGenerationChild1, FirstGenerationChild2, father1, mother1;

    FirstGenerationChild1 = "Joseph Jones";
    FirstGenerationChild2 = "Margret Jones";
    father1 = "Donald Jones";
    mother1 = "Mary Jones";

    System.out.println(FirstGenerationChild1 + " and " + FirstGenerationChild2 + " are the children of " + father1 + " and " + mother1);

}    

public void ThirdGeneration (){
    //The third generation would be the children of the second generation

    String SecondGenerationChild1, SecondGenerationChild2, SecondGenerationChild3, SecondGenerationChild4, FirstGenerationChild11,FirstGenerationChild22;

    SecondGenerationChild1 = "Kelvin";
    SecondGenerationChild2 = "Jessica";
    SecondGenerationChild3 = "Mabel";
    SecondGenerationChild4 = "Caroline";

    FirstGenerationChild11 = "Joseph Jones";
    FirstGenerationChild22 = "Margret Jones";

    String offspring;
    offspring = SecondGenerationChild1 + ", " + SecondGenerationChild2 + ", " + SecondGenerationChild3 + " and " + SecondGenerationChild4 + " are the children of " +FirstGenerationChild11 + " and " + FirstGenerationChild22 + " from the second generation.";

    System.out.println(offspring);
}

public void FourthGeneration(){
    //Fourth generation would be the offsprings of the third

    String ThirdGenerationChild1, ThirdGenerationChild2, ThirdGenerationChild3, ThirdGenerationChild4, ThirdGenerationChild5, ThirdGenerationChild6, ThirdGenerationChild7, ThirdGenerationChild8;

    ThirdGenerationChild1 = "Kelvin Junior";
    ThirdGenerationChild2 = "Mike";
    ThirdGenerationChild3 = "Luke";
    ThirdGenerationChild4 = "Cassie";
    ThirdGenerationChild5 = "Miriam";
    ThirdGenerationChild6 = "Chris";
    ThirdGenerationChild7 = "Rose";
    ThirdGenerationChild8 = "Jane";

    String offspring2;
    offspring2 = ThirdGenerationChild1 + ", " + ThirdGenerationChild2 + ", " + ThirdGenerationChild3 + ", " + ThirdGenerationChild4 + ", " + ThirdGenerationChild5 + ", " + ThirdGenerationChild6 + ", " + ThirdGenerationChild7 + " and " + ThirdGenerationChild8 + " are the children of the third generation.";

    System.out.println(offspring2);

}

public void FifthGeneration(){
    //Fifth generation would be the offsprings of the fourth.

    String FourthGenerationChild1, FourthGenerationChild2, FourthGenerationChild3, FourthGenerationChild4, FourthGenerationChild5;
    
    FourthGenerationChild1 = "Patricia";
    FourthGenerationChild2 = "Felix";
    FourthGenerationChild3 = "Blessing";
    FourthGenerationChild4 = "Dan";
    FourthGenerationChild5 = "Justin";

    String offspring3;

    offspring3 = FourthGenerationChild1 + ", " + FourthGenerationChild2 + ", " + FourthGenerationChild3 + ", " + FourthGenerationChild4 +  " and " + FourthGenerationChild5 + " are the children of the fourth generation.";
    System.out.println(offspring3);

}

public void SixthGeneration(){

    //The sixth generation would be the children of the fifth.

    String FifthGenerationChild1, FifthGenerationChild2, FifthGenerationChild3, FifthGenerationChild4;

    FifthGenerationChild1 = "Rosemary";
    FifthGenerationChild2 = "Lawrence";
    FifthGenerationChild3 = "Cecilia";
    FifthGenerationChild4 = "Charity";

    String offspring4;
    offspring4 = FifthGenerationChild1 + ", " + FifthGenerationChild2 + ", " + FifthGenerationChild3 + " and " + FifthGenerationChild4 + " are the children of the fifth generation.";

    System.out.println(offspring4);



}

}
