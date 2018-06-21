import java.util.ArrayList;

public class AlbumSource
{
	private ArrayList<Album> albums;

	public AlbumSource() {
		albums = new ArrayList<Album>();
	}

	public void addAlbum(Album album) {
		albums.add(album);
	}

	public void removeAlbum(Album album) {
		albums.remove(album);
	}

	public ArrayList<Album> getAllAlbums() {
		return(albums);
	}

	public Album getAlbumByIndex(int a) {
		return(albums.get(a));
	}

	public int getAlbumCount() {
		return(albums.size());
	}
}
