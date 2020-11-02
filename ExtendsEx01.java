class A {
	public int num = 2;
}

class B extends A{
	public int num = 5;
}

class C extends B{
	public int num = 7;
}

class ExtendsEx01 {
	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		A a = new A();

		System.out.println(c.num);
		System.out.println(b.num);
		System.out.println(a.num);
	}
}