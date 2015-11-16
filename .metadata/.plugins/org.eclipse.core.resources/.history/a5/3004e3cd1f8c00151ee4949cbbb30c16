import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Inventory
{
	
	private HashMap<String, Integer> hmap;
	private ArrayList<Sellable> aList;
	
	
		public Inventory()
		{
			aList = new ArrayList<Sellable>();
			
			Sellable a = new Snack("BBQ Chips", 2.99);
			Sellable b = new Snack("Pez-incals", 1.50);
			Sellable c = new Snack("Swazzle Stars", 7.99);
			Sellable d = new Snack("Zebra Cakes", .99);
			Sellable e = new Snack("Garbage For Your Face", 49.50);
			
			Sellable f = new Produce("Leak", 1, 1.23);
			Sellable g = new Produce("Cabbage", 1, 1.89);
			Sellable h = new Produce("Broccoli", 1, 2.50);
			Sellable i = new Produce("Rutabega", 1, 10.50);
			Sellable j = new Produce("Other Green Things", 1, 1.50);
			
			Sellable cc = new Coupon("50 cents off your order", -.5);
			
			aList.add(a);
			aList.add(b);
			aList.add(c);
			aList.add(d);
			aList.add(e);
			
			aList.add(f);
			aList.add(g);
			aList.add(h);
			aList.add(i);
			aList.add(j);
			
			aList.add(cc);
			
			hmap = new HashMap<String,Integer>();
			
			
			
			hmap.put(a.getId(), 15);
			hmap.put(b.getId(), 24);
			hmap.put(c.getId(), 3);
			hmap.put(d.getId(), 45);
			hmap.put(e.getId(), 76);
			
			hmap.put(f.getId(), 12);
			hmap.put(g.getId(), 86);
			hmap.put(h.getId(), 22);
			hmap.put(i.getId(), 55);
			hmap.put(j.getId(), 10);
			
			hmap.put(cc.getId(), 999);
		}
		public void printAll()
		{
//			for(int i=0; i<aList.size(); i++)
//			{
//				Iterator it = hmap.keySet().iterator();
//				
//				System.out.println(aList.get(i)+" Amt:");
//			}
			
			for(Sellable a:aList)
			{
				System.out.println(a+"| Quantity: "+hmap.get(a.getId()));
			}
		}
		public void sortByName()
		{
			Collections.sort(aList, new SellableNameComparator());
		}
		public void sortByPrice()
		{
			Collections.sort(aList, new SellablePriceComparator());
		}
		public Sellable findById(String Id)
		{
			{
				for(int i = 0; i<aList.size(); i++)
				{
					//String movieName = movs[i].getMovieName();
					//System.out.println(movieName);
					if (aList.get(i).getId().equalsIgnoreCase(Id))
					{
						Sellable s = (aList.get(i));
						return s.clone();
					}
				}
				System.out.println("Not Found");
				return null;
			}
		}
		public Sellable findByName(String Name)
		{
			{
				for(int i = 0; i<aList.size(); i++)
				{
					//String movieName = movs[i].getMovieName();
					//System.out.println(movieName);
					if (aList.get(i).getName().equalsIgnoreCase(Name))
					{
						Sellable s = (aList.get(i));
						return s.clone();
					}
				}
				System.out.println("Not Found");
				return null;
			}
		}
		public void add(Sellable s)
		{
			aList.add(s);
			hmap.put(s.getId(), 1);
		}
		public Sellable remove(Sellable s)
		{
			{
				for(int i = 0; i<aList.size(); i++)
				{
					//String movieName = movs[i].getMovieName();
					//System.out.println(movieName);
					if (aList.get(i).getId().equals(s.getId()))
					{
						Sellable x = (aList.get(i));
						aList.remove(aList.get(i));
						hmap.remove(s.getId());
						return x;
					}
				}
				System.out.println("Not Found");
				return null;
			}
			
			
		}
		public boolean decrementStock(String Name)
		{
			try
			{
				
				hmap.put(Name, hmap.get(Name) - 1);
				return true;
			}
			catch(NullPointerException d)
			{
				System.out.println("No such item");
				return false;
			}
			
		}
		public boolean decrementStock(Sellable s)
		{
			try
			{
				hmap.put(s.getId(), hmap.get(s.getId()) - 1);
				return true;
			}
			catch(NullPointerException d)
			{
				d.printStackTrace();
				System.out.println("No such item NullP");
				return false;
			}
		}
		public boolean incrementStock(Sellable s)
		{
			try
			{
				hmap.put(s.getId(), hmap.get(s.getId()) + 1);
				return true;
			}
			catch(NullPointerException d)
			{
				System.out.println("No such item");
				return false;
			}
		}
		
		

		
		
		
		public static void main(String[] args) 
		{
			Inventory inv = new Inventory();
			inv.printAll();
			
			inv.sortByName();
			System.out.println("======SortName======");
			inv.printAll();
			
			
			inv.sortByPrice();
			System.out.println("======SortPrice=======");
			inv.printAll();
			
			System.out.println("======findId=======");
			System.out.println(inv.findById("Sna105"));
			
			System.out.println("======findName======");
			System.out.println(inv.findByName("BBQ Chips"));
			
			System.out.println("======DecrString======");
			inv.printAll();
			System.out.println(inv.decrementStock("Sna105"));
			inv.printAll();
			
			
			
		//Prints out the amount of Cerberos there are
		//System.out.println(hmap.get("Cerberos"));
	}
}
