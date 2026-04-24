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
    }
}
