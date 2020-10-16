package sn.forage.dao;

import java.util.List;
import sn.forage.entities.Village;


public interface IVillage {
	public int add(Village village);
	public List<Village> list();
}
