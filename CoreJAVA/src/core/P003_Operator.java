package core;

//1.Assignment(=,+=,-=*=,/=)
//2.Arithmetic(+,-,*,/,%)
//3.Logical(&&,||,!)
//4.Relational(>,<,>=,<=,==,!=)
//5.Unary(++,--)
public class P003_Operator {
	public static void main(String[] args) {
		int i = 1, j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);

		i += 3;// i = i+3;
		System.out.println(i);// 4
		i += j;

		i = +j;
		System.out.println("i = " + i);

		int k = 1, l = 2;
		l = ++k;
		System.out.println("l = "+l);
		
		System.out.println(k);

	}
}
