// Main class to test and demonstrate the functionality of various demographic information classes
public class Demographics {

    public static void main(String[] args) {
        // Creating instances for different types of demographic information
        AgeInfo ageInfo = new AgeInfo("Alice Johnson", "Female", 30);
        NationalityInfo nationalityInfo = new NationalityInfo("Alice Johnson", "Female", "American");
        OccupationInfo occupationInfo = new OccupationInfo("Alice Johnson", "Female", "Software Engineer", "Technology");
        IncomeInfo incomeInfo = new IncomeInfo("Alice Johnson", "Female", 85000);

        // Displaying information collected by each class
        ageInfo.displayBasicInfo();
        ageInfo.displayAgeInfo();

        nationalityInfo.displayNationalityInfo();

        occupationInfo.displayOccupationInfo();

        incomeInfo.displayIncomeInfo();
    }
}
