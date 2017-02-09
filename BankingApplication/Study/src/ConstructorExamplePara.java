
public class ConstructorExamplePara {
	
	int id;
	String name;
	
	ConstructorExamplePara(int i,String n){
		id=i;
		name=n;
		
	}
	
	void display(){System.out.println(id+" "+name);}
	
		
	public static void main(String[] args) {
		
		ConstructorExamplePara c1= new ConstructorExamplePara(1,"Ammu");
		ConstructorExamplePara c2= new ConstructorExamplePara(2,"Aishu");
		c1.display();
		c2.display();
		

	}

}
