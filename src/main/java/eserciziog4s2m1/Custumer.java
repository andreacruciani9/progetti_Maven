package eserciziog4s2m1;

public class Custumer {
    private  long id;
    private String name;
    private int tier;

    public Custumer( long id,String name, int tier) {
        this.id=id;
        this.name = name;
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public int getTier() {
        return tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }




}

