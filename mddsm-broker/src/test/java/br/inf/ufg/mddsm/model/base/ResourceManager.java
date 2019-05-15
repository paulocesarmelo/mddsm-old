/**
 */
package base;

import base.common.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ResourceManager#getIface <em>Iface</em>}</li>
 * </ul>
 *
 * @generated
 */
public interface ResourceManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iface</em>' containment reference.
	 * @see #setIface(Interface)
	 * @generated
	 */
	Interface getIface();

	/**
	 * Sets the value of the '{@link base.ResourceManager#getIface <em>Iface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iface</em>' containment reference.
	 * @see #getIface()
	 * @generated
	 */
	void setIface(Interface value);

} // ResourceManager
