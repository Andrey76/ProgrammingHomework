package ua.org.oa.a.andrew.Practice3Cinema;


public class Entyty<T> {
   private T id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entyty<?> entyty = (Entyty<?>) o;

        return id != null ? id.equals(entyty.id) : entyty.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entyty{" +
                "id=" + id +
                '}';
    }
}
