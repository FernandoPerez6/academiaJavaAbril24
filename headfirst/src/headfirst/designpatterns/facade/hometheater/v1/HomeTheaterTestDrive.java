package headfirst.designpatterns.facade.hometheater.v1;

public class HomeTheaterTestDrive {
	//CLIENTE
	public static void main(String[] args) {
		
		System.out.println("V1");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade();
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		System.out.println("*********************");
		homeTheater.endMovie();
	}
	
}
