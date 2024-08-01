public class lesson11_real_life_example {
    public static void main(String[] args) {

        // For the last activity on this lesson, I will calculate the percentage of Used and Remaining budget

        // The total budget
        int budgetTotal = 7500;
        // The used budget
        int budgetUsed = 4000;
        // The remaining budget
        int budgetRemain = budgetTotal - budgetUsed;

        // This line will now compute the percentage using float function
        float percentageUsed = (float) budgetUsed / budgetTotal * 100.0f;
        System.out.println(percentageUsed + "%");
        float percentageRemain = (float) budgetRemain / budgetTotal * 100.0f;
        System.out.println(percentageRemain + "%");
    }
}
