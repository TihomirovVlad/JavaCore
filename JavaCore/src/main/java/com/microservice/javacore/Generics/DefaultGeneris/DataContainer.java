package com.microservice.javacore.Generics.DefaultGeneris;

import java.util.function.Function;
import java.util.function.Predicate;

public class DataContainer<T> {
    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public static <T> DataContainer<T> of(T value) {
        return new DataContainer<T>(value);
    }

    public DataContainer<T> filter(Predicate<T> predicate) {
        if(value != null && predicate.test(value)) {
            return DataContainer.of(value);
        }
        return DataContainer.of(null);
    }

        public <R> DataContainer<R> map(Function<T, R> mapper) {
            if (value!=null) {
                return DataContainer.of(mapper.apply(value));
            }
            return DataContainer.of(null);
        }
}
