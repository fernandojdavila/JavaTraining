package pojos;

public class GenericPojo implements Comparable {


    private String genericName;

    public GenericPojo(String genericName) {
        this.genericName = genericName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericPojo that = (GenericPojo) o;

        return genericName != null ? genericName.equals(that.genericName) : that.genericName == null;
    }

    @Override
    public int hashCode() {
        return genericName != null ? genericName.hashCode() : 0;
    }


    //Using the default compareTo method is NOT possible add a new item because always returns 0.
    @Override
    public int compareTo(Object o) {

        return this.getGenericName().compareTo(((GenericPojo) o).genericName);
    }

    public String getGenericName() {
        return genericName;
    }
}
