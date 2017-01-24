package allbegray.slack.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

	protected String id;
	protected String name;
	protected String domain;
	protected String email_domain;
	protected Icon icon;
	protected String enterprise_id;
	protected String enterprise_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDoamin(String domain) {
		this.domain = domain;
	}

	public String getEmail_domain() {
		return email_domain;
	}

	public void setEmail_domain(String email_domain) {
		this.email_domain = email_domain;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEnterprise_id() {
    return enterprise_id;
  }

  public void setEnterprise_id(String enterprise_id) {
    this.enterprise_id = enterprise_id;
  }

  public String getEnterprise_name() {
    return enterprise_name;
  }

  public void setEnterprise_name(String enterprise_name) {
    this.enterprise_name = enterprise_name;
  }


	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", domain=" + domain + ", email_domain=" + email_domain + "]";
	}

}
