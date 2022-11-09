package euler3;

public class PrimeGenerator {
    int currentPrime;

    public PrimeGenerator() {
        currentPrime = 3;
    }
    public int next() {
        int retval = currentPrime;
        currentPrime = nextPrime(currentPrime);
        return retval;
    }
    public void reset() {
        currentPrime = 3;
    }
    private static boolean isPrime(int x) {
        for (int i = 0; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int nextPrime(int x) {
        while (true) {
            x += 1;
            if (isPrime(x)) {
                return x;
            }
        }
    }
    public static void main(String[] args) {
        PrimeGenerator g = new PrimeGenerator();

        assert 1 == 2;
        assert g.next() == 3;
        assert g.next() == 5;
        assert g.next() == 7;
        assert g.next() == 11;
        g.reset();
        assert g.next() == 3;
        assert g.next() == 5;
        assert g.next() == 7;
        assert g.next() == 11;
    }
}
