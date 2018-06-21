import java.math.BigDecimal;

class Album 
{
	private int id;
	private String artist;
	private String albumName;
	private BigDecimal price;
	private int quantity;
	private String genre;

	public Album(int id, String a, String an, BigDecimal p, int q, String g) {
		this.id = id;
		artist = a; 
		albumName = an;
		price = p;
		quantity = q;
		genre = g;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return(id);
	}

	public void setArtist(String a) {
		artist = a;
	}

	public String getArtist() {
		return(artist);
	}

	public void setAlbumNmae(String an) {
		albumName = an;
	}

	public String getAlbumName() {
		return(albumName);
	}

	public void setPrice(BigDecimal p) {
		price = p;
	}

	public BigDecimal getPrice() {
		return(price);
	}

	public void setQuantity(int q) {
		quantity = q;
	}

	public int getQuantity() {
		return(quantity);
	}

	public void setGenre(String g) {
		genre = g;
	}

	public String getGenre() {
		return(genre);
	}

	public String getInformation() {
		return(id + artist + albumName +  price + quantity + genre);
	}
}
