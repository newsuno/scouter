// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;


import java.util.Collection;

/**
 * An element matcher that matches a collection by its size.
 *
 * @param <T> The type of the matched entity.
 */
public class CollectionSizeMatcher<T extends Iterable<?>> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The expected size of the matched collection.
     */
    private final int size;

    /**
     * Creates a new matcher that matches the size of a matched collection.
     *
     * @param size The expected size of the matched collection.
     */
    public CollectionSizeMatcher(int size) {
        this.size = size;
    }

    @Override

    public boolean matches(T target) {
        if (target instanceof Collection) {
            return ((Collection<?>) target).size() == size;
        } else {
            int size = 0;
            for (Object ignored : target) {
                size++;
            }
            return size == this.size;
        }
    }

    @Override
    public String toString() {
        return "ofSize(" + size + ')';
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof CollectionSizeMatcher)) return false;
        final CollectionSizeMatcher<?> other = (CollectionSizeMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.size != other.size) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof CollectionSizeMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.size;
        return result;
    }
}
