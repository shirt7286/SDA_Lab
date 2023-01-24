public class GameCharacterAngus extends GameCharacter {
	
	
	public GameCharacterAngus() {
		 guitarBehavior=new Guitar_GibsonLesPaul();
		 soloBehavior=new Solo_SmashGuitar();
	}

    public void change() {
		this.setGuitar(new Guitar_GibsonSG());
	}
}
