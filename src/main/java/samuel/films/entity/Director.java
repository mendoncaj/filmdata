package samuel.films.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlValue;

@Entity
@Table(name = "directors")
public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@XmlValue
	@Column(name = "name", nullable = false)
	private String name;

	public long getId() {
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

}
