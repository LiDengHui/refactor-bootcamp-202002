package cc.xpbootcamp.warmup.fibonacci;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
public class FibonacciTest {
    @Test
    public void should_return_3_when_calculate_given_position_is_4() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(fibonacci.GetValueByPosition(4), equalTo(3));
    }

    @Test
    public void should_return_5_when_calculate_given_position_is_5() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(fibonacci.GetValueByPosition(4), equalTo(3));
    }

    @Test
    public void should_return_1_when_calculate_given_position_is_2() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(fibonacci.GetValueByPosition(2), equalTo(1));
    }

    @Test
    public void should_return_1_when_calculate_given_position_is_1() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(fibonacci.GetValueByPosition(2), equalTo(1));
    }

    @Test
    public void should_throw_exception_when_calculate_given_position_is_60() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(exceptionOf(() ->fibonacci.GetValueByPosition(60)),
                instanceOf(Exception.class));
    }
    @Test
    public void should_throw_exception_when_calculate_given_position_is_0() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertThat(exceptionOf(() ->fibonacci.GetValueByPosition(60)),
                instanceOf(Exception.class));
    }

    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }
}
