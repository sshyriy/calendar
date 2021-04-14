
public class Events {
	String name;
	Calendar date;
	Object locationZoom;
	String externalLink;
	int max_Group_Size;
	
	public Events(String name, Calendar date, Object locationZoom, String externalLink, int max_Group_Size) {
		super();
		this.name = name;
		this.date = date;
		this.locationZoom = locationZoom;
		this.externalLink = externalLink;
		this.max_Group_Size = max_Group_Size;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public Object getLocationZoom() {
		return locationZoom;
	}
	public void setLocationZoom(Object locationZoom) {
		this.locationZoom = locationZoom;
	}
	public String getExternalLink() {
		return externalLink;
	}
	public void setExternalLink(String externalLink) {
		this.externalLink = externalLink;
	}
	public int getMax_Group_Size() {
		return max_Group_Size;
	}
	public void setMax_Group_Size(int max_Group_Size) {
		this.max_Group_Size = max_Group_Size;
	}
}



