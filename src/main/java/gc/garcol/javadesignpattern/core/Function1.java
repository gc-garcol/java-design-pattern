package gc.garcol.javadesignpattern.core;

import java.util.function.Function;

@FunctionalInterface
public interface Function1<T, R> {

  R apply(T input);

  static <T, R> Function1<T, R> constant(R output) {
    return input -> output;
  }

  static <T, R> Function1<T, R> of(Function1<T, R> fn1) {
    return fn1;
  }

  default Function1<T, R> curried() {
    return this;
  }

  default <V> Function1<T, V> andThen(Function<? super R, ? extends V> after) {
    return t1 -> after.apply(apply(t1));
  }
}
