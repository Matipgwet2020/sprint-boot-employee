package net.javaguides.sprintboot.springbootdemofin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String firstName;
    private String lastName;
    private String statut;
    private String type;
    private long valeur1;
    private long valeur2;
    private long licence;
    private String version;
    private String site;
    
    
    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String emailId;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId, String statut, String type, long valeur1, long valeur2, long licence, String version, String site) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.statut = statut;
        this.type = type;
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
        this.licence = licence;
        this.version = version;
        this.site = site;
    }

    public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getValeur1() {
		return valeur1;
	}

	public void setValeur1(long valeur1) {
		this.valeur1 = valeur1;
	}

	public long getValeur2() {
		return valeur2;
	}

	public void setValeur2(long valeur2) {
		this.valeur2 = valeur2;
	}

	public long getLicence() {
		return licence;
	}

	public void setLicence(long licence) {
		this.licence = licence;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "statut=" +statut+ "type=" +type+
            "]";
    }
}