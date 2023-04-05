
/* Class is used to make our type*/
class Cell {
    public int col, row;

    public Cell(int newRow, int newCol) {
        row = newRow;
        col = newCol;
    }

    /* Method to print cell*/
    public void printCell() {
        System.out.println(row + ", " + col);
    }

    /* Method to add row and column*/
    /*The int in the method is the return type*/
    public int addValues() {
        int result = row + col;
        //System.out.println(result);
        return result;
    }

    public String resultToString() {
        int temp = addValues();
        String result = Integer.toString(temp);
        result += " is a String";
        return result;
    }

    public String resultToString(int result) {
        String stringResult = Integer.toString(result);
        stringResult += " is a String";
        return stringResult;
    }

    public String addValuesPart2(int val1, int val2) {
        String temp = resultToString(val1 + val2);
        return temp;
    }
}

class Car {
    String owner;
    int numOfWheels;
    String brand;

    Car() {
        owner = "No owner";
        numOfWheels = 1;
        brand = "No brand";
    }

    Car(String newOwner, String newBrand, int newNumOfWheels) {
        owner = newOwner;
        brand = newBrand;
        numOfWheels = newNumOfWheels;
    }

}


public class Main {
    public static void main(String[] args) {
        /*Types - String, char, int, boolean*/

        int i = 0;
        i = 10;

        Cell cell1 = new Cell(6, 5);

        Cell cell2 = new Cell(7, 9);

        cell1.printCell();

        //int cell1Result = cell1.addValues();

        String result = cell1.resultToString();

        System.out.println(result);

        System.out.println(cell1.addValuesPart2(cell1.row, cell1.col));

        //System.out.println(cell1.result);
        //System.out.println(cell2.result);

        /*
        Car car1 = new Car();

        Car car2 = new Car("Chris", "Toyota", 7);

        System.out.println(car1.owner + ", " + car1.brand + ", " + car1.numOfWheels);
        System.out.println(car2.owner + ", " + car2.brand + ", " + car2.numOfWheels);
        */

        /*

        Class - Calculator
        *   Properties - Owners Name
        *              - Most recent result (double type)
        *
        *   Methods - adds (return double type) - Must take in params
        *   Methods - subtracts (return double type) - Must take in params
        *   Methods - divides (return double type) - Must take in params
        *   Methods - multiplies (return double type) - Must take in params
        *
        *   Methods - print Calulator owner and most recent result - No params
        *
        * */
    }

}
