import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class file {
	
	public void createFile(){
		
		try {
			File myObjNew = new File("createMe.txt");
			
			if(myObjNew.createNewFile()){
				System.out.println("File Successfully created"+myObjNew.getAbsolutePath());
			}else{
				System.out.println("File already exists"+myObjNew.getAbsolutePath());
			}
		} catch(IOException e){
			System.out.println("An error occurred");
			e.printStackTrace();
		}		
	}
	
	public void writeFile(){
		
		try{
			
			File myObjNew = new File("C:\\Users\\pperiyas\\Desktop\\createMe.txt");
			FileWriter myWriter = new FileWriter("C:\\Users\\pperiyas\\Desktop\\createMe.txt");
			myWriter.write("This file is written using Java FileWriter");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		}catch(IOException e){
			System.out.println("An error Occurred");
			e.printStackTrace();
		}
	}
	
	public void readFile(){
		try {
				File myObjNote = new File("C:\\Users\\pperiyas\\Desktop\\notes.txt");
				Scanner myReader = new Scanner(myObjNote);
				while(myReader.hasNextLine()){
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			}catch(FileNotFoundException e){
				System.out.println("An error occurred");
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		
		File myObj = new File("C:\\Users\\pperiyas\\Desktop\\notes.txt");
		System.out.println(myObj.exists());
		System.out.println(myObj.getName());
		System.out.println(myObj.length());
		System.out.println(myObj.getAbsolutePath());
		//System.out.println(myObj.list());
		
		file myFile = new file();
		//myFile.createFile();
		//myFile.writeFile();
		myFile.readFile();
		
	}
	
}
