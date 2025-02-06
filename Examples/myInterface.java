// This interface defines a method to pay an amount using a payment system
interface paymentSystem {
  void pay(double amt); // Method to pay an amount
}

class cashPayment implements paymentSystem {
  public void pay(double amt) { // Implements paying with cash
    System.out.println("Paying " + amt + " using cash");
  }
  
  // Implementation of paying method for cash system
}

class cardPayment implements paymentSystem {
  public void pay(double amt) { // Implements paying with cards
    System.out.println("Paying " + amt + " using credit card");
  }
  
  // Implementation of paying method for card system
}

class gCashPayment implements paymentSystem { // Different implementation, maybe with different parameters
  public void pay(double amt) { 
    System.out.println("Paying " + amt + " using electronic transfer");
  }

  // Implementation of paying method for e-Transfer system
}

public class myInterface { 
  public static void main(String[] args) { 
    cashPayment cash = new cashPayment(); // Creates a cash payment instance
    cardPayment card = new cardPayment(); // Creates a credit card payment instance
    gCashPayment gCash = new gCashPayment(); // Creates an e-Transfer payment instance
    
    // Examples of using the pay method with 100 as the amount
    cash.pay(100);  
    card.pay(100);
    gCash.pay(100);
    
    System.out.println("Main program completed"); 
  }
}