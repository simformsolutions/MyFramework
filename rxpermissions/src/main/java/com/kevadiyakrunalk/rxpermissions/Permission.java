package com.kevadiyakrunalk.rxpermissions;

/**
 * The type Permission.
 */
public class Permission {

    /**
     * The Name.
     */
    public final String name;

    /**
     * The Granted.
     */
    public final boolean granted;

    /**
     * Instantiates a new Permission.
     *
     * @param name    the name
     * @param granted the granted
     */
    public Permission(String name, boolean granted) {
        this.name = name;
        this.granted = granted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Permission that = (Permission) o;
        if (granted != that.granted)
            return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (granted ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                ", granted=" + granted +
                '}';
    }
}