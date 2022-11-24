import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
        public static void main(String[] args) {
                String strNum1, strNum2;
                Double douNum1, douNum2;
                String strNotification;

                strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                                JOptionPane.INFORMATION_MESSAGE);
                douNum1 = Double.parseDouble(strNum1);

                strNum2 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                                JOptionPane.INFORMATION_MESSAGE);
                douNum2 = Double.parseDouble(strNum2);

                strNotification = "Sum: " + (douNum1 + douNum2) + "\n"
                                + "Difference: " + (douNum1 - douNum2) + "\n"
                                + "Product: " + (douNum1 * douNum2) + "\n"
                                + "Quotient: " + (douNum1 / douNum2);

                JOptionPane.showMessageDialog(null, strNotification, "Calculation", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
}
