/**
 */
package base.autonomic;

import base.common.ActionExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.autonomic.ChangePlan#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link base.autonomic.ChangePlan#getAction <em>Action</em>}</li>
 *   <li>{@link base.autonomic.ChangePlan#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface ChangePlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference.
	 * @see #setBasedOn(ChangeRequest)
	 * @generated
	 */
	ChangeRequest getBasedOn();

	/**
	 * Sets the value of the '{@link base.autonomic.ChangePlan#getBasedOn <em>Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' reference.
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(ChangeRequest value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionExecution)
	 * @generated
	 */
	ActionExecution getAction();

	/**
	 * Sets the value of the '{@link base.autonomic.ChangePlan#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionExecution value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link base.autonomic.ChangePlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ChangePlan
