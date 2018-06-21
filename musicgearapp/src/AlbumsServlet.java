import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AlbumsServlet extends HttpServlet
{
	AlbumSource albums;

	public void init() throws ServletException {
		MusicManagerDatabase mmd = new MusicManagerDatabase();
		albums = mmd.getAlbumSource();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/xml");
		PrintWriter out = res.getWriter();
		String genre = req.getParameter("genre");
		String search = req.getParameter("search");
		out.print(exportToXML(search, genre));
	}

	public String exportToXML(String search, String genre) {
		StringBuilder sb = new StringBuilder("<albums>");
		ArrayList<Album> album = albums.getAllAlbums();
		if(search != null) {
			for(Album a : album) {
				if(a.getInformation().toLowerCase().contains(search.toLowerCase())) {
					sb.append("<album><albumId>");
					sb.append(a.getId());
					sb.append("</albumId><artist>");
					sb.append(a.getArtist());
					sb.append("</artist><albumname>");
					sb.append(a.getAlbumName());
					sb.append("</albumname><price>");
					sb.append(a.getPrice());
					sb.append("</price><quantity>");
					sb.append(a.getQuantity());
					sb.append("</quantity><genre>");
					sb.append(a.getGenre());
					sb.append("</genre></album>");
				}
			}
		}
		else if(genre != null) {
			for(Album a : album) {
				if(a.getGenre().toLowerCase().contains(genre.toLowerCase())) {
					sb.append("<album><albumId>");
					sb.append(a.getId());
					sb.append("</albumId><artist>");
					sb.append(a.getArtist());
					sb.append("</artist><albumname>");
					sb.append(a.getAlbumName());
					sb.append("</albumname><price>");
					sb.append(a.getPrice());
					sb.append("</price><quantity>");
					sb.append(a.getQuantity());
					sb.append("</quantity><genre>");
					sb.append(a.getGenre());
					sb.append("</genre></album>");
				}
			}
		}
		else {
			for(Album a : album) {
				sb.append("<album><albumId>");
				sb.append(a.getId());
				sb.append("</albumId><artist>");
				sb.append(a.getArtist());
				sb.append("</artist><albumname>");
				sb.append(a.getAlbumName());
				sb.append("</albumname><price>");
				sb.append(a.getPrice());
				sb.append("</price><quantity>");
				sb.append(a.getQuantity());
				sb.append("</quantity><genre>");
				sb.append(a.getGenre());
				sb.append("</genre></album>");
			}
		}
		sb.append("</albums>");
		return(sb.toString());
	}

	public void destroy() {
		albums = null;
	}
}
