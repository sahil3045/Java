class kaprekar {
    static boolean isKaprekar(int n) {
        if (n == 1) return true;
        int sq = n * n;
        int numDigits = (int) Math.log10(sq) + 1;  

        for (int r = 1; r < numDigits; r++) {
            int divisor = (int) Math.pow(10, r);
            if (divisor == n) {
                continue;}

            int sum = (sq / divisor) + (sq % divisor);
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Kaprekar Numbers:");
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) System.out.print(i + " ");
        }
    }
}
