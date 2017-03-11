/**
 * Created by Анастасия on 22.01.2017.
 */
public class Triangle {
    double a;
    double b;
    double c;
    @Override
    public String toString() {
        return "Triangle{"+ a+","+b+","+c+"}";
    }

    Triangle(Point a,Point b, Point c){
        this.a=a.getLength(b);
        this.b=b.getLength(c);
        this.c=c.getLength(a);
    }
    boolean isEquilateral(){
        return this.a==this.b&&this.a==this.c;
        }
    }

