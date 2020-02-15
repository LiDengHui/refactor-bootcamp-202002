package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacci {
    public int GetValueByPosition(int position) throws Exception {
        if(position > 50 || position <= 0) {
            throw new Exception("位数必须大于0小于五十");
        }
        return calculate(position) ;
    }

    private int calculate(int p) {
        if(p <= 2) {
            return 1;
        }
        return calculate(p - 1) + calculate(p - 2);
    }
}
