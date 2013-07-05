
public class TicTacToePlayer {
	
	TicTacToeGame game;
	private final char opponent = 'X';
	
	public TicTacToePlayer(TicTacToeGame g) {
		game = g;
	}
	
	public TicTacToeMove getMove() {
		TicTacToeMove gameSaver = getGameSaver();
		if (gameSaver != null) {
			System.out.println("FOUND A GAME SAVER");
			return gameSaver;
		}
		
		//return getFirstMoveFound();
		return getRandomMove();
	}
	
	public TicTacToeMove getGameSaver() {
		// CHECK HORIZ
		for (int y = 0; y < 3; y++) {
			// check y row LEFT
			if (game.getPieceAt(0,y) == opponent && game.getPieceAt(1,y) == opponent) {
				return new TicTacToeMove(game,2,y);	
			} 
			// check y row RIGHT
			if (game.getPieceAt(1,y) == opponent && game.getPieceAt(2,y) == opponent) {
				return new TicTacToeMove(game,0,y);	
			}
		}
		// CHECK VERT
		for (int x = 0; x < 3; x++) {
			// check x column TOP
			if (game.getPieceAt(x, 0) == opponent && game.getPieceAt(x, 1) == opponent) {
				return new TicTacToeMove(game,x,2);
			}
			// check x column BOTTOM
			if (game.getPieceAt(x, 1) == opponent && game.getPieceAt(x, 2) == opponent) {
				return new TicTacToeMove(game,x,0);
			}
		}
		
		
		
		/*
		// check second row LEFT
		if (game.getPieceAt(0,1) == opponent && game.getPieceAt(1,1) == opponent) {
			return new TicTacToeMove(game,2,1);	
		} 
		// check second row RIGHT
		if (game.getPieceAt(1,1) == opponent && game.getPieceAt(2,1) == opponent) {
			return new TicTacToeMove(game,0,1);	
		}
		// check third row LEFT
		if (game.getPieceAt(0,2) == opponent && game.getPieceAt(1,2) == opponent) {
			return new TicTacToeMove(game,2,2);	
		} 
		// check third row RIGHT
		if (game.getPieceAt(1,1) == opponent && game.getPieceAt(2,2) == opponent) {
			return new TicTacToeMove(game,0,2);	
		}
		*/
		
		
		return null;
	}
	
	public TicTacToeMove getFirstMoveFound() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (game.canPlacePieceAt(x, y)) {
					return new TicTacToeMove(game,x,y);
				}
			}
		}
		return null;
	}
	
	public TicTacToeMove getRandomMove() {
		boolean foundMove = false;
		while (foundMove == false) {
			int x = getRandom(0,2);
			int y = getRandom(0,2);
			if (game.canPlacePieceAt(x,y)) {
				foundMove = true;
				return new TicTacToeMove(game,x,y);
				
			}
		}
		return null;
	}
	
	public int getRandom(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
}