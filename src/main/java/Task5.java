public class Task5 {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int three = 3;
        boolean x1 = 1 < 3 && 1 < 2;
        boolean x2 = 2 > 1 && 2 < 3;
        if (x1) {
            System.out.println("1<2 b 1<3");
        }
        if (x2) {
            System.out.println("2>1 b 2<3");
        } else {
            System.out.println("3>1 b 1>2");
        }
    }
}
