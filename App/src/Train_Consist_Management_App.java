/**
 * ========================================================================
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * ========================================================================
 *
 * Use Case 1: Initialize train and display consist summary
 *
 * Description:
 * This class represents the entry point of the Train Consist Management Application.
 *
 * At this stage the application :
 * -Creates an empty train consist
 * -Uses adynamic list to share bogies
 * -Displays initial bogie count
 * -Prints the current state of the train
 *
 * This use case introduces collection initialization and basic program startup flow.
 *
 */
import java.util.ArrayList;
import java.util.List;
public class Train_Consist_Management_App {
    public static void main(String[] args){
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC1: Initialize Train and Display Consist Summary");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Train consist initialized succesfully");
/**
 * ================================================================
 * MAIN CLASS - UseCase2TrainConsist=Mgmnt
 * ================================================================
 *
 * Use case 2 : Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be managed using ArrayList operations.
 *
 * At this stage, the application:
 * -Adds new boggies to the train
 * -Removes existing bogies
 * -Checks for bogie Availability
 * -Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
  */    System.out.println("UC2: Add Passenger Bogies to Train");
        System.out.println();


        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");


        System.out.println("Passenger Bogies after addition:");
        System.out.println(trainConsist);


        trainConsist.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(trainConsist);


        if (trainConsist.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie does NOT exist.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);


        System.out.println("\nProgram executed successfully.");
    }
}


