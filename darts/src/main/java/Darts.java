class Darts {

    private double d;

    Darts(double x, double y) {
        //cartesian distance calculator
        d = Math.sqrt(Math.pow(0 - x, 2) + Math.pow(0 - y, 2));
    }

    int score() {
        if (d <= 1) {
            return 10;
        } else if (d > 1 && d <= 5){
            return 5;
        } else if(d > 5 && d <= 10){
            return 1;
        } else return 0;
    }
}
