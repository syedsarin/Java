package multiThreading_feb17;

public class EducationInstitute {
	Course course[];
	Offer offer[];

	public EducationInstitute(Course[] course, Offer[] offer) {
		super();
		this.course = course;
		this.offer = offer;
	}

	public Course[] getCourse() {
		return course;
	}

	public Offer[] getOffer() {
		return offer;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		for(int i=0;i<course.length;i++)
		{
			if(courseId==course[i].getCourseId())
			{
				System.out.println(studentName+" Enrolled in "+course[i].getCourseName());
			}
		}
	}
}
