package com.pojo;

public class Character1 {
	private int characterId;
	private String characterName;
	private String profile;
	public Character1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character1(int characterId, String characterName, String profile) {
		super();
		this.characterId = characterId;
		this.characterName = characterName;
		this.profile = profile;
	}
	public int getCharacterId() {
		return characterId;
	}
	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Character [characterId=" + characterId + ", characterName=" + characterName + ", profile=" + profile
				+ "]";
	}
	
	
}
