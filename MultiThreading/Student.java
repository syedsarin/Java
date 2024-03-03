package multiThreading_feb17;

public class Student {
	String studentName;
	EducationInstitute institute;

	public Student(String studentName, EducationInstitute institue) {
		super();
		this.studentName = studentName;
		this.institute = institue;
	}

	public void viewCoursesAndFees() {
		System.out.println("Course Details.");
		Course[] courses = institute.getCourse();
		for(Course course : courses)
		{
		System.out.println(course.getCourseId()+ ": "+course.getCourseName()+": "+course.getCourseFee());	
		}
	}

	public void viewOffers() {
		Offer[] offers = institute.getOffer();
		for(Offer offer : offers)
		{
			System.out.println(offer.getOfferText());
		}
	}

	public void enrollInCourse(int courseId) {
			institute.enrollStudentInCourse(courseId, studentName);
	}
}
