package practice_5;
import java.util.Random;
public class Foonction {
    public static int Task_4(int st, int fn, int k, int count_command, int flag){
        if (st == fn && k == count_command){
            return 1;
        }
        if (st > fn || count_command > k) {
            return 0;
        }
        int s = 0;
        for (int i = flag; i < 10; ++i){
            s += Task_4(st + i, fn, k, count_command + 1, 0);
        }
        return s;
    }
    public static int Task_5(int n){
        if (n != 0){
            return n % 10 + Task_5(n / 10);
        }
        return 0;
    }
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static int pow_mod_s(int x, int pow, int s){
        if (pow == 0){
            return 1;
        }
        if (pow % 2 == 1){
            return x * pow_mod_s(x, pow - 1, s) % s;
        } else{
            int y = pow_mod_s(x, pow / 2, s);
            return y * y % s;
        }
    }
    public static boolean Task_6(int x){
        Random random = new Random();
        if(x == 2)
            return true;
        for(int i = 0; i < 100; ++ i){
            int a = (random.nextInt(2147483647) % (x - 2)) + 2;
            if (gcd(a, x) != 1)
                return false;
            if(pow_mod_s(a, x-1, x) != 1)
                return false;
        }
        return true;
    }

    public static boolean Task_8(String s, int i, int len){
        if (i >= len/2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(len - i - 1)){
            return false;
        }
        return Task_8(s, i + 1, len);
    }
    public static int Task_9(int a, int b, boolean flag){
        if (a == 0 && b == 0){
            return 1;
        }
        if (a < 0 || b < 0){
            return 0;
        }
        int x = 0;
        int y = 0;
        if (flag){
            x = Task_9(a - 1, b, flag);
            y = Task_9(a, b - 1, false);
        } else{
            x = Task_9(a - 1, b, true);
        }
        return x + y;
    }
}
