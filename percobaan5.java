class A {}
class B extends A {}
class C extends B {}
public class percobaan5
{
void myOverload(A a)
{
System.out.println("Overload.myOverload(A a)");
}
void myOverload(B b)
{
System.out.println("Overload.myOverload(B b)");
}
public static void main(String[] args)
{
percobaan5 o = new percobaan5();
C c = new C();
o.myOverload(c);
/*
*statement di atas akan menjalankan myOverload(B
b), karena
*method tersebut lebih "dekat" dengan method
yang dicari
*bila dibandingkan dengan myOverload(A a)
*/
}}