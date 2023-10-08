package gc.garcol.javadesignpattern.core;

import java.util.function.Function;

@FunctionalInterface
public interface Function0<R> {

  R apply();

  static <R> Function0<R> constant(R output) {
    return () -> output;
  }

  static <R> Function0<R> of(Function0<R> fn0) {
    return fn0;
  }

  default Function0<R> curried() {
    return this;
  }

  default <V> Function0<V> andThen(Function<? super R, ? extends V> after) {
    return () -> after.apply(apply());
  }
}
