


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelData {

	public List<Hotel> storeAllHotels()
	{
		List<Hotel> hotels=new ArrayList<Hotel>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/seca22026", "root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM seca22026.hotel;");
		while(set.next())
		{
		Hotel hotel=new Hotel(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4));
		hotels.add(hotel);
		}
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return hotels;
		
	}
}
