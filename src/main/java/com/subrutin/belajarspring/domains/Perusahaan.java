package com.subrutin.belajarspring.domains;

public class Perusahaan {

	private Karyawan karyawan;

	public Perusahaan(Karyawan karyawan) {
		this.karyawan = karyawan;
	}

	@Override
	public String toString() {
		return "Perusahaan [karyawan=" + karyawan + "]";
	}

	
	
}
