import java.util.ArrayList;
import java.math.BigDecimal;
import java.sql.*;

public class MusicManagerDatabase
{
	private AlbumSource albums;

	Connection conn;

	public MusicManagerDatabase() {
		albums = new AlbumSource();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/myalbumdb?user=myalbumdb&" + "password=myalbumdb&serverTimezone=UTC&useSSL=false");
			readFromDB(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public AlbumSource getAlbumSource() {
		return(albums);
	}

public boolean checkUser(String username, String password) {
	boolean st = false;
	PreparedStatement ps;
	ResultSet rs;
	try {
		ps = conn.prepareStatement("select * from usertable where username=? and password?");
		ps.setString(1, username);
		ps.setString(2, password);
		rs = ps.executeQuery();
		st = rs.next();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return(st);
}

	public boolean readFromDB(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM albumtable;");
			while(rs.next()) {
				String[] str = {
					rs.getString("id"),
					rs.getString("artist"),
					rs.getString("albumname"),
					rs.getString("price"),
					rs.getString("quantity"),
					rs.getString("genre")
				};
				createAlbumObject(str);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt!=null) {stmt=null;}} catch(Exception e) {};
			try { if(rs!=null) {rs=null;}} catch(Exception e) {};
		}
		return(true);
	}

	public void createAlbumObject(String... details) {
		int len = details.length - 1;
		String d = details[len].toLowerCase();
		Album a = new Album(Integer.parseInt(details[0]), details[1], details[2], new BigDecimal(details[3]), Integer.parseInt(details[4]), details[5]);
		albums.addAlbum(a);
	}
}
