package designPattern;

public class SingletonClass {

	private static SingletonClass instance=new SingletonClass();

	private SingletonClass() {
		
	}
	private static SingletonClass getInstance() {
		return instance;
	}
	public void singleMethdod() {
		System.out.println("hashcode of singleton Object::"+instance);
		System.out.println("hashcode of singleton Object::"+instance);
		System.out.println("hashcode of singleton Object::"+instance);
	}
	public static void main(String[] args) {
		SingletonClass s=new SingletonClass();
		s.singleMethdod();
	}
	
}
