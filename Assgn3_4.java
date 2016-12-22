public class Assgn3_4
{   
	String name;
	String usn;
	String branch;
	int marks;

//Constructor of the class Assgn3_4	
	Assgn3_4(String n,String u, String b, int m)
	{	
		name=n;
		usn=u;
		branch=b;
		marks=m;
	}

//Displays students deatails
	void display()		
	{
		String res;
		if(marks>85 && marks<100)
			res="Passed with distinction";
		else if(marks>60 && marks<85)
			res="Passed with first class";			//To calculate result based on the marks 
		else if(marks>50 && marks<60)				//       scored by the student
			res="Passed with second class";
		else if(marks>35 && marks<50)
			res="Passed with third class";
		else
			res="Failed";
		System.out.println("Name: "+name+"\tUSN: "+usn+"\tBranch: "+branch+"\tResult: "+res);
	}

	public static void main(String[] args)
	{
		Assgn3_4 s1=new Assgn3_4("Karthik","1PI13IS115","ISE",83);		//s1 object creation
		Assgn3_4 s2=new Assgn3_4("Akash","1PI13IS005","ISE",29);		//s2 object creation
		Assgn3_4 s3=new Assgn3_4("Ramesh","1PI13CS104","CSE",87);		//s3 object creation

		s1.display();		//Function call of display with s1 object
		s2.display();		//Function call of display with s2 object
		s3.display();		//Function call of display with s3 object
	}
}
