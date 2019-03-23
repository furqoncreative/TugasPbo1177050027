/*author : Deden Muhamad Furqon*/

public class Barang{
	private int id;
	private String nama;
	private String merk;
	private int harga;
	private String kondisi;
	private int berat;
	private int stock;
	private String kategori;
	private String subkategori;
	private String childkategori;

	public Barang(int id, String nama, String merk, int harga, String kondisi, int berat, int stock,
		String kategori, String subkategori, String childkategori){
		this.id = id;
		this.nama = nama;
		this.merk = merk;
		this.harga = harga;
		this.kondisi = kondisi;
		this.berat = berat;
		this.stock = stock;
		this.kategori = kategori;
		this.subkategori = subkategori;
		this.childkategori = childkategori;
	}

	public int getId(){ return id; }

	public String getNama(){ return nama; }

	public String getMerk(){ return merk; }

	public int getHarga(){ return harga; }

	public String getKondisi(){ return kondisi; }

	public int getBerat(){ return berat; }

	public int getStock(){ return stock; }

	public String getKategori(){ return kategori; }

	public String getSubkategori(){ return subkategori; }

	public String getChildkategori(){ return childkategori; }


}