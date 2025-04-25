class CourseCost{
	public void CoursePrice(CousesList Course)
	{
		if(Course==CousesList.AIML){
			System.out.println("The Cousre\t"+Course+"\tPrice is Rs.10000");
		}
		else if(Course==CousesList.SQL){
			System.out.println("The Cousre\t"+Course+"\tPrice is Rs.15000");
		}
		else if(Course==CousesList.COREJAVA){
			System.out.println("The Cousre\t"+Course+"\tPrice is Rs.7000");
		}
		else if(Course==CousesList.ADVJAVA){
			System.out.println("The Cousre\t"+Course+"\tPrice is Rs.13000");
		}
		else if(Course==CousesList.REACT){
			System.out.println("The Cousre\t"+Course+"\tPrice is Rs.5000");
		}
		else {
			System.out.println("Sorry we dont have a information Regarding searching Course");
		}
}
}