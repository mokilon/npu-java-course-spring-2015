/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 * The model class of the calculator application.
 */
public class Calculator extends java.util.Observable {
    String boo ="",o;
    int x,y;
    
    /**
     * The available operators of the calculator.
     */
    public enum Operator {
        CLEAR,       // C
        CLEAR_ENTRY, // CE
        BACKSPACE,   // ⌫
        EQUAL,       // =
        PLUS,        // +
        MINUS,       // -
        TIMES,       // ×
        OVER,        // ⁄
        PLUS_MINUS,  // ±
        RECIPROCAL,  // 1/x
        PERCENT,     // %
        SQRT,        // √
        MEM_CLEAR,   // MC
        MEM_SET,     // MS
        MEM_PLUS,    // M+
        MEM_MINUS,   // M-
        MEM_RECALL   // MR
    }
    
    public void appendDigit(int digit) {
       boo += String.valueOf(digit);
       getDisplay();
       
        
        
    }
    
    public void appendDot() {
        // TODO code application logic here
    }
    
    public void performOperation(Operator operator) {
       if(operator == Operator.PLUS)
       {
           x = Integer.parseInt(boo);
           boo = "";
           getDisplay();
           o = "+";
       }
        if(operator == Operator.MINUS)
       {
           x = Integer.parseInt(boo);
           boo = "";
           getDisplay();
           o = "-";
       }
         if(operator == Operator.TIMES)
       {
           x = Integer.parseInt(boo);
           boo = "";
           getDisplay();
           o = "x";
       }
         if(operator == Operator.OVER)
       {
           x = Integer.parseInt(boo);
           boo = "";
           getDisplay();
           o = "/";
       }
       if(operator == Operator.EQUAL)
       {
           if(o =="+")
           {
               y = Integer.parseInt(boo);
               boo = String.valueOf(x+y);
               getDisplay();
               boo = "+";
           }
            if(o =="-")
           {
               y = Integer.parseInt(boo);
               boo = String.valueOf(x-y);
               getDisplay();
               boo = "-";
           }
             if(o =="x")
           {
               y = Integer.parseInt(boo);
               boo = String.valueOf(x*y);
               getDisplay();
               boo = "x";
           }
              if(o =="/")
           {
               y = Integer.parseInt(boo);
               boo = String.valueOf(x/y);
               getDisplay();
               boo = "/";
           }
       }
    }
    
    public String getDisplay() {
        // TODO code application logic here
        setChanged();
        notifyObservers(boo);
        return null;
    }
    public void ss(String a){
        if(a == "+") performOperation(Operator.PLUS);
        if(a == "=") performOperation(Operator.EQUAL);
         if(a == "-") performOperation(Operator.MINUS);
          if(a == "x") performOperation(Operator.TIMES);
           if(a == "/") performOperation(Operator.OVER);
        
    }
   

}
