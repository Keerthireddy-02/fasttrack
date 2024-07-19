package p2;
import p1.*;
public class B
{
public static void main(String args[])
{
A obj = new A();
//trying to access private method of another class
 obj.display();
}
}