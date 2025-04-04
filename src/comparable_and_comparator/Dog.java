package comparable_and_comparator;

import java.util.Arrays;

public class Dog implements Comparable {
	
	int age;
	
	String name,breed;
	
	Dog(String name,int age,String breed){
		
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	
	public void print() {
		
		System.out.println("Name: "+this.name+" || Age: "+this.age+" || Breed: "+this.breed);
	}
	
	@Override
	public int compareTo(Object o) {
		
		Dog d=(Dog)o;
		
		int nameCheck=this.name.compareToIgnoreCase(d.name);
		
		int ageCheck=this.age-d.age;
		
		return nameCheck==0 ? ageCheck : nameCheck;
	}
	
	public static void main(String[] args) {
		
		Dog[] arr=new Dog[3];
		
		
		arr[0]=new Dog("Jerry",4,"Labrador");
		
		arr[1]=new Dog("Spike",7,"Corgi");
		
		arr[2]=new Dog("Spike",11,"Husky");
		
		compareDogByBreed c=new compareDogByBreed();
		
		Arrays.sort(arr,c); // Sort method 
		
		for(Dog d : arr) {
			
			d.print();
		}
	}
  }
