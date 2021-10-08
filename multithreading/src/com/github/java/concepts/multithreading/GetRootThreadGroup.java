package com.github.java.concepts.multithreading;

public class GetRootThreadGroup {

    static ThreadGroup rootThreadGroup = null;

    public static void main(String[] args) {
        rootThreadGroup = getRootThreadGroup();
        System.out.println(rootThreadGroup.getName() + "- Parent : " + rootThreadGroup.getParent());
    }

    static ThreadGroup getRootThreadGroup() {
        if (rootThreadGroup != null)
            return rootThreadGroup;
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        System.out.println(tg.getName() + "| Parent : " + tg.getParent() + "| count : "+tg.activeCount());
        ThreadGroup ptg;
        while ((ptg = tg.getParent()) != null) {
            tg = ptg;
            System.out.println(tg.getName()+"- Parent : "+tg.getParent()+ "| count : "+tg.activeCount());
        }

        return tg;
    }
}
