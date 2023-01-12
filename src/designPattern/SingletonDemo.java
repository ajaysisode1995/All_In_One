package designPattern;

public class SingletonDemo {
	private static SingletonDemo instance=null;
	
	
	
	private SingletonDemo() {
		
	}
	private static SingletonDemo getFactory() {
		if (instance==null) {
			return instance=new SingletonDemo();
		}
		return instance;
	}
	public static void main(String[] args) {
		SingletonDemo s1=new SingletonDemo();
		SingletonDemo s2=new SingletonDemo();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
