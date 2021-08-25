package solidprinciples;

public class SingleResponsibility {
	
	//it's always a good time for a refresher on SOLID principles. 
	//Let's start with 'S', the Single Responsibility Principle, with this overview.
	 //It basically says that each class should have just one responsibility
	

}




class Persistent{
	
	
	void save() {
		//save data
	}
	
	void fetch() {
		
	}
	void delete() {
		
	}
	
	//thats wrong
	void loadFromServer() {
		
	}
	
}
