public class PrintJava extends ConsoleProgram 
{

    public void run() {
        printK();
        System.out.println();
        printA();
        System.out.println();
        printR();
        System.out.println();
        printE();
        System.out.println();
        printL();
    }

    private void printK() {
        System.out.println("*   * ");
        System.out.println("* *   ");
        System.out.println("**    ");
        System.out.println("* *   ");
        System.out.println("*   * ");
    }

    private void printA() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
    }

    private void printR() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("*    *");
        System.out.println("*     *");
    }

    private void printE() {
        System.out.println("*****");
        System.out.println("*    ");
        System.out.println("*****"); // Full row of five asterisks for the middle
        System.out.println("*    ");
        System.out.println("*****");
    }

    private void printL() {
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*    ");
        System.out.println("*****");   
    }
}
