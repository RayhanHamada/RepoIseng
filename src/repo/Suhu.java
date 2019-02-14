package repo;


import java.util.Scanner;

public class Suhu {

	private static Scanner scan;
	
	public static void main(String[] args)
	{
		proses();
	}
	
	public static void proses()
	{
		scan = new Scanner(System.in);
		int pilihan;
		
		System.out.println("Konversi suhu apa yang anda inginkan ?\n1. C ke R\n2. C ke F\n3. C ke K\n4. exit");
		System.out.print("input : ");
		try
		{
		pilihan = scan.nextInt();
		
		if (pilihan == 1)
		{
			System.out.println("masukan nominal suhu dalam celcius : ");
			try
			{
			float hasil = cToR(scan.nextFloat());
			System.out.println("Suhu dalam Reamur = " + hasil);
			} catch (Exception e)
			{
				System.out.println("input anda salah, silahkan ulangi dari awal ! ");
				proses();
			}
		}
		else if (pilihan == 2)
		{
			System.out.print("masukan nominal suhu dalam celcius : ");
			try
			{
			float hasil = cToF(scan.nextFloat());
			System.out.println("Suhu dalam Fahrenheit = " + hasil);
			} catch (Exception e)
			{
				System.out.println("input anda salah, silahkan ulangi dari awal ! ");
				proses();
			}
		}
		else if (pilihan == 3)
		{
			System.out.print("masukan nominal suhu dalam celcius : ");
			try
			{
			float hasil = cToK(scan.nextFloat());
			System.out.println("Suhu dalam Kelvin = " + hasil);
			} catch (Exception e)
			{
				System.out.println("input anda salah, silahkan ulangi dari awal ! ");
				proses();
			}
		}
		else if (pilihan == 4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("pilihan tidak valid, silahkan ulangi !\n\n");
			proses();
		}
	} catch (Exception e1)
		{
		System.out.println("error");
		}
	}
	
	public static float cToR(float c)
	{
		return 4.0f/5.0f * c;
	}
	
	public static float cToF(float c)
	{
		return (9.0f / 5.0f * c) + 32.0f;
	}
	
	public static float cToK(float c)
	{
		return 273.0f + c;
	}
}
