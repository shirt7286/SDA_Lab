
public class GameCharacterHendrix extends GameCharacter {
	
	
	public GameCharacterHendrix() {
		 guitarBehavior=new Guitar_GibsonSG();
		 soloBehavior=new Solo_JumpOffStage();
	}

	public void change() {
		this.setGuitar(new Guitar_Telecaster());
	}
}
