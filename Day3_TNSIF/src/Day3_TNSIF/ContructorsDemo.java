package Day3_TNSIF;



public class ContructorsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer(1, "rakshita", "raichur");

		//c.setCustomerId(1);
	    //c.setCustomerName("rakshita");
		//c.setCustomerCity("raichur");

		//System.out.println(c.getCustomerCity());
		//System.out.println(c.getCustomerId());
		//System.out.println(c.getCustomerName());

		// When we run following line without setting ToString in Instance (Customer.java) It will print hash code
		 System.out.println(c);
		 c.display();
	}
}
