public class Equation {//квадратный корень
    //d<0 - нет решения
    //d=0 - одно решение
    //d>0 - два решения
    //d=b*b-4*a*c
    private double a;
    private double b;
    private double c;
    private int n;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
public int rootNumber(){
double d=b*b-4*a*c;
if(d>0){
    n=2;
}else {
    if(d==0){
        n=1;
    }else {
        n=0;
    }
}
    return n;
}
}
