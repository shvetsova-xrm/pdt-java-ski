package com.example.tests;

public class GroupData implements Comparable<GroupData> {
	
	private String id;
	private String name;
	private String header;
	private String footer;

	public GroupData() {
	}

	public GroupData(String groupname, String header, String footer, String id) {
		this.id = id;
		this.name = groupname;
		this.header = header;
		this.footer = footer;
	}


	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	@Override
	public String toString() {
		return "GroupData [name=" + name + ", header=" + header + ", footer="
				+ footer + "]";
	}

	@Override
	public int hashCode() {
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupData other = (GroupData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(GroupData other) {
		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
	}

	public GroupData withName(String name) {
		this.name = name;
		return this;
	}

	public GroupData withHeader(String header) {	
		this.header = header;
		return this;
	}
	
	public GroupData withFooter(String footer) {	
		this.footer = footer;
		return this;
	}
	
	public GroupData withId(String id) {
		this.id = id;
		return this;
	}

}