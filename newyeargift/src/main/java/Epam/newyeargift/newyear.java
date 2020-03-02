package Epam.newyeargift;
import java.util.*;
public class newyear {
			static Scanner sc = new Scanner(System.in);
			static Map<String, Integer> map = new HashMap<String, Integer>() 
			{{ 
                 put("perk", 0); put("kitkat", 0); put("DairyMilk", 0); put("CarrotHalwa", 0); put("MysorePak", 0); put("Rasgulla", 0);
			}};
			//main method
			public static void main(String args[]) {
				//creating sweet objects
				Sweet CarrotHalwa = new Sweet();
				CarrotHalwa.setWeight(30);
				Sweet MysorePak = new Sweet();
				MysorePak.setWeight(45);
				Sweet Rasgulla = new Sweet();
				Rasgulla.setWeight(25);
				perk dc = new perk();
				kitkat g = new kitkat();
				DairyMilk c = new DairyMilk();
				//taking input from user
				char areMore = 'y';
				System.out.println("\n1. perk\n2. kitkat\n3. DairyMilk\n4. CarrotHalwa\n5. MysorePak\n6. Rasgulla");
				while (areMore == 'y') {
					System.out.println("Select what you want: ");
			        int n = sc.nextInt();
			        switch(n) {
			        case 1: map.put("perk", map.get("perk")+1); break;
			        case 2: map.put("kitkat", map.get("kitkat")+1); break;
			        case 3: map.put("DairyMilk", map.get("DairyMilk")+1); break;
			        case 4: map.put("CarrotHalwa", map.get("CarrotHalwa")+1); break;
			        case 5: map.put("MysorePak", map.get("MysorePak")+1); break;
			        case 6: map.put("Rasgulla", map.get("Rasgulla")+1); break;
			        }
			        System.out.println("Are there more sweets or chocolates? (y/n): ");
			        areMore = sc.next().charAt(0);
				}
				sc.close();
				//calculating total weight and number of candies
				double totalWt = dc.calcWeight(map.get("perk")) + g.calcWeight(map.get("kitkat")) + c.calcWeight(map.get("DairyMilk"));
				totalWt += Rasgulla.calcWeight(map.get("Rasgulla")) + MysorePak.calcWeight(map.get("MysorePak")) + CarrotHalwa.calcWeight(map.get("CarrotHalwa"));
				System.out.println("Total gift weight: " + totalWt);
				int quantity = 0;
				System.out.println("Number of individual candies: ");
				for (String candy : map.keySet()) {
					System.out.println(candy + " : " + map.get(candy));
					quantity += map.get(candy);
				}
				System.out.println("Total number of candies: " + quantity);
			}
	}
		



	
	

