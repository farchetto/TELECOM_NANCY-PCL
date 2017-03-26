package analysis;

import java.util.ArrayList;

public class Data {
		
		private String name;
		private String type; // faire une classe avec enum string, int
		private String defaultValue;
		private boolean isFunction;
		private ArrayList<Data> params;
		private int relativeAddress;
		private int size;
		
		public Data (String name,String type){
			this.name=name;
			this.type=type;
			this.params=new ArrayList<Data>();
		}
		
		public int getRelativeAddress() {
			return relativeAddress;
		}

		public void setRelativeAddress(int relativeAddress) {
			this.relativeAddress = relativeAddress;
		}

		public void addParam(Data info){
			if(params==null){
				this.params=new ArrayList<Data>();
			}
			for (Data param:params){
				if (param.getName().equals(info.getName())){
					System.err.println("variable or function already exists"+info.getName());
					return;
				}
			}
			this.params.add(info);
		}

		public Data getParam(int i){
			return this.params.get(i);
		}
		
		public int getParamsCount(){
			return params.size();
		}
		
		public ArrayList<Data> getParams(){
			return params;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDefaultValue() {
			return defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String toString(){
			String s = "("+name+","+type+")";
			if (!params.isEmpty()){
				s+=","+params.toString()+")";
			}
			return s;
		}
		
		public void setIsFunction(boolean function){
			this.isFunction = function;
		}

		public boolean isFunction() {
			return isFunction;
		}

		public void setSize(int size) {
			this.size = size;
		}
		public int getSize() {
			return this.size;
		}
}
