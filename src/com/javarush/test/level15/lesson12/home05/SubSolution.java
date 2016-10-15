package com.javarush.test.level15.lesson12.home05;


import java.util.ArrayList;

/**
 * Created by pkaminskyi on 15.10.16.
 */
public class SubSolution extends Solution {

    SubSolution() {
    }

    SubSolution(Byte b) {
        super(b);
    }

    SubSolution(float f) {
        super(f);
    }

    public SubSolution(Integer integer) {
        super(integer);
    }

    public SubSolution(Double aDouble) {
        super(aDouble);
    }

    public SubSolution(Character character) {
        super(character);
    }

    protected SubSolution(String s) {
        super(s);
    }

    protected SubSolution(short sh) {
        super(sh);
    }

    protected SubSolution(double d) {
        super(d);
    }

    private SubSolution(Object o){

    }

    private SubSolution(int[] s){

    }

    private SubSolution(ArrayList a){

    }
}
