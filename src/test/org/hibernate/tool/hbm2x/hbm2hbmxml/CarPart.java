package org.hibernate.tool.hbm2x.hbm2hbmxml;

/**
 * @author Paco Hern�ndez
 */
public abstract class CarPart implements java.io.Serializable {

	private long id;
	private String partName;

	/**
	 * @return Returns the id.
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return Returns the typeName.
	 */
	public String getPartName() {
		return partName;
	}
	/**
	 * @param typeName The typeName to set.
	 */
	public void setPartName(String typeName) {
		this.partName = typeName;
	}
}
