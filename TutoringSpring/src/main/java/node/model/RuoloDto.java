package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class RuoloDto {
	@JsonProperty("RuoloResponse")
	
 
	private String ruolo;

	private String descrizioneRuolo;
	
	@Override
	public String toString() {
		return String.format("Ruolo [ruolo=%s, descrizioneRuolo=%s]", getRuolo(), getDescrizioneRuolo());
	}
    
	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getDescrizioneRuolo() {
		return descrizioneRuolo;
	}

	public void setDescrizioneRuolo(String descrizioneRuolo) {
		this.descrizioneRuolo = descrizioneRuolo;
	}
}
