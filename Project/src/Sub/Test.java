package Sub;

interface funcInterface
{
	void abstractFun(int x);
}
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcInterface fobj=(int x)->System.out.println(2*x);
		fobj.abstractFun(10);

	}

}
