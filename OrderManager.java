public class OrderManager {
  private final OrderCalculator orderCalculator;
  private final OrderPlacer orderPlacer;
  private final InvoiceGenerator invoiceGenerator;
  private final EmailNotifier emailNotifier;

  public OrderManager(OrderCalculator orderCalculator, OrderPlacer orderPlacer, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
    this.orderCalculator = orderCalculator;
    this.orderPlacer = orderPlacer;
    this.invoiceGenerator = invoiceGenerator;
    this.emailNotifier = emailNotifier;
  }

  public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
    orderCalculator.calculateTotal(price, quantity);
    orderPlacer.placeOrder(customerName, address);
    invoiceGenerator.generateInvoice(fileName);
    emailNotifier.sendEmailNotification(email);
  }
}
