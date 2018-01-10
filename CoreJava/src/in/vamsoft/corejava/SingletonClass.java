package in.vamsoft.corejava;

public class SingletonClass {
	private static SingletonClass ob = new SingletonClass();
  private SingletonClass(){
  	
	}
	public static SingletonClass getSingleton(){
	 return ob;
  }

}
