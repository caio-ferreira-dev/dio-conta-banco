import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Creating the scanner object to read terminal inputs.
        Scanner ScanObj = new Scanner(System.in);
    
        // Getting terminal inputs data.
        System.out.println("Por favor, digite o nome do cliente !");
        String accountOwnerName = ScanObj.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int accountNum = ScanObj.nextInt();

        // Making sure that after reading the accountNum the scanner will pass to the next line
        ScanObj.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String accountAgency = ScanObj.nextLine();

        System.out.println("Por favor, digite o valor à depositar na conta !");
        Float accountBalance = ScanObj.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", 
            accountOwnerName,  accountAgency, accountNum, accountBalance);

        ScanObj.close();
    }
}
