package org.benchmarx.emf;

import org.junit.Assert;

import com.kaleidoscope.core.delta.javabased.Delta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationResult;

import junit.framework.AssertionFailedError;

public interface ModelAssertation<S, T> {

	
	/**
	 * Request the bx tool to ensure that the state of its source and target
	 * models are identical to the provided pair of models. This method is to be
	 * invoked after a synchronisation dialogue to test the expected
	 * postcondition.
	 * 
	 * @param source
	 *            The expected source model
	 * @param target
	 *            The expected target model
	 * @throws AssertionFailedError
	 *             Expected to throw an assertion failed error via {@link Assert} if the
	 *             postcondition does not hold.
	 */
	public void assertPostcondition(S source, T target, SynchronisationResult<S, ?, T, ?, ? extends Delta> syncResult);

	/**
	 * Request the bx tool to ensure that the sate of its source and target
	 * models are identical to the provided pair of models. This method is to be
	 * invoked after the initial setup and before the actual series of
	 * propagation steps to be tested. Clarifies if a test fails because the
	 * precondition cannot be fulfilled or because the actual propagation to be
	 * tested is not working as expected.
	 * 
	 * @param source
	 *            The expected source model
	 * @param target
	 *            The expected target model
	 * @throws AssertionFailedError
	 *             Expected to throw assertion failed errors via {@link Assert} if the
	 *             precondition does not hold.
	 */
	public void assertPrecondition(S source, T target, SynchronisationResult<S, ?, T, ?, ? extends Delta> syncResult);
}
