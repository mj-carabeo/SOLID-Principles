public class OrderTest {
  public static void main(String[] args) {
    OrderCalculator orderCalculator = new OrderTotalCalculator();
    OrderPlacer orderPlacer = new OrderPlacerImpl();
    InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
    EmailNotifier emailNotifier = new EmailNotifierImpl();

    OrderManager orderManager = new OrderManager(orderCalculator, orderPlacer, invoiceGenerator, emailNotifier);
    orderManager.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
  }
}
