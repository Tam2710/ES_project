package com.javainuse.model;

public class Tekstil {
	
	private String garderoba;
	private String vreme;
	private String prilika;
	private String OTvlaga;
	private String OTtrenje;
	private String firma;
	private String ugovor;
	private int cena;
	private String preporuka = "Nema preporuke";
	
	public String getGarderoba() {
		return garderoba;
	}
	
	public String getVreme() {
		return vreme;
	}
	
	public String getPrilika() {
		return prilika;
	}
	
	public String getOTvlaga() {
		return OTvlaga;
	}
	
	public String getOTtrenje() {
		return OTtrenje;
	}
	
	public String getFirma() {
		return firma;
	}
	
	public String getUgovor() {
		return ugovor;
	}
	
	public String getPreporuka() {
		return preporuka;
	}
	
	public int getCena() {
		return cena;
	}
	
	public void setGarderoba(String garderoba) {
		this.garderoba = garderoba;
	}
	
	public void setVreme(String vreme) {
		this.vreme = vreme;
	}
	
	public void setPrilika(String prilika) {
		this.prilika = prilika;
	}
	
	public void setOTvlaga(String OTvlaga) {
		this.OTvlaga = OTvlaga;
	}
	
	public void setOTtrenja(String OTtrenje) {
		this.OTtrenje = OTtrenje;
	}
	
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	public void setUgovor(String ugovor) {
		this.ugovor = ugovor;
	}
	
	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public void setPreporuka(String preporuka) {
		this.preporuka = preporuka;
	}
}
