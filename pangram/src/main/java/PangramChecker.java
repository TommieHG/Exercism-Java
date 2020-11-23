public class PangramChecker {

    public boolean isPangram(String input) {

        String newInput = input.toLowerCase(); //put string in lower case so comparison is made easy

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 97); //turn decimal values to ASCII lower case letters
            int intCheck = newInput.indexOf(c); //returns int of index where argument is. -1 if not in string

            if (intCheck == -1) {
                return false;
            }
        }

        return true;
    }

}
