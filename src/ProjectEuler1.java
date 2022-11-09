public class ProjectEuler1 {
    public static boolean is_three_five_multiple(int x) {
        if (x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (is_three_five_multiple(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
