package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Periodo;


public interface PeriodoService {

	Periodo savePeriodo(Periodo periodo);
	List<Periodo> findAllPeriodo();
	Periodo updatePeriodo(int id,Periodo periodo);
	void deletePeriodo (int id);
	Periodo findById(Integer id);
}
