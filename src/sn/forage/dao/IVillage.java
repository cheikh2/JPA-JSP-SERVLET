package sn.forage.dao;

import java.util.List;

import sn.forage.entities.Village;


public interface IVillage {
	public int add(Village village);
	public List<Village> list();
	public Village getVillage(Long id);
	public Village update(Village c);
	public void deleteVillage(Long id);
}
