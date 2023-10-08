package gc.garcol.javadesignpattern.core;

import java.util.function.Function;

@FunctionalInterface
public interface Function3<T1, T2, T3, R> {

  R apply(T1 t1, T2 t2, T3 t3);

  static <T1, T2, T3, R> Function3<T1, T2, T3, R> constant(R output) {
    return (t1, t2, t3) -> output;
  }

  static <T1, T2, T3, R> Function3<T1, T2, T3, R> of(Function3<T1, T2, T3, R> fn3) {
    return fn3;
  }

  default Function1<T1, Function1<T2, Function1<T3, R>>> curried() {
    return t1 -> t2 -> t3 -> apply(t1, t2, t3);
  }

  default <V> Function3<T1, T2, T3, V> andThen(Function<? super R, ? extends V> after) {
    return (t1, t2, t3) -> after.apply(apply(t1, t2, t3));
  }
}
