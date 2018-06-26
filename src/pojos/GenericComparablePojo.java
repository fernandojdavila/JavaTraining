package pojos;

public class GenericComparablePojo implements Comparable {


    private String genericName;

    public GenericComparablePojo(String genericName) {
        this.genericName = genericName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericComparablePojo that = (GenericComparablePojo) o;

        return genericName != null ? genericName.equals(that.genericName) : that.genericName == null;
    }

    @Override
    public int hashCode() {
        return genericName != null ? genericName.hashCode() : 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
