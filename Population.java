public class Population{
    public static void main(String[] args){
        double popMexico = 121; // Population of Mexico in millions
        double popUS = 315; // Population of US in millions
        double growthMexico = 0.0101; // Growth rate of Mexico
        double decreaseUS = 0.0015; // Decrease rate of US
        int years;

        for(years = 1; popMexico < popUS; years++){
            popMexico = popMexico + (popMexico * growthMexico); // Population of Mexico after every year
            popUS = popUS - (popUS * decreaseUS); // Population of US after every year
            System.out.println("For Year " + years + "\nPopulation of Mexico is " + popMexico + " M" +"\nPopulation of US is " + popUS + "M\n");
        }
        System.out.println("\nIt will take " + years + " years for the population of Mexico to exceed the population of US");
    }
}