package ExceptionHandlng;

public class ThrowAndThrows {
	 static void fun1() {
			try {
				fun2();
			}catch(Exception e) {
				System.out.println(e.getMessage()+" ");
			}
		}
	 static void fun2() throws ArrayIndexOutOfBoundsException {
		 boolean isDanger = true;
		 if(isDanger) {
			 throw new ArrayIndexOutOfBoundsException("Danger");
		 }
	 }
	 
}

