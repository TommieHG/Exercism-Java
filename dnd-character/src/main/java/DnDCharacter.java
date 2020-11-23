class DnDCharacter {

    private int[] abilities = new int [6];

    //Constructor to calculate all the ability values
    public DnDCharacter(){
        for (int i = 0; i < abilities.length; i++) {
            abilities[i] = calculateAbilityValue();
        }
    }

    int ability() {
        return abilities[getRandomNumber() - 1];
    }

    int modifier(int input) {
        double calc = input - 10; //I can't put this directly into return statement for some reason
        return (int) Math.floor(calc/2);
    }

    int getStrength() {
        return abilities[0];
    }

    int getDexterity() {
        return abilities[1];
    }

    int getConstitution() {
        return abilities[2];
    }

    int getIntelligence() {
        return abilities[3];
    }

    int getWisdom() {
        return abilities[4];
    }

    int getCharisma() {
        return abilities[5];
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    private int calculateAbilityValue(){
        int[] randVal = new int[4];
        int sum = 0;

        for (int i = 0; i < randVal.length; i++) {
            randVal[i] = getRandomNumber();
        }

        selectionSort(randVal);

        //after selection sort is done, the first array index is the smallest, meaning it isn't part of the sum
        for (int i = 1; i < randVal.length; i++) {
            sum += randVal[i];
        }

        return sum;
    }

    //Helper to calculate random number between 1 and 6
    private int getRandomNumber() {
        return (int) ((Math.random() * (6 - 1)) + 1);
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = (int) swap;
    }

    //classic sorting algorithm
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }
}
