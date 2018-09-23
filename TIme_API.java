// Here we will see Time API which provides us different method to work with time
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

class TIme_API
{
	public static void main(String []args)
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);

		LocalDate d1=LocalDate.of(1998,Month.JUNE,29); //   yy-mm-dd format // Month is an enum
		System.out.println(d1); 

		LocalTime t=LocalTime.now();
		System.out.println(t);

		LocalTime t1=LocalTime.of(12,10,23,444);
		System.out.println(t1);

		for(String s:ZoneId.getAvailableZoneIds()) // This gives you ZoneIds
		{
			System.out.println(s);
		}

		LocalTime t2=LocalTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
		System.out.println(t2);

		//Europe/Paris
	}
}