package org.learn.designpattern;

public class SingleTon {
    public static void main(String[] args) {
        GirlFriend fanbb = GirlFriend.getGirlFriend("范冰冰");
        GirlFriend libb = GirlFriend.getGirlFriend("李冰冰");
        System.out.println(fanbb);
        System.out.println(libb);
    }
}


class GirlFriend {
    private String name;
    private static GirlFriend gf;

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getGirlFriend(String name) {
        if (gf == null) {
            gf = new GirlFriend(name);
        }
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
