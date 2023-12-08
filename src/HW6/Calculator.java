package HW6;

public class Calculator {

    public int powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒意義");
        }

        if (y < 0 || (y > 0 && x == 0)) {
            throw new CalException("次方為負值");
        }

        // Calculate x^y
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }
}
