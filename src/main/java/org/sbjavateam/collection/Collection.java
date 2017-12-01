package org.sbjavateam.collection;

import java.util.function.Predicate;

public interface Collection<E> {

    Long size();

    /**
     * mainly collections contains size and takes the size don't need any extra efforts ,
     * in size case is empty it's simple operation to compare size == 0,
     * If collection doesn't contains the size
     */
    default boolean isEmpty(){
        return size() == 0;
    }

    boolean isPresent(E object);

    void applyIfPresent(E object , Predicate<E> predicate);

}
