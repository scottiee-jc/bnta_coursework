public class Main {

    public static void main(String[] args) {
        int priceOfBook = 6;
        int amountInWallet = 5;
        int booksInStock = 10;

        if (priceOfBook >= amountInWallet && booksInStock > 0 ){
                System.out.println("You've got enough to pay for the book. Your Payment is being processed.");
                System.out.println("Thanks for shopping with us!");
        } else {
            System.out.println("Sorry, you do not have enough funds to clear the payment request.");
            System.out.println("Please ensure you have enough funds and then try again later.");
        }


    }

}
