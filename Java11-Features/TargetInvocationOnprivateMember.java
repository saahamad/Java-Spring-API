import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Outer{
	
	private void privateOuter() {
		System.out.println("Outer Private member...");
	}
	
	class Inner{
		
		Outer outer = null;
		public void publicInner() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			outer = new Outer();
			Method mObj= outer.getClass().getDeclaredMethod("privateOuter");
			mObj.invoke(outer);
		}		
	}
	Inner inner = new Inner();
}


public class TargetInvocationOnprivateMember {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
			new Outer().inner.publicInner();
	}

}
