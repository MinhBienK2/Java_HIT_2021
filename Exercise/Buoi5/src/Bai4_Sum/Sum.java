package Bai4_Sum;

import java.util.Scanner;

public class Sum<N> {
    private N a;
    private N b;
    public Sum() {
    }

    public Sum(N a, N b) {
        this.a = a;
        this.b = b;
    }

    public N getA() {
        return a;
    }

    public void setA(N a) {
        this.a = a;
    }

    public N getB() {
        return b;
    }

    public void setB(N b) {
        this.b = b;
    }
}
