class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int modifiedNumberToCheck = numberToCheck;
        int[] digits = new int[String.valueOf(numberToCheck).length()];
        int counter = 0;
        int armstrongCheck = 0;

        //while-loop to extract each digit
        while(modifiedNumberToCheck > 0){
            digits[counter] = modifiedNumberToCheck % 10;
            modifiedNumberToCheck = modifiedNumberToCheck / 10;
            counter++;
        }

        //for-loop to add each digit with exponent which is length of number
        for (int i = 0; i < digits.length; i++) {
            armstrongCheck += Math.pow(digits[i], String.valueOf(numberToCheck).length());
        }

        return numberToCheck == armstrongCheck;
    }
}
