/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 4.5: Pilot Simulator
 * @date 04-12-2018
 * @extra Reads back adjusted characteristics
 **/

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

import static javax.xml.bind.DatatypeConverter.parseInt;

public class FlightSim {

    // Scanner for use in all methods
    private static Scanner kbd = new Scanner(System.in);

    // Variables for defining characteristics of aircraft
    private static String aircraft;
    private static Integer horizontalTrim = 50;
    private static Integer verticalTrim = 50;
    private static Integer forceBreakout = 5;
    private static Integer forceGradient = 5;
    private static Integer forceFriction = 5;
    private static Integer damping = 50;
    private static Integer leftHardStop = 0;
    private static Integer rightHardStop = 0;
    private static Integer upperHardStop = 0;
    private static Integer lowerHardStop = 0;

    // User input, for use with scanners
    private static String input;

    public static void main (String[] args) {
        // Calls methods in which order their functions need to happen
        aircraftType();
        motionAdjust();
        // printValues();
    }

    private static void aircraftType () {
        // Selects the aircraft to use
        System.out.println("What aircraft are you simulating?");
        System.out.println(" 1. Blimp\n 2. Helicopter\n 3. Fighter Jet\n 4. Space Shuttle");
        input = kbd.nextLine();
        switch (input) {
            case "1":
                aircraft = "blimp";
                break;
            case "blimp":
                aircraft = "blimp";
                break;
            case "2":
                aircraft = "helicopter";
                break;
            case "helicopter":
                aircraft = "helicopter";
                break;
            case "3":
                aircraft = "fighter";
                break;
            case "fighter jet":
                aircraft = "fighter";
                break;
            case "4":
                aircraft = "shuttle";
                break;
            case "space shuttle":
                aircraft = "shuttle";
                break;
            default:
                System.out.println("That was not a recognized input.");
                aircraftType();
                break;
        }
    }

    private static void motionAdjust () {
        // Presents a menu of options to adjust flight characteristics
        System.out.println("What characteristics would you like to adjust?");
        System.out.println(" 1. Positional Trim\n 2. Force Breakout\n 3. Force Gradient\n 4. Force Friction\n 5. Damping\n 6. Hard Stop");
        System.out.println("Enter \"finished\" when you are finished.");
        input = kbd.nextLine();
        switch (input) {
            case "1":
                // Option to change positional trim
                System.out.println("Positional trim changes the position to which a flight control returns when releasing it.");
                System.out.println("Adjust the horizontal trim (default is 50, below 50 is left & above is right):");
                input = kbd.nextLine();
                // If nothing is input, horizontalTrim is set to 50
                if (input.equals("")) {
                    horizontalTrim = 50;
                    break;
                }
                // try/catch to set horizontalTrim to the input
                try {
                    horizontalTrim = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                    break;
                }
                System.out.println("Adjust the vertical trim (default is 50, below 50 is down & above is up):");
                input = kbd.nextLine();
                // If nothing is input, verticalTrim is set to 50
                if (input.equals("")) {
                    verticalTrim = 50;
                    break;
                }
                // try/catch to set verticalTrim to the input
                try {
                    verticalTrim = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                }
                break;
            case "2":
                // Option to change force breakout
                System.out.println("Force breakout is the consistent resistance applied to the flight control when moved from it's position.");
                System.out.println("Adjust the force breakout (default is 5, below 5 is weaker & above is stronger):");
                input = kbd.nextLine();
                // If nothing is input, forceBreakout is set to 5
                if (input.equals("")) {
                    forceBreakout = 5;
                    break;
                }
                // try/catch to set verticalTrim to the input
                try {
                        forceBreakout = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                }
                break;
            case "3":
                // Option to change force gradient
                System.out.println("Force gradient is the varying resistance applied to the flight control, getting stronger as the control moves farther from trim position.");
                System.out.println("Adjust the force gradient (default is 5, below 5 is weaker & above is stronger):");
                input = kbd.nextLine();
                // If nothing is input, forceGradient is set to 5
                if (input.equals("")) {
                    forceGradient = 5;
                    break;
                }
                // try/catch to set verticalTrim to the input
                try {
                    forceGradient = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                }
                break;
            case "4":
                // Option to change force friction
                System.out.println("Force friction is a constant force opposite the direction of movement.");
                System.out.println("Set the force friction (default is 5, below 5 is weaker & above is stronger):");
                input = kbd.nextLine();
                // If nothing is input, forceFriction is set to 5
                if (input.equals("")) {
                    forceFriction = 5;
                    break;
                }
                // try/catch to set verticalTrim to the input
                try {
                    forceFriction = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                }
                break;
            case "5":
                // Option to change damping
                System.out.println("Damping is the varying resistance applied opposite to the direction of movement, intensifying the faster the control is moved.");
                System.out.println("Set the damping (default is 50, below 50 is weaker & above is stronger):");
                input = kbd.nextLine();
                // If nothing is input, damping is set to 50
                if (input.equals("")) {
                    damping = 50;
                    break;
                }
                // try/catch to set verticalTrim to the input
                try {
                    damping = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                }
                break;
            case "6":
                // Option to change hard stop
                System.out.println("Hard stop limits the range of motion for the flight control.");
                System.out.println("Adjust the left limit (default is 0, above is shorter range of travel in that direction):");
                input = kbd.nextLine();
                // If nothing is input, horizontalTrim is set to 50
                if (input.equals("")) {
                    leftHardStop = 0;
                    break;
                }
                // try/catch to set horizontalTrim to the input
                try {
                    leftHardStop = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                    break;
                }
                System.out.println("Adjust the right limit (default is 0, above is shorter range of travel in that direction):");
                input = kbd.nextLine();
                // If nothing is input, horizontalTrim is set to 50
                if (input.equals("")) {
                    rightHardStop = 0;
                    break;
                }
                // try/catch to set horizontalTrim to the input
                try {
                    rightHardStop = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                    break;
                }
                System.out.println("Adjust the upper limit (default is 0, above is shorter range of travel in that direction):");
                input = kbd.nextLine();
                // If nothing is input, horizontalTrim is set to 50
                if (input.equals("")) {
                    upperHardStop = 0;
                    break;
                }
                // try/catch to set horizontalTrim to the input
                try {
                    upperHardStop = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                    break;
                }
                System.out.println("Adjust the lower limit (default is 0, above is shorter range of travel in that direction):");
                input = kbd.nextLine();
                // If nothing is input, horizontalTrim is set to 50
                if (input.equals("")) {
                    lowerHardStop = 0;
                    break;
                }
                // try/catch to set horizontalTrim to the input
                try {
                    lowerHardStop = parseInt(input);
                }
                // If user inputs anything other than a number, sends out unrecognized input error
                catch (NumberFormatException e) {
                    System.out.println("That was not a recognized option.");
                    break;
                }
                break;
            case "finished":
                printValues();
                System.exit(0);
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
        motionAdjust();
    }

    private static void printValues () {
        // Prints out all of the variable stats
        System.out.println("Aircraft: " + aircraft);
        System.out.println("Horizontal Trim: " + horizontalTrim + ", Vertical Trim: " + verticalTrim);
        System.out.println("Force Breakout: " + forceBreakout);
        System.out.println("Force Gradient: " + forceGradient);
        System.out.println("Force Friction: " + forceFriction);
        System.out.println("Damping: " + damping);
        System.out.println("Left Hard Stop: " + leftHardStop + ", Right Hard Stop: " + rightHardStop + ", Upper Hard Stop: " + upperHardStop + ", Lower Hard Stop: " + lowerHardStop);
        System.exit(0);
    }
}
