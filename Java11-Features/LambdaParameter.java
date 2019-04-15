
interface Machine{

	String getConfiguration(double price);
}

class LambdaParameter{

	static final String PROCESSOR ="Core i7";
	static final int HARD_DISK = 500;
	static final int RAM = 4;

public static void main(String args[])throws Exception{


	Machine machine = (var price) -> "Machine:\n Processor:"+PROCESSOR+"\n Hard Disk:"+HARD_DISK+"GB\n RAM:"+RAM+"GB";
	System.out.println(machine.getConfiguration(Integer.parseInt(args[0])));

	}
}
