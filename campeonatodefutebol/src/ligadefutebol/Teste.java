package ligadefutebol;

public class Teste {
	public static void main(String[] args) {
		Clube time1 = new Clube("Crato");
		System.out.println(time1.toString());
		time1.ganhar(2);
		System.out.println(time1.toString());
		time1.empatar();
		System.out.println(time1.toString());
		time1.perder(-1);
		System.out.println(time1.toString());
	}
}
