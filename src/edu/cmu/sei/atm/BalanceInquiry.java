package edu.cmu.sei.atm;

import edu.cmu.sei.atm.ui.Screen;
import edu.cmu.sei.atm.ui.Keypad;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

   
// Represents a balance inquiry ATM transaction
public class BalanceInquiry extends Transaction {
	private static final Logger logger = LogManager.getLogger("HelloWorld");
    private Keypad keypad; // reference to keypad

    // BalanceInquiry constructor
    public BalanceInquiry(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase, Keypad atmKeypad) {
        super(userAccountNumber, atmScreen, atmBankDatabase);
        keypad = atmKeypad;
    } // end BalanceInquiry constructor

    // performs the transaction
    public void execute() {
        logger.info("This is a test\nlog over two lines");

        // get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // get the available balance for the account involved
        double availableBalance =
                bankDatabase.getAvailableBalance(getAccountNumber());

        // get the total balance for the account involved
        double totalBalance =
                bankDatabase.getTotalBalance(getAccountNumber());

        // display the balance information on the screen
        while (true) {
            screen.clearMessageScreen();
            screen.displayMessageLine("\nBalance Information:");
            screen.displayMessage("   - Available balance: ");
            screen.displayDollarAmount(availableBalance);
            screen.displayMessage("\n   - Total balance:      ");
            screen.displayDollarAmount(totalBalance);
            screen.displayMessageLine("\n0 - Main menu");
            if (keypad.getInput() != 0) {
                screen.displayMessageLine("\nIvalid selection. Try again.");
                delay(1000);
            } else {
                break;
            }
        }

    } // end method execute
} // end class BalanceInquiry
/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
