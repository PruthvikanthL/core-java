class CourseCostRunner{
	public static void main(String[] args){
		CourseCost coursecost=new CourseCost();
		coursecost.CoursePrice(CousesList.AIML);
		coursecost.CoursePrice(CousesList.SQL);
		coursecost.CoursePrice(CousesList.COREJAVA);
		coursecost.CoursePrice(CousesList.ADVJAVA);
		coursecost.CoursePrice(CousesList.REACT);

	}
}