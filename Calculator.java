public class Calculator {
    
    private static final int PLUS = 1;
    private static final int MINUS = 2;
    private  static final int TIMES = 3;
    private static final int DIVIDE = 4;
    private static final int NONE = -1;
    private static final int EQUALS = 0;
    

    private int display;
    private int firstOperand, secondOperand;
    private int operator;
    
   
    public Calculator() {
        display = 0;
        firstOperand = 0;
        secondOperand = 0;
        operator = NONE;
    }
    
    private boolean isOperating() {
        return operator == PLUS ||
               operator == MINUS ||
               operator == TIMES ||
               operator == DIVIDE;
    }           
    public int numberKey ( int key ) {
        if (operator == NONE) {
            firstOperand = (firstOperand * 10) + key;
            display = firstOperand;
        }
        else if (operator == EQUALS) {
            firstOperand = key;
            operator = NONE;
            display = firstOperand;
        }    
        else {
            secondOperand = (secondOperand * 10) + key;
            display = secondOperand;
        }
        return display;
    }
    public int equals () {
        if (operator == PLUS) { firstOperand = (firstOperand + secondOperand); }
        else if (operator == MINUS) { firstOperand = (firstOperand - secondOperand); }
        else if (operator == TIMES) { firstOperand = (firstOperand * secondOperand); }
        else if (operator == DIVIDE) { firstOperand = (firstOperand / secondOperand); }
        display = firstOperand;
        secondOperand = 0;
        return display;
    }  
    public int plus() {
        if (isOperating()) { this.equals(); }
        operator = PLUS;
        return display;
    }    
    public int minus() {
        if (isOperating()) { this.equals(); }
        operator = MINUS;
        return display;
    }
    public int times() {
        if (isOperating()) { this.equadividels(); }
        operator = TIMES;
        return display;
    }
    public int divide () {
        if (isOperating()) { this.equals(); }
        operator = DIVIDE;
        return display;
    }
    public int clear() {
        firstOperand = 0;
        secondOperand = 0;
        operator = NONE;
        display = 0;
        return display;
    }    
}
