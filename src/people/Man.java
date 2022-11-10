package people;

public abstract class Man {
    private String name;

    public Man(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        int result = 16;
        result = result * this.getName().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Man man = (Man) o;
        return this.getName().equals(man.getName());
    }
}
