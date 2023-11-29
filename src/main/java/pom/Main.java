package pom;

import java.util.*;

public class Main extends Human {
    public static void main(String[] args) {
    }


    @Override
    public void print() {

    }
}

abstract class Human implements House {
    public void scan() {
    }
}

interface House {
    void print();
}