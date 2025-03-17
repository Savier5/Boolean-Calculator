import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);
        String lawInput = "";
        String tempValsInput;
        boolean outputValOne = false, outputValTwo = false, finalOutputVal = false;
        boolean contLoop = true;
        boolean x = false, y = false, z = false;

        //Selects which laws of Boolean algerbra being used
        System.out.println("This Boolean calculator calculates Idempotent, Associative, and Commutative law.");
        while (contLoop == true) {
            System.out.println("\nWhat law would you like to use? (Enter " + "\033[1;31m1\033[0m" + " for Idempotent, " + "\033[1;31m2\033[0m" + " for Associative, and " + "\033[1;31m3\033[0m" + " for Commutative law):");
            lawInput = scannerInput.nextLine();

            if (!lawInput.equals("1") && !lawInput.equals("2") && !lawInput.equals("3")) {
                System.out.println("\033[1;31mError: The incorrect input was entered.\033[0m");

            }else{
                contLoop = false;
            }
        }

        //Getting value for X
        contLoop = true;
        while (contLoop == true) {
            System.out.println("\nWhat value do you want X to have? (Acceptable input for True are " + "\033[1;31mTrue\033[0m" + ", " + "\033[1;31mtrue\033[0m" + ", " + "\033[1;31mT\033[0m" + ", " + "\033[1;31mt\033[0m" + ", " + "\033[1;31m1\033[0m" + " and for False are " + "\033[1;31mFalse\033[0m" + ", " + "\033[1;31mfalse\033[0m" + ", " + "\033[1;31mF\033[0m" + ", " + "\033[1;31mf\033[0m" + ", " + "\033[1;31m0\033[0m" + ":");
            tempValsInput = scannerInput.nextLine();

            if (tempValsInput.equals("True") || tempValsInput.equals("true") || tempValsInput.equals("T") || tempValsInput.equals("t") || tempValsInput.equals("1")) {
                x = true;
                contLoop = false;

            }else if (tempValsInput.equals("False") || tempValsInput.equals("false") || tempValsInput.equals("F") || tempValsInput.equals("f") || tempValsInput.equals("0")) {
                x = false;
                contLoop = false;

            }else{
                System.out.println("\033[1;31mError: The incorrect input was entered.\033[0m");
            }
        }

        //Doesn't ask for Y value until Associative or Commutative laws are selected.
        if (!lawInput.equals("1")) {
            //Getting value for Y
            contLoop = true;
            while (contLoop == true) {
                System.out.println("\nWhat value do you want Y to have? (Acceptable input for True are " + "\033[1;31mTrue\033[0m" + ", " + "\033[1;31mtrue\033[0m" + ", " + "\033[1;31mT\033[0m" + ", " + "\033[1;31mt\033[0m" + ", " + "\033[1;31m1\033[0m" + " and for False are " + "\033[1;31mFalse\033[0m" + ", " + "\033[1;31mfalse\033[0m" + ", " + "\033[1;31mF\033[0m" + ", " + "\033[1;31mf\033[0m" + ", " + "\033[1;31m0\033[0m" + ":");
                tempValsInput = scannerInput.nextLine();

                if (tempValsInput.equals("True") || tempValsInput.equals("true") || tempValsInput.equals("T") || tempValsInput.equals("t") || tempValsInput.equals("1")) {
                    y = true;
                    contLoop = false;

                }else if (tempValsInput.equals("False") || tempValsInput.equals("false") || tempValsInput.equals("F") || tempValsInput.equals("f") || tempValsInput.equals("0")) {
                    y = false;
                    contLoop = false;

                }else{
                    System.out.println("\033[1;31mError: The incorrect input was entered.\033[0m");
                }
            }
        }

        //Doesn't ask for Z value until Associative laws is selected.
        if (!lawInput.equals("1") && !lawInput.equals("3")) {
            //Getting value for Z
            contLoop = true;
            while (contLoop == true) {
                System.out.println("\nWhat value do you want Z to have? (Acceptable input for True are " + "\033[1;31mTrue\033[0m" + ", " + "\033[1;31mtrue\033[0m" + ", " + "\033[1;31mT\033[0m" + ", " + "\033[1;31mt\033[0m" + ", " + "\033[1;31m1\033[0m" + " and for False are " + "\033[1;31mFalse\033[0m" + ", " + "\033[1;31mfalse\033[0m" + ", " + "\033[1;31mF\033[0m" + ", " + "\033[1;31mf\033[0m" + ", " + "\033[1;31m0\033[0m" + ":");
                tempValsInput = scannerInput.nextLine();

                if (tempValsInput.equals("True") || tempValsInput.equals("true") || tempValsInput.equals("T") || tempValsInput.equals("t") || tempValsInput.equals("1")) {
                    z = true;
                    contLoop = false;

                }else if (tempValsInput.equals("False") || tempValsInput.equals("false") || tempValsInput.equals("F") || tempValsInput.equals("f") || tempValsInput.equals("0")) {
                    z = false;
                    contLoop = false;

                }else{
                    System.out.println("\033[1;31mError: The incorrect input was entered.\033[0m");
                }
            }
        }
        
        scannerInput.close();;

        // Boolean Algebra / Output
        if (lawInput.equals("1")) {
            //Calculates Idempotent laws
            outputValOne = x || x;
            outputValTwo = x && x;
            if (outputValOne && outputValTwo) {
                finalOutputVal = true;
                System.out.println("\nThey are both correct:\n" + "   - " + x + " + " + x + " = " + finalOutputVal +
                "\n   - " + x + " * " + x + " = " + finalOutputVal);
            }else {
                finalOutputVal = false;
                System.out.println("\nThey are both incorrect:\n" + "   - " + x + " + " + x + " = " + finalOutputVal +
                "\n   - " + x + " * " + x + " = " + finalOutputVal);
            }
        }else if (lawInput.equals("2")) {
            //Calculates Associative laws
            outputValOne = (x || y) || z;
            outputValTwo = (x && y) && z;
            if (outputValOne && outputValTwo) {
                System.out.println("\nThey are both correct:\n" + "   - (" + x + " + " + y + ") + " + z + " = " + outputValOne);
                System.out.println("   - (" + x + " * " + y + ") * " + z + " = " + outputValTwo);
            }else if (outputValOne || outputValTwo){
                System.out.println("\nOne is incorrect:\n" + "   - (" + x + " + " + y + ") + " + z + " = " + outputValOne);
                System.out.println("   - (" + x + " * " + y + ") * " + z + " = " + outputValTwo);
            }else {
                System.out.println("\nThey are both incorrect:\n" + "   - (" + x + " + " + y + ") + " + z + " = " + outputValOne);
                System.out.println("   - (" + x + " * " + y + ") * " + z + " = " + outputValTwo);
            }
        }else  {
            //Calculates Commutative laws
            outputValOne = x || y;
            outputValTwo = x && y;
            if (outputValOne && outputValTwo) {
                System.out.println("\nThey are both correct:\n" + "   - " + x + " + " + y + " = " + outputValOne);
                System.out.println("   - " + x + " * " + y + " = " + outputValTwo);
            }else if (outputValOne || outputValTwo){
                System.out.println("\nOne is incorrect:\n" + "   - " + x + " + " + y + " = " + outputValOne);
                System.out.println("   - " + x + " * " + y + " = " + outputValTwo);
            }else {
                System.out.println("\nThey are both incorrect:\n" + "   - " + x + " + " + y + " = " + outputValOne);
                System.out.println("   - " + x + " * " + y + " = " + outputValTwo);
            }
        }
    }
}