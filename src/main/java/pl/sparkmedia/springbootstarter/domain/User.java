package pl.sparkmedia.springbootstarter.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Maciej Lesniak / Spark Media
 * @version 16.04.2016
 */
@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String email;

	@NotNull
	private String name;


	protected User() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
