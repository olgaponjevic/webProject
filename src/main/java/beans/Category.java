package beans;

import java.util.Objects;

public class Category {
	private int id;
	private String name;
	private boolean deleted;
	
	public Category() {
		super();
	}

	public Category(int id, String name, boolean deleted) {
		super();
		this.id = id;
		this.name = name;
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deleted, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return deleted == other.deleted && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", deleted=" + deleted + "]";
	}

	
	
	

}
