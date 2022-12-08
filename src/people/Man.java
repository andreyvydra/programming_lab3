package people;

public abstract class Man {
    private String name;
    private final Head head = new Head(true);


    public Man(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Head getHead() {
        return head;
    }

    public void setHeadCombed(boolean combed) {
        this.getHead().setCombed(combed);
    }

    public void doComb() {
        this.setHeadCombed(true);
        System.out.println(this + " причёсывется");
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

    public class Head {
        private boolean combed;

        public Head(boolean combed) {
            this.setCombed(combed);
        }

        public boolean isCombed() {
            return combed;
        }

        public void setCombed(boolean combed) {
            this.combed = combed;
        }

        public void printStatus() {
            if (this.isCombed()) {
                System.out.println(Man.this.getName() + " привел причёску в отличное состояние");
            } else {
                System.out.println("У " + Man.this.getName() + " один вихор торчит на самой макушке, " +
                        "но видно, что он старался");
            }
        }
    }
}