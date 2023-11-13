package ricettario;

public class Ricetta {
	private int idRicetta;
	private String nome;
	private String ingredienti;
	private int tempistica;
	private String procedimento;
	private String categoria;
	
	@Override
	public String toString() {
		return "Ricetta [idRicetta=" + idRicetta + ", nome=" + nome + ", ingredienti=" + ingredienti + ", tempistica="
				+ tempistica + ", procedimento=" + procedimento + ", categoria=" + categoria + "]";
	}

	public Ricetta(int idRicetta, String nome, String ingredienti, int tempistica, String procedimento,
			String categoria) {
		super();
		this.idRicetta = idRicetta;
		this.nome = nome;
		this.ingredienti = ingredienti;
		this.tempistica = tempistica;
		this.procedimento = procedimento;
		this.categoria = categoria;
	}

	public int getIdRicetta() {
		return idRicetta;
	}

	public void setIdRicetta(int idRicetta) {
		this.idRicetta = idRicetta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public int getTempistica() {
		return tempistica;
	}

	public void setTempistica(int tempistica) {
		this.tempistica = tempistica;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	//private ArrayList<Ricetta> listaRicette;
}
