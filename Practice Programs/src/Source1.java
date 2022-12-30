

public class Source1{
	public static void main(String[] args) throws Exception {
		Customer obj = new Customer("Steve","9898111111","9898vst");
		Validator val = new Validator();
		String CID = val.validateCID(obj);
		String mob = val.validateNo(obj);
		System.out.println("CID = "+CID);
		System.out.println("mob = "+mob);

	}
}

class Customer {
	String name;
	String mobile;
	String CID;
	public Customer(String name, String mobile, String CID) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.mobile=mobile;
		this.CID=CID;
	}
}

class Validator {
	public String validateCID(Customer c) throws Exception {
		String d[]=c.name.split("-");
		String first4=c.mobile.substring(0, 4);
		String last2=c.name.substring(c.name.length()-2, c.name.length());
		if(c.CID.startsWith(first4) && c.CID.endsWith(last2)) {
			return "Valid CID";
		}
		else {
			throw new InvalidCIDException("Invalid CID");
		}
	}
	public String validateNo(Customer c) throws InvalidMobileNoException {
		if(c.mobile.length()==10 && (c.mobile.startsWith("9") || c.mobile.startsWith("8") || c.mobile.startsWith("7") || c.mobile.startsWith("6"))) {
			return "Valid MobileNo";
		}
		else {
			throw new InvalidMobileNoException("Invalid MobileNo");
		}	
	}
}

class InvalidCIDException extends Exception{
	public InvalidCIDException(String msg) {
		super(msg);
	}
}
class InvalidMobileNoException extends Exception {
	public InvalidMobileNoException(String msg) {
		super(msg);
	}
}
