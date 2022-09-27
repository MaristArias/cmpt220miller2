package Module 03.homework;

public class problem3 {
    import java.text.DecimalFormat; 
import java.util.Scanner; 
 
public class Slope  
{ 
	public static void main(String[] args) 
	{ 
    	Scanner sc = new Scanner(System.in); 
		 
 
		System.out.print("Enter the coordinates for two points : "); 
	 
		int x1 = sc.nextInt(); 
		int y1 = sc.nextInt(); 
		int x2 = sc.nextInt(); 
		int y2 = sc.nextInt(); 
		 
 
		double m_temp = 1.0 * (y2 - y1) / (x2 - x1); 
		 
 
		double b_temp = y1 - m_temp * x1; 
		 
		// String variables to store the values and sign of m and b 
		String m = ""; 
		String b = ""; 
		 
        DecimalFormat df_obj = new DecimalFormat("#.###"); 
		 
 
		if(m_temp == 0 || m_temp == 1) 
		{ 
			m = ""; 
		} 
 
		else if(m_temp == -1) 
		{ 
			m = "-"; 
		} 
		// For all other values display values of m_temp 
		else 
		{ 
			m = "" + df_obj.format(m_temp); 
		} 
		 
 
		if(b_temp == 0) 
		{ 
			b = ""; 

      } 

		{ 
			b = " - " + df_obj.format(b_temp); 
		} 
 
		else 
		{ 
			b = " + " + df_obj.format(b_temp); 
		} 
		 
		System.out.println("The line equation for two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is y = " + m + "x" + b); 
		 
		 
	} 
} 
 
}
