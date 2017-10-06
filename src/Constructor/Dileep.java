package Constructor;

public class Dileep {
	
	String name;
    int id;

Dileep(String name,int id) 
{
	// TODO Auto-generated constructor stub
	this.name=name;
	this.id=id;
}
void display()
{System.out.println(name+" "+id);}

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Dileep s1= new Dileep("dilip",100);
			Dileep s2= new Dileep("raju",101);
			s1.display();
			s2.display();
		}


}
