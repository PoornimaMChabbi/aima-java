package aima.core.environment.eightpuzzle;

import aima.core.agent.Action;
import aima.core.search.framework.Node;
import aima.core.util.datastructure.XYLocation;

import java.util.function.ToDoubleFunction;

/**
 * @author Ravi Mohan
 * @author Ruediger Lunde
 */
public class MisplacedTileHeuristicFunction implements ToDoubleFunction<Node<EightPuzzleBoard, Action>> {

	public double applyAsDouble(Node<EightPuzzleBoard, Action> node) {
		EightPuzzleBoard board = (EightPuzzleBoard) node.getState();
		return getNumberOfMisplacedTiles(board);
	}

	private int getNumberOfMisplacedTiles(EightPuzzleBoard board) {
		int numberOfMisplacedTiles = 0;
		if (!(board.getLocationOf(0).equals(new XYLocation(0, 0)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(1).equals(new XYLocation(0, 1)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(2).equals(new XYLocation(0, 2)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(3).equals(new XYLocation(1, 0)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(4).equals(new XYLocation(1, 1)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(5).equals(new XYLocation(1, 2)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(6).equals(new XYLocation(2, 0)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(7).equals(new XYLocation(2, 1)))) {
			numberOfMisplacedTiles++;
		}
		if (!(board.getLocationOf(8).equals(new XYLocation(2, 2)))) {
			numberOfMisplacedTiles++;
		}
		// Subtract the gap position from the # of misplaced tiles
		// as its not actually a tile (see issue 73).
		if (numberOfMisplacedTiles > 0) {
			numberOfMisplacedTiles--;
		}
		return numberOfMisplacedTiles;
	}
}