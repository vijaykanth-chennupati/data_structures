package java_;
class Student {
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class Arrayobjects{
	public static void main(String[] args)
	{
		
		Student[] arr;
		arr = new Student[3];
		arr[0] = new Student(1, "vijay");
		arr[1] = new Student(2, "kanth");
		arr[2] = new Student(3, "Chennupati");

		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i].roll_no + " "+ arr[i].name);
		}
	}
}
