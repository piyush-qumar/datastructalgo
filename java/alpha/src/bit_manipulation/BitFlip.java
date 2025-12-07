package bit_manipulation;

import static bit_manipulation.BitFlipSol.flipBits;

class BitFlipSol {
    public static int flipBits(int x, int y) {
        int ans = 0;
        int res = x ^ y;
        for(int i=0;i<32;i++) {
            ans = ans+ (res & 1);
            res = res>>1;
        }
        return ans;
    }
}
public class BitFlip {
    public static void main(String[] args) {
        int n = 10; // Example number
        int m = 7; // Example number to flip bits with

        int result = flipBits(n, m);
        System.out.println("Result after flipping bits: " + result);
    }
}

