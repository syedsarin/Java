package multiThreading_feb17;

public class Main {
	public static void main(String[] args) throws Exception {
		Course [] courses = new Course[3];
		courses[0] = new Course(1, "Math", 1200);
		courses[1] = new Course(2, "Science", 900);
		courses[2] = new Course(3, "English", 1000);
		
		Offer [] offers = new Offer[2];
		offers[0] = new Offer("Special discount: Get 20% off on all courses!");
		offers[1] = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		
		EducationInstitute e1 = new EducationInstitute(courses, offers);
		Student syed = new Student("Syed", e1);
		Student sarin = new Student("Sarin", e1);
		Student mehdi = new Student("Mehdi", e1);
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Available Courses :");
				syed.viewCoursesAndFees();
				syed.viewOffers();
				syed.enrollInCourse(1);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run()
			{
				System.out.println("Available Courses.");
				sarin.viewCoursesAndFees();
				sarin.viewOffers();
				sarin.enrollInCourse(2);
			}
		};
		
		Thread t3 = new Thread() {
			@Override
			public void run()
			{
				mehdi.viewCoursesAndFees();
				mehdi.viewOffers();
				mehdi.enrollInCourse(3);
				
			}
		};
		t1.start();
		t1.join();
		System.out.println("-------------------------------------------------");
		t2.start();
		t2.join();
		System.out.println("-------------------------------------------------");
		t3.start();
		
	}
}
