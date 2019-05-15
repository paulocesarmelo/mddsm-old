/**
 */
package br.inf.ufg.mddsm.model.base;

import base.autonomic.ChangePlan;
import base.autonomic.ChangeRequest;
import base.autonomic.Symptom;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autonomic Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.AutonomicManager#getIdentifies <em>Identifies</em>}</li>
 *   <li>{@link base.AutonomicManager#getRequests <em>Requests</em>}</li>
 *   <li>{@link base.AutonomicManager#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface AutonomicManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifies</b></em>' containment reference list.
	 * The list contents are of type {@link base.autonomic.Symptom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifies</em>' containment reference list.
	 * @generated
	 */
	List<Symptom> getIdentifies();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link base.autonomic.ChangeRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @generated
	 */
	List<ChangeRequest> getRequests();

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link base.autonomic.ChangePlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @generated
	 */
	List<ChangePlan> getPlans();

} // AutonomicManager
