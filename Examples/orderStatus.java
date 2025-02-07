  // This enum represents possible order states
enum oStatus {
  PENDING,
  PROCESSING,
  SHIPPED,
  DELIVERED,
  CANCELLED
}

public class orderStatus {
  private String orderId;
  private oStatus oStatus;

  // Constructor
  public orderStatus(String orderId) {
    this.orderId = orderId;
    this.oStatus = oStatus;
  } 

  // Method to cancel the order
  public void cancelOrder() {
    this.oStatus = oStatus.CANCELLED;
  }

  // Method to mark the order as delivered
  public void deliverOrder() {
    this.oStatus = oStatus.DELIVERED;
  }

  // Getter
  public oStatus getStatus() {
    return this.oStatus;
  }

  // Getter
  public String getId() {
    return this.orderId;
  }


  public static void main(String[] args) {
    // Example usage of the enum and its values
    orderStatus order1 = new orderStatus("1234");
    order1.deliverOrder();
    System.out.println(order1.getStatus()+ " Id: " + order1.getId()); // Output: CANCELLED
    

    orderStatus order2 = new orderStatus("5678");
    order2.cancelOrder();
    System.out.println(order2.getStatus() + " Id: " + order2.getId()); // Output: DELIVERED
  }
}
