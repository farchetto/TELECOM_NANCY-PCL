package analysis;

import java.util.ArrayList;

public class SymbolTable {
	
	ArrayList<Data> table;			//contient les informations sur toutes les datas de la tds
	ArrayList<SymbolTable> children; 	//Contient les SymbolTable contenue dans celle-ci
	SymbolTable parent;				//pour avoir acces aux infos du parent
	
	//root ST
	public SymbolTable() {
		this.table=new ArrayList<Data>();
		this.children=new ArrayList<SymbolTable>();
		this.parent=null;
	}
	
	//Si parent connu
	public SymbolTable(SymbolTable parent) {
		this.table=new ArrayList<Data>();
		this.children=new ArrayList<SymbolTable>();
		this.parent=parent;
	}
	
	//getter et setter
	public ArrayList<Data> getTable() {
		return table;
	}

	public SymbolTable getParent() {
		return parent;
	}
	
	public void setParent(SymbolTable parent) {
		this.parent = parent;
	}	
	
	public ArrayList<SymbolTable> getChildrenST() {
		return this.children;
	}
	
	public SymbolTable getChildren(int i) {
		return this.children.get(i);
	}
	
	public SymbolTable getRoot() {
		if (this.parent==null) {
			return this;
		}else {
			return this.parent.getRoot();
		}
	}
	
	//ajout d'une ST enfant à celle-ci
	public void addChild(SymbolTable childST) {
		children.add(childST);
	}
	
	//Ajout de data a la table
	public void addDataToTable(Data infos) {
		
		//test si elle existe déjà dans la tds
		for (Data currentInfo:table) {
			if (currentInfo.getName().equals(infos.getName())){
				System.err.println("variable or function '"+infos.getName()+"' already exists");
				return;
			}
		}
		table.add(infos);
	}
	
	public String toString(){
		String s="[";
		for (Data info:table) {
			s+=info+" ";
		}
		for (SymbolTable child:children) {
			s+=child+" ";
		}
		s+="]";
		return s;
	}
}
