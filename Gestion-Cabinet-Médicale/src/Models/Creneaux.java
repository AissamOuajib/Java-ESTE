package Models;

public class Creneaux {

	private int id;
	private int version;
	private int hdebut;
	private int mdebut;
	private int hfin;
	private int mfin;
	private Medecins medecin;

	public Creneaux(int id, int version, int hdebut, int mdebut, int hfin, int mfin, Medecins medecin) {
		this.id = id;
		this.version = version;
		this.hdebut = hdebut;
		this.mdebut = mdebut;
		this.hfin = hfin;
		this.mfin = mfin;
		this.medecin = medecin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getHdebut() {
		return hdebut;
	}

	public void setHdebut(int hdebut) {
		this.hdebut = hdebut;
	}

	public int getMdebut() {
		return mdebut;
	}

	public void setMdebut(int mdebut) {
		this.mdebut = mdebut;
	}

	public int getHfin() {
		return hfin;
	}

	public void setHfin(int hfin) {
		this.hfin = hfin;
	}

	public int getMfin() {
		return mfin;
	}

	public void setMfin(int mfin) {
		this.mfin = mfin;
	}

	public Medecins getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecins medecin) {
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		return "Creneaux [id=" + id + ", version=" + version + ", hdebut=" + hdebut + ", mdebut=" + mdebut + ", hfin=" + hfin + ", mfin=" + mfin + ", medecin=" + medecin + "]";
	}
}
