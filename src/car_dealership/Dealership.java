package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		cust1.setName("Jim Jones");
		cust1.setAddress("1200 Bowling Lane Jonestown, IN 47408");
		cust1.setCashOnHand(4300);
		cust1.setCredit("GOOD");

		Employee emp1 = new Employee();
		emp1.setEmpID(13);
		emp1.setEmpName("Roger Wilco");
		emp1.setEmpCommission(2000);

		Vehicle newVehicle = new Vehicle();
		newVehicle.setRetailPrice(29500);
		newVehicle.setListPrice(21200);
		newVehicle.setMake("Ford");
		newVehicle.setModel("Exploder");
		newVehicle.setYear(2015);
		newVehicle.setDriveTrain("2WD");
		newVehicle.setDoors(4);

		handleCustomer(cust1, newVehicle);
		
	}

public static void handleCustomer(Customer cust, Vehicle vehicle) {
		
	double totalPrice;
	totalPrice = vehicle.getRetailPrice() - cust.getCashOnHand();
	
		if (cust.getCredit().equalsIgnoreCase("GOOD")) {
			runCreditHistory(cust.getCredit());
			System.out.println("Customer: " + cust.getName());
			System.out.println("Make: " + vehicle.getMake());
			System.out.println("Model: " + vehicle.getModel());
			System.out.println("Amount approved: " + totalPrice);
			System.out.println("Downpayment: " + cust.getCashOnHand());
		} else if (cust.getCredit().equalsIgnoreCase("FAIR")) {
			System.out.println("Limited financing approved for " + cust.getName());
		} else {			
			System.out.println("We cannot provide financing at this time.");
		}
}

	public static void runCreditHistory(String credit) {
		switch (credit) {
		case "POOR":
			System.out.println("You're credit needs some improvement before we can consider financing today.");
			break;
		case "FAIR":
			System.out.println("You're credit is decent. We have a wonderful selection for you to look at.");
			break;
		case "GOOD":
			System.out.println("You are approved! You can purchase anything on the lot.");
		}
	}

	public void processTransaction(Customer customer, Vehicle vehicle) {

	}

}
