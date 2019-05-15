/**
 */
package base.common.impl;

import base.common.Call;
import base.common.EnqueueCall;
import base.common.ParameterBinding;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enqueue Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.common.impl.EnqueueCallImpl#getCall <em>Call</em>}</li>
 *   <li>{@link base.common.impl.EnqueueCallImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnqueueCallImpl extends ActionImpl implements EnqueueCall {
	/**
	 * The cached value of the '{@link #getCall() <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected Call call;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnqueueCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackageImpl.Literals.ENQUEUE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call getCall() {
		if (call != null && call.eIsProxy()) {
			InternalEObject oldCall = (InternalEObject) call;
			call = (Call) eResolveProxy(oldCall);
			if (call != oldCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackageImpl.ENQUEUE_CALL__CALL,
							oldCall, call));
			}
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call basicGetCall() {
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCall(Call newCall) {
		Call oldCall = call;
		call = newCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackageImpl.ENQUEUE_CALL__CALL, oldCall, call));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this,
					CommonPackageImpl.ENQUEUE_CALL__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommonPackageImpl.ENQUEUE_CALL__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
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
		case CommonPackageImpl.ENQUEUE_CALL__CALL:
			if (resolve)
				return getCall();
			return basicGetCall();
		case CommonPackageImpl.ENQUEUE_CALL__BINDINGS:
			return getBindings();
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
		case CommonPackageImpl.ENQUEUE_CALL__CALL:
			setCall((Call) newValue);
			return;
		case CommonPackageImpl.ENQUEUE_CALL__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends ParameterBinding>) newValue);
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
		case CommonPackageImpl.ENQUEUE_CALL__CALL:
			setCall((Call) null);
			return;
		case CommonPackageImpl.ENQUEUE_CALL__BINDINGS:
			getBindings().clear();
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
		case CommonPackageImpl.ENQUEUE_CALL__CALL:
			return call != null;
		case CommonPackageImpl.ENQUEUE_CALL__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnqueueCallImpl
