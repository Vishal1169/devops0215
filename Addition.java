public class Addition {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = add(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}