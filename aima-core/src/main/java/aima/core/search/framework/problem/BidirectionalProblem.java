package aima.core.search.framework.problem;

/**
 * An interface describing a problem that can be tackled from both directions at
 * once (i.e InitialState<->Goal).
 * 
 * @author Ciaran O'Reilly
 * @author Ruediger Lunde
 * 
 */
public interface BidirectionalProblem<S, A> extends Problem<S, A> {
	Problem<S, A> getOriginalProblem();
	Problem<S, A> getReverseProblem();
}
