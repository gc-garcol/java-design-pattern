package gc.garcol.javadesignpattern.core;

import java.util.function.Function;

@FunctionalInterface
public interface Function2<T1, T2, R> {

  R apply(T1 t1, T2 t2);

  static <T1, T2, R> Function2<T1, T2, R> constant(R output) {
    return (t1, t2) -> output;
  }

  static <T1, T2, R> Function2<T1, T2, R> of(Function2<T1, T2, R> fn2) {
    return fn2;
  }

  default Function1<T1, Function1<T2, R>> curried() {
    return t1 -> t2 -> apply(t1, t2);
  }

  default <V> Function2<T1, T2, V> andThen(Function<? super R, ? extends V> after) {
    return (t1, t2) -> after.apply(apply(t1, t2));
  }
}
