package com.sample;

public class SistemGrejanja {
	
	//Ulazne promenljive
	private int povrsina;
	private String osetljiviNaHladnocu;
	private boolean cenaStoNiza;
	private boolean imaStruju;
	private boolean imaGas;
	private boolean imaGradskoGrejanje;
	
	//Izlazne promenljive
	private String tipSistema;
	private String konkretanSistem;
	public int getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(int povrsina) {
		this.povrsina = povrsina;
	}
	public String getOsetljiviNaHladnocu() {
		return osetljiviNaHladnocu;
	}
	public void setOsetljiviNaHladnocu(String osetljiviNaHladnocu) {
		this.osetljiviNaHladnocu = osetljiviNaHladnocu;
	}
	public boolean isCenaStoNiza() {
		return cenaStoNiza;
	}
	public void setCenaStoNiza(boolean cenaStoNiza) {
		this.cenaStoNiza = cenaStoNiza;
	}
	public boolean isImaStruju() {
		return imaStruju;
	}
	public void setImaStruju(boolean imaStruju) {
		this.imaStruju = imaStruju;
	}
	public boolean isImaGas() {
		return imaGas;
	}
	public void setImaGas(boolean imaGas) {
		this.imaGas = imaGas;
	}
	public boolean isImaGradskoGrejanje() {
		return imaGradskoGrejanje;
	}
	public void setImaGradskoGrejanje(boolean imaGradskoGrejanje) {
		this.imaGradskoGrejanje = imaGradskoGrejanje;
	}
	public String getTipSistema() {
		return tipSistema;
	}
	public void setTipSistema(String tipSistema) {
		this.tipSistema = tipSistema;
	}
	public String getKonkretanSistem() {
		return konkretanSistem;
	}
	public void setKonkretanSistem(String konkretanSistem) {
		this.konkretanSistem = konkretanSistem;
	}
	
	//toString metoda se koristi kasnije pri ispisu resenja.
	@Override
	public String toString() {
		return "SistemGrejanja [povrsina=" + povrsina + ", osetljiviNaHladnocu=" + osetljiviNaHladnocu
				+ ", cenaStoNiza=" + cenaStoNiza + ", imaStruju=" + imaStruju + ", imaGas=" + imaGas
				+ ", imaGradskoGrejanje=" + imaGradskoGrejanje + ", tipSistema=" + tipSistema + ", konkretanSistem="
				+ konkretanSistem + "]";
	}

}
