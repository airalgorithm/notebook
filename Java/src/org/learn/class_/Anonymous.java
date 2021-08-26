package org.learn.class_;


public class Anonymous {
    public static void main(String[] args) {
        CellPhone iphone = new CellPhone();
        iphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！");
            }
        });

        iphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了! ");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}