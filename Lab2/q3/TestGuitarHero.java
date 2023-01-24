
public class TestGuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GameCharacter player1 = new GameCharacterSlash();
			GameCharacter player2 = new GameCharacterHendrix();
			GameCharacter player3 = new GameCharacterAngus();
			player1.playGuitar();
			player2.playGuitar();
			player3.playGuitar();
			System.out.println();
			player1.playSolo();
			player2.playSolo();
			player3.playSolo();
			System.out.println();
			player1.change();
			player2.change();
			player3.change();
			System.out.println("");
			player1.playGuitar();
			player2.playGuitar();
			player3.playGuitar();
			System.out.println("");
			player1.setSolo(new Solo_SmashGuitar());
			player1.playSolo();
			player3.setGuitar(new Guitar_Telecaster());
			player3.playGuitar();

			}
	}

