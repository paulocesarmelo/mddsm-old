/**
 */
package base.impl;

import base.AutonomicManager;

import base.autonomic.ChangePlan;
import base.autonomic.ChangeRequest;
import base.autonomic.Symptom;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autonomic Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.AutonomicManagerImpl#getIdentifies <em>Identifies</em>}</li>
 *   <li>{@link base.impl.AutonomicManagerImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link base.impl.AutonomicManagerImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutonomicManagerImpl extends EObjectImpl implements AutonomicManager {
	/**
	 * The cached value of the '{@link #getIdentifies() <em>Identifies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Symptom> identifies;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRequest> requests;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangePlan> plans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutonomicManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackageImpl.Literals.AUTONOMIC_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Symptom> getIdentifies() {
		if (identifies == null) {
			identifies = new EObjectContainmentEList<Symptom>(Symptom.class, this,
					BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES);
		}
		return identifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ChangeRequest> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<ChangeRequest>(ChangeRequest.class, this,
					BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ChangePlan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentEList<ChangePlan>(ChangePlan.class, this,
					BasePackageImpl.AUTONOMIC_MANAGER__PLANS);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES:
			return ((InternalEList<?>) getIdentifies()).basicRemove(otherEnd, msgs);
		case BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS:
			return ((InternalEList<?>) getRequests()).basicRemove(otherEnd, msgs);
		case BasePackageImpl.AUTONOMIC_MANAGER__PLANS:
			return ((InternalEList<?>) getPlans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES:
			return getIdentifies();
		case BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS:
			return getRequests();
		case BasePackageImpl.AUTONOMIC_MANAGER__PLANS:
			return getPlans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES:
			getIdentifies().clear();
			getIdentifies().addAll((Collection<? extends Symptom>) newValue);
			return;
		case BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS:
			getRequests().clear();
			getRequests().addAll((Collection<? extends ChangeRequest>) newValue);
			return;
		case BasePackageImpl.AUTONOMIC_MANAGER__PLANS:
			getPlans().clear();
			getPlans().addAll((Collection<? extends ChangePlan>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES:
			getIdentifies().clear();
			return;
		case BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS:
			getRequests().clear();
			return;
		case BasePackageImpl.AUTONOMIC_MANAGER__PLANS:
			getPlans().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BasePackageImpl.AUTONOMIC_MANAGER__IDENTIFIES:
			return identifies != null && !identifies.isEmpty();
		case BasePackageImpl.AUTONOMIC_MANAGER__REQUESTS:
			return requests != null && !requests.isEmpty();
		case BasePackageImpl.AUTONOMIC_MANAGER__PLANS:
			return plans != null && !plans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AutonomicManagerImpl
