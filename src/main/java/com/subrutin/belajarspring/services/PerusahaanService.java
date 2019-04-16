package com.subrutin.belajarspring.services;

import com.subrutin.belajarspring.domains.Karyawan;
import com.subrutin.belajarspring.domains.Perusahaan;

public class PerusahaanService {

	private Perusahaan perusahaan;

	public PerusahaanService() {

		Karyawan karyawan =new Karyawan();
		this.perusahaan = new Perusahaan(karyawan);
	
	}
	
	
	
}
