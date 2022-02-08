package c3.ch02;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {
        
    }
}

class Human extends Animal {

    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBoos() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBoos();
			}
			else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	
    public static void main(String[] args) {
        
    	Animal ha = new Human();
    	Animal ta = new Tiger();
    	Animal ea = new Eagle();
    	
    	AnimalTest test = new AnimalTest();
    	test.moveAnimal(ha);
    	test.moveAnimal(ta);
    	test.moveAnimal(ea);
    	
    	ArrayList<Animal> list = new ArrayList<Animal>();
    	list.add(ha);
    	list.add(ta);
    	list.add(ea);
    	
    	for(Animal a : list) {
    		a.move();
    		System.out.println(a.getClass().getName());
    	}
    	
    	test.testDownCasting(list);
    }
}