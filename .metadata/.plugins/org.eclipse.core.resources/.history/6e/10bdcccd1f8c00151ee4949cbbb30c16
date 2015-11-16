
public class Date 
{
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		this.month=1;
		this.day=1;
		this.year=1900;
	}
	public Date(int month, int day, int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getMonth(){
        return month;
	}
	public int getDay(){
        return day;
	}
	public int getYear(){
        return year;
	}
	public void setMonth(int month)
	{
        if(month>12 || month<1)
        {
                System.out.println("Not a valid month setting to default");
                this.month=1;
        }
        else
        this.month=month;
	}
	public void setDay(int month, int day)
	{
		this.day=day;
//		switch(month) 
//		{
//			case 1: 
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				if(this.day >=1 && this.day <=31)
//					this.day=day;
//				else
//					System.out.println("Not a valid day setting to default");
//					this.day=1;
//				return;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				if(this.day >=1 && this.day <=30)
//					this.day=day;
//				else
//					System.out.println("Not a valid day setting to default");
//					this.day=1;
//				return;
//			case 2:
//				if(this.day >=1 && this.day <=28)
//					this.day=day;
//				else
//					System.out.println("Not a valid day setting to default");
//					this.day=1;
//				return;
//		}
	}
	public void setYear(int year)
	{
//		int temp = year;
//		temp = String.valueOf(1000).length();
//		if(temp ==4)
			this.year=year;
//		else
//			System.out.println("Not a valid Year setting to default");
//			this.year=1900;
	}
	public String toString() {
		String result="";
		result += this.month+"/";
		result += this.day+"/";
		result += this.year;
		return result;
	}
	 public Date clone()
     {
     	Date other = new Date(this.month, this.day, this.year);
     	return other;
     }
	 public boolean equals(Date other) {
			if(this.month==other.month
			   && this.day==other.day
			   && this.year == other.year){
				return true;
			}
			else {
				return false;
			}
		}
	 public int compareTo(Object o) {
		 
		 if(this== o)
     		return 0;
		 
		 Date oDate = null;
     	
     	try
     	{
     		oDate = (Date) o;
     	}
     	catch(ClassCastException cce)
     	{
     		return -2;
     	}
     	
     	
     	if(this.year < oDate.year)
     	{
     		return -1;
     	}
     	else if(this.month < oDate.month)
     	{
     		return 1;
     	}
     	else if(this.day < oDate.day)
     	{
     		return -1;
     	}
     	else
     	{
     		return 0;
     	}
	 }
	 public String getMonthName()
	 {
		 switch(month) 
			{
				case 1: return "January";
				case 2: return "Febuary";
				case 3: return "March";
				case 4: return "April";
				case 5: return "May";
				case 6: return "June";
				case 7: return "July";
				case 8: return "August";
				case 9: return "September";
				case 10: return "October";
				case 11: return "November";
				case 12: return "December";
			}
		 
		 return "";
	 }
	 public static int getMonthMaxDays(int month)
	 {
		 switch(month) 
			{
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					return 31;
				case 4:
				case 6:
				case 9:
				case 11:
					return 30;
				case 2:
					return 28;
			}
		 
		 return -1;
	 }
	 public void incrementDay()
	 {
		 this.day=day+1;
		 
		 switch(month) 
			{
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					if(this.day >=32)
					{
						this.month=month+1;
						this.day=1;
					}
					return;
				case 12:
					if(this.day >=32)
					{
						this.month=month+1;
						this.year=year+1;
						this.day=1;
					}
					return;
				case 4:
				case 6:
				case 9:
				case 11:
					if(this.day >=30)
					{
						this.month=month+1;
						this.day=1;
					}
					return;
				case 2:
					if(this.day >=28)
						this.month=month+1;
						this.day=1;
					return;
			}
	 }
	 public String toString(char a) 
	 {
		 if(a=='M')
		 {
			 String result="";
			 
			 switch(month) 
				{
					case 1: result += "January/";
					break;
					case 2: result += "Febuary/";
					break;
					case 3: result += "March/";
					break;
					case 4: result += "April/";
					break;
					case 5: result += "May/";
					break;
					case 6: result += "June/";
					break;
					case 7: result += "July/";
					break;
					case 8: result += "August/";
					break;
					case 9: result += "September/";
					break;
					case 10: result += "October/";
					break;
					case 11: result += "November/";
					break;
					case 12: result += "December/";
					break;
				}
			 
			result += this.day+"/";
			result += this.year;
			return result;
		 }
		 else if(a=='m')
		 {
			 return toString();
		 }
		 else
		 {
			 return toString();
		 }
	}
	 public static void main(String[] args){
         Date d1= new Date();
         d1.setMonth(2);
         d1.setDay(2, 14);
         d1.setYear(2012);
         
         Date d3= new Date();
         d3.setMonth(12);
         d3.setDay(5, 22);
         d3.setYear(1995);
         
         Date d4= new Date();
         d4.setMonth(12);
         d4.setDay(12, 31);
         d4.setYear(1995);
         
         System.out.println(d1);
         
         System.out.println(d1.toString('M'));
         
         Date d2 = new Date();
         
         d2 = d1.clone();
         
         System.out.println(d2);
         System.out.println(d1);
         
         System.out.println(d1.equals(d2));
         System.out.println(d1.equals(d3));
         
         System.out.println(d1.compareTo(d2));
         System.out.println(d1.compareTo(d3));
         
         System.out.println(d1.getMonthName());
         
         System.out.println(getMonthMaxDays(d1.getMonth()));
         
         System.out.println(d4);
         d4.incrementDay();
         System.out.println(d4);
 }
}
