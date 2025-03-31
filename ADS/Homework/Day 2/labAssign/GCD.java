 import java.util.*;

class GCD {
    static int gcd(int x, int y) {
        if (x % y== 0) {
            return y;
        } else {
            return gcd(y, x%y);
        }
    }

    public static void main(String args[]) {
        System.out.println(gcd(11,23));
    }
}

// explanation:
// 1)In gcd method take to number as parameter which we want to calculate gcd then
// 2)if(base condition) block check both value module is == 0 then return that element else (y,x%y) call recursively till getting if
// block and gcd value